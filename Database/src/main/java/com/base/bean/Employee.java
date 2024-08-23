package com.base.bean;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "emptable")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "employee_id")
	private int empid;
	@Column(name = "full_name")
	private String name;
	private String email;


	public Employee(int empid, String name, String email) {
		super();
		this.empid = empid;
		this.name = name;
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
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}



	public void printEmployee() {
		System.out.println("employee id " + empid);
		System.out.println("employee name " + name);
		System.out.println("employee email " + email);
		System.out.println("address details");
	
		
	}
	
	
}

