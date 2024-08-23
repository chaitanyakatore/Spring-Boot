package com.base.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.base.bean.Employee;
import com.base.repo.EmployeeRepository;

@Component
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository repo;
	
	
	public void saveEmployee(Employee emp) {
		repo.saveAndFlush(emp);
		System.out.println("employee saved");
	}

}
