package com.chandan.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chandan.entity.User;
import com.chandan.repository.UserRepository;
import com.chandan.service.UserService;

@Service
public class UserServiceImpl  implements UserService{

	
	@Autowired
	private UserRepository userRepo;
	
	
    @Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		
		  return userRepo.save(user);
		  
	}


	@Override
	public User getByID(Long id) {
		// TODO Auto-generated method stub
		Optional<User> user =  userRepo.findById(id);
		
		return user.get();
		
	}


	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}


	@Override
	public User updateUser(User user,Long id) {
		// TODO Auto-generated method stub
		
		Optional<User> existingUser = userRepo.findById(id);
		User savedUser=null;
		
		if(existingUser.isPresent()) { 
			
			   savedUser = existingUser.get();
			  savedUser.setFirstName(user.getFirstName());
			  savedUser.setLastName(user.getLastName());
			  savedUser.setEmail(user.getEmail());
			  
			 userRepo.save(savedUser);
			 return savedUser;
			
		}else { 
			
			
			
		}
		return null;
	}


	@Override
	public void deleteUser(Long id) {
		// TODO Auto-generated method stub
		
		userRepo.deleteById(id);
		
	}

}
