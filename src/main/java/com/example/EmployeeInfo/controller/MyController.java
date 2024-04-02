package com.example.EmployeeInfo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmployeeInfo.model.Employee;
import com.example.EmployeeInfo.service.EmployeeInf;

@RestController
public class MyController {
	
	@Autowired
	EmployeeInf emp; 
	
	
	@GetMapping("/employee")
	public List<Employee> getEmployeeInfo() {
		return emp.employeeInfo();	
		
	}
	
	@GetMapping("/employee/{EmployeeId}")
	public Optional<Employee> getEmployee(@PathVariable long EmployeeId )
	{
		return this.emp.getEmployee(EmployeeId);	
	
	}
	
	@PostMapping("/AddEmployeeInfo")
	public Employee addEmployee(@RequestBody Employee employee)
	{
		return this.emp.addEmployee(employee);
		
	}
	
	@PutMapping("/UpdateEmployeeInfo")
	public Employee updateEmployee(@RequestBody Employee employee)
	{
		return this.emp.updateEmployee(employee);
	}
	
	@DeleteMapping("/DeleteEmployeeInfo/{EmployeeId}")
	public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable long EmployeeId)
	{
		try {
			this.emp.deleteEmployee(EmployeeId);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch (Exception e){
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}	
	}
}
