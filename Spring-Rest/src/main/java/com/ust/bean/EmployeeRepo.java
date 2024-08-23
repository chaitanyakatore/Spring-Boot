package com.ust.bean;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;


@Repository
public class EmployeeRepo {
	private List<Employee> li;
	public EmployeeRepo() {
		li = new ArrayList<Employee>();
		li.add(new Employee(1001, "Chaitanya", LocalDate.of(2002, 01, 22), "chaitanya@gmail.com"));
		li.add(new Employee(1001, "Chaitanya", LocalDate.of(2002, 01, 22), "chaitanya@gmail.com"));
        li.add(new Employee(1002, "Aarav", LocalDate.of(1999, 07, 15), "aarav@hotmail.com"));
        li.add(new Employee(1003, "Meera", LocalDate.of(1995, 11, 30), "meera@yahoo.com"));
        li.add(new Employee(1004, "Rahul", LocalDate.of(1988, 03, 10), "rahul@company.com"));
        li.add(new Employee(1005, "Ananya", LocalDate.of(1992, 06, 25), "ananya@gmail.com"));
        li.add(new Employee(1006, "Siddharth", LocalDate.of(1985, 10, 18), "siddharth@gmail.com"));

		
	}

	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return li;
	}
}
