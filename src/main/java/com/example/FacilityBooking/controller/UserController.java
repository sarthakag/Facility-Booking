package com.example.FacilityBooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.FacilityBooking.entity.User;
import com.example.FacilityBooking.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/users")
	public List<User> getAllUsers()
	{
		return userService.getAllUsers();
	}
	@RequestMapping(method=RequestMethod.POST, value="/users")
	public String addUser(@RequestBody User user) {
		userService.addUser(user);
		String response = "{\"success\": true, \"message\": User has been added successfully.}";
		return response;
	}
	
	

}
