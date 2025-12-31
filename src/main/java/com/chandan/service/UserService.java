package com.chandan.service;

import java.util.List;

import com.chandan.entity.User;

public interface UserService {
	
	
	User addUser(User user);
	
	User  getByID(Long id);
	
	List<User> getAllUsers();
	
	
	User updateUser(User user,Long id);
	
	void deleteUser(Long id);
	

}
