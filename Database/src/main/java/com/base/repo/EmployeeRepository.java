package com.base.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.base.bean.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
