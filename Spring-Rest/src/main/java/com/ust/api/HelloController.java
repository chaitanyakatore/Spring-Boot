package com.ust.api;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ust.bean.Employee;
import com.ust.bean.EmployeeRepo;

@RestController
public class HelloController {
	
	@Autowired
	private EmployeeRepo repo;
	
	@GetMapping("ust")
	public Employee sayHello() {
		return new Employee(1001, "Chaitanya", LocalDate.of(2002, 8, 05), "ckatore@gmail.com");
	}
	
	@GetMapping("all")
	public List<Employee> sayHello1(){
		return repo.getAll();
	}
}
