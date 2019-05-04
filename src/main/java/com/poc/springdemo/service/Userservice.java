package com.poc.springdemo.service;

import org.springframework.stereotype.Service;

import com.poc.springdemo.aop.LogExecutionTime;
import com.poc.springdemo.model.User;

@Service
public class Userservice {
	 @LogExecutionTime
	public User getUser() {
		User user = new User();
		user.setUserId(12);
		user.setName("ankam");
		return user;
	}
	 @LogExecutionTime
	public User createUser(User user) {

		return user;
	}

}
