package com.wipro.userms.service;

import java.util.List;

import com.wipro.userms.dto.UserDTO;
import com.wipro.userms.entity.User;

public interface UserService {
	User save(UserDTO userDTO);
	List<User> findAll();
	User findById(Long id);
	User updateById(Long id, UserDTO userDTO);
	void deleteById(Long id);
}
