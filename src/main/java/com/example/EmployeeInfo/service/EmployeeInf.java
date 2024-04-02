package com.example.EmployeeInfo.service;

import java.util.List;
import java.util.Optional;

import com.example.EmployeeInfo.model.Employee;

public interface EmployeeInf {

	List<Employee> employeeInfo();

	public Optional<Employee> getEmployee(long EmployeeId);
	
	public Employee addEmployee(Employee employee);

	Employee updateEmployee(Employee employee);

	void deleteEmployee(long employeeId);
	

}