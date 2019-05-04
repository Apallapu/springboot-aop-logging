package com.poc.springdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poc.springdemo.aop.LogExecutionTime;
import com.poc.springdemo.model.User;
import com.poc.springdemo.service.Userservice;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	Userservice userservice;

	@GetMapping("/getUser")
	@LogExecutionTime
	public User getUser() {
		return userservice.getUser();

	}

	@PostMapping("/createUser")
	@LogExecutionTime
	public User createUser(@RequestBody User user) {
		return userservice.createUser(user);
	}
}
