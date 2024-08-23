package com.ust.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Employee {
	@Value("${eid}")
	private int empid;
	
	@Value("${name}")
	private String name;
	
	@Value("${age}")
	private int age;
	
	@Autowired
	Address address = new Address();
	

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void printEmployee() {
		System.out.println("employee id " + empid);
		System.out.println("employee name " + name);
		System.out.println("employee age " + age);
		System.out.println("address details");
		System.out.println("employee city " + address.getCity());
		System.out.println("employee country " + address.getCountry());
		System.out.println("employee zipCode " + address.getZip());
		
	}
	
	
}
