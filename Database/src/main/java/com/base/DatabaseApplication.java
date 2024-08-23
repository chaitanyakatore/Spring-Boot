package com.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.base.bean.Employee;
import com.base.service.EmployeeService;

@SpringBootApplication
public class DatabaseApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DatabaseApplication.class, args);
		EmployeeService es = ctx.getBean(EmployeeService.class);
		es.saveEmployee(new Employee(101, "chaitanya", "clatore@gmail.com"));

		
	}

}
