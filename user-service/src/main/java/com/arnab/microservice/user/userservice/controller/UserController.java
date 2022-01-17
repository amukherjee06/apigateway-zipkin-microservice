package com.arnab.microservice.user.userservice.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arnab.microservice.user.userservice.entity.User;
import com.arnab.microservice.user.userservice.service.UserService;
import com.arnab.microservice.user.userservice.value.object.ResponseTemplateVO;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/saveUser")
	public User saveUser(@RequestBody User user) {
		log.info("Inside saveUser method of User Controller");
		return userService.saveUser(user);
	}
	
	@GetMapping("/findById/{id}")
	public ResponseTemplateVO findUserWithDepartment(@PathVariable("id") Long userId) {
		log.info("Inside findUserWithDepartment method of User Controller");
		return userService.findUserWithDepartment(userId);
	}

}
