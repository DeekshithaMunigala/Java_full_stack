package com.wipro.userservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wipro.userservice.dto.UserDTO;
import com.wipro.userservice.entity.User;
import com.wipro.userservice.exception.ResourceNotFoundException;
import com.wipro.userservice.repo.UserRepository;
import com.wipro.userservice.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService,UserDetailsService {
	
		@Autowired
	    private UserRepository userRepository;
	    
	    @Autowired
	    private PasswordEncoder passwordEncoder;
	    
	    @Override
	    public User registerUser(UserDTO userDTO) {
	        if (userRepository.existsByUsername(userDTO.getUsername())) {
	            throw new RuntimeException("Username is already taken");
	        }
	        
	        if (userRepository.existsByEmail(userDTO.getEmail())) {
	            throw new RuntimeException("Email is already in use");
	        }
	        
	        User user = new User();
	        user.setUsername(userDTO.getUsername());
	        user.setEmail(userDTO.getEmail());
	        user.setPassword(passwordEncoder.encode(userDTO.getPassword()));
	        user.setAddress(userDTO.getAddress());
	        user.setRole(userDTO.getRole() != null ? userDTO.getRole() : User.Role.CUSTOMER);
	        
	        return userRepository.save(user);
	    }
	    
	    @Override
	    public User updateUser(Long id, UserDTO userDTO) {
	        User existingUser = userRepository.findById(id)
	                .orElseThrow(() -> new ResourceNotFoundException("User not found with id: " + id));
	        
	        if (userDTO.getEmail() != null && !userDTO.getEmail().equals(existingUser.getEmail())) {
	            if (userRepository.existsByEmail(userDTO.getEmail())) {
	                throw new RuntimeException("Email is already in use");
	            }
	            existingUser.setEmail(userDTO.getEmail());
	        }
	        
	        if (userDTO.getAddress() != null) {
	            existingUser.setAddress(userDTO.getAddress());
	        }
	        
	        return userRepository.save(existingUser);
	    }
	    
	    @Override
	    public void deleteUser(Long id) {
	        User user = userRepository.findById(id)
	                .orElseThrow(() -> new ResourceNotFoundException("User not found with id: " + id));
	        userRepository.delete(user);
	    }
	    
	    @Override
	    public List<User> getAllUsers() {
	        return userRepository.findAll();
	    }
	    
	    @Override
	    public User getUserById(Long id) {
	        return userRepository.findById(id)
	                .orElseThrow(() -> new ResourceNotFoundException("User not found with id: " + id));
	    }
	    
	    @Override
	    public User getUserByUsername(String username) {
	        return userRepository.findByUsername(username)
	                .orElseThrow(() -> new ResourceNotFoundException("User not found with username: " + username));
	    }
	    
	    @Override
	    public User login(String username, String password) {
	        User user = getUserByUsername(username);
	        if (!passwordEncoder.matches(password, user.getPassword())) {
	            throw new RuntimeException("Invalid password");
	        }
	        return user;
	    }

		@Override
		public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
			User user = userRepository.findByUsername(username)
	                .orElseThrow(() -> new UsernameNotFoundException("User not found"));

	        return org.springframework.security.core.userdetails.User
	                .withUsername(user.getUsername())
	                .password(user.getPassword())
	                .authorities(user.getRole().name())
	                .build();
			
		}
	
	

}
