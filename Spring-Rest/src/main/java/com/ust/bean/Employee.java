package com.ust.bean;

import java.time.LocalDate;

public class Employee {
	private int empid;
	private String name;
	private LocalDate dob;
	private String email;
	public Employee(int empid, String name, LocalDate dob, String email) {
		super();
		this.empid = empid;
		this.name = name;
		this.dob = dob;
		this.email = email;
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
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
