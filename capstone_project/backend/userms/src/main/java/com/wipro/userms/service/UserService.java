package com.wipro.userms.service;

import java.util.List;

import com.wipro.userms.dto.UserDTO;
import com.wipro.userms.entity.User;

public interface UserService {
	User registerUser(UserDTO userDTO);
    User updateUser(Long id, UserDTO userDTO);
    void deleteUser(Long id);
    List<User> getAllUsers();
    User getUserById(Long id);
    User getUserByUsername(String username);
    User login(String username, String password);
}
