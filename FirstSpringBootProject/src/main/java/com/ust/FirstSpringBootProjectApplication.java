package com.ust;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ust.bean.Address;
import com.ust.bean.Employee;
import com.ust.bean.Hello;

@SpringBootApplication
public class FirstSpringBootProjectApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(FirstSpringBootProjectApplication.class, args);
		
		// Hello h = ctx.getBean(Hello.class);
		// System.out.println(h.sayHello("Chaitanya"));
		
		Employee e = ctx.getBean(Employee.class);
		e.setAddress(new Address());
		e.printEmployee();
		
	}

}
