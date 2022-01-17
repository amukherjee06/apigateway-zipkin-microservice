package com.arnab.microservice.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arnab.microservice.department.entity.Department;
import com.arnab.microservice.department.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository deptRepository;

	public Department saveDepartment(Department department) {
		log.info("Inside saveDepartment method of Department Service");
		return deptRepository.save(department);
	}

	public Department findDepartmentById(Long departmentId) {
		log.info("Inside findDepartmentById method of DepartmentService");
		return deptRepository.findByDepartmentId(departmentId);
	}


}
