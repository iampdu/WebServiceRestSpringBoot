package com.example.serviceinter;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.model.User;
import com.example.reposit.UserRepository;

@Service
public class ServiceUser {
	
	@Autowired
	UserRepository repository;
	
	public User createUser(User user)
	{
		return repository.save(user);
	}
	
	public List<User>shoAllUser()
	{
	return (List<User>) repository.findAll();	
	}
	

}
