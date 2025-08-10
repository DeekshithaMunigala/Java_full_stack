package com.wipro.userms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.userms.dto.UserDTO;
import com.wipro.userms.entity.User;
import com.wipro.userms.repo.UserRepo;
import com.wipro.userms.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired 
	UserRepo userRepo;
	
	@Autowired
	NotificationClient notificationClient;
	
	private User convertToEntity(UserDTO dto) {
		User user = new User();
		user.setUserName(dto.getUserName());
		user.setUserPassword(dto.getUserPassword());
		user.setAddress(dto.getAddress());
		
		return user;
	}

	@Override
	public User save(UserDTO userDTO) {
		User user = convertToEntity(userDTO);		
		User savedUser = userRepo.save(user);		
		notificationClient.sendNotification(savedUser, "Created");
		
		return savedUser;
		
	}

	@Override
	public List<User> findAll() {
		
		return userRepo.findAll();
	}

	@Override
	public User findById(Long id) {
		
		return userRepo.findById(id).orElseThrow();
	}

	@Override
	public User updateById(Long id, UserDTO userDTO) {
		User user = userRepo.findById(id).orElseThrow();
		user.setUserName(userDTO.getUserName());
		user.setUserPassword(userDTO.getUserPassword());
		user.setAddress(userDTO.getAddress());
		
		User updateUser = userRepo.save(user);
		
		notificationClient.sendNotification(updateUser, "Updated");
		
		return updateUser;
	}

	@Override
	public void deleteById(Long id) {
		User user = userRepo.findById(id).orElseThrow();
		
		userRepo.deleteById(id);
		
		notificationClient.sendNotification(user, "Deleted");
		
	}

	

}
