package com.arnab.microservice.user.userservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.arnab.microservice.user.userservice.entity.User;
import com.arnab.microservice.user.userservice.repository.UserRepository;
import com.arnab.microservice.user.userservice.value.object.Department;
import com.arnab.microservice.user.userservice.value.object.ResponseTemplateVO;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RestTemplate restTemplate;

	public User saveUser(User user) {
		log.info("Inside saveUser method of User Service");
		return userRepository.save(user);
	}

	public ResponseTemplateVO findUserWithDepartment(Long userId) {
		log.info("Inside findUserWithDepartment method of User Service");
		ResponseTemplateVO response=new ResponseTemplateVO();	
		User user=userRepository.findByUserId(userId);
		Department department=restTemplate
				.getForObject("http://DEPARTMENT-SERVICE/departments/findById/"+user.getDepartmentId(), Department.class);
		response.setUser(user);
		response.setDepartment(department);
		
		return response;
	}

}
