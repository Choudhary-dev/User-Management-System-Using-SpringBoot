package com.chandan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.chandan.entity.User;
import com.chandan.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	
	 @Autowired
	private UserService userService;
	 
	 
	 @PostMapping("/create-user")
	 public ResponseEntity<User> addingUser(@RequestBody User user){ 
		 
		    User savedUser = userService.addUser(user);
		    
		    return new ResponseEntity<>(savedUser,HttpStatus.CREATED);
		 
	 }
	 
	 
	 @GetMapping("{id}")
	 public ResponseEntity<User> getingbyId(@PathVariable Long id){ 
		 
		 User user = userService.getByID(id);
		 
		 return ResponseEntity.ok(user);
	 }
	 
	 
	 @GetMapping
	 public ResponseEntity<List<User>> getingByAll(){ 
		 
		 List<User> list = userService.getAllUsers();
		 
		 
		 return ResponseEntity.ok(list);
	 }
	 
	 
	 @PutMapping("/update/{id}")
	 public ResponseEntity<User>  updateUser(@RequestBody User user,@PathVariable Long id){ 
		 
		
		 
		// User savedUser = userService.updateUser(user);
		 

			return new ResponseEntity<User>(userService.updateUser(user,id),HttpStatus.OK);
		// return new ResponseEntity<>(savedUser,HttpStatus.OK);
		 
		 
	 }
	 
	 
	 @DeleteMapping("/delete/{id}")
	 public ResponseEntity<String>  delUser(@PathVariable Long id){ 
		 
			
		 
		 userService.deleteUser(id);
		 
		
		 return new ResponseEntity<>("user deleted successfull",HttpStatus.OK);
		 
		 
	 }
	 
	 
	 

}
