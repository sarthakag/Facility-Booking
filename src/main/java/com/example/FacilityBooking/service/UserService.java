package com.example.FacilityBooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FacilityBooking.entity.User;
import com.example.FacilityBooking.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	
	public List<User> getAllUsers()
	{
		return (List<User>) this.userRepository.findAll();
	}
	public void addUser(User user)
	{
		this.userRepository.save(user);
	}
	

}
