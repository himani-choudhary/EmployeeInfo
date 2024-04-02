package com.example.EmployeeInfo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {

	@Id
	private long EmployeeId;
	private String EmployeeName;
	private String EmployeeCity;
	private String EmployeeDesignation;
	private int EmployeeSalary;
	
	
	
	//super Class constructor must be called before executing own constructor
	public Employee() {
		super();
	}
	
	
	//Constructor to save to the database
	public Employee(String employeeName, long employeeId, String employeeCity, String employeeDesignation,
			int employeeSalary)
	{
		super();
		EmployeeName = employeeName;
		EmployeeId = employeeId;
		EmployeeCity = employeeCity;
		EmployeeDesignation = employeeDesignation;
		EmployeeSalary = employeeSalary;
	}
	
	
	//Getter & Setter to initialize the variables
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public long getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(long employeeId) {
		EmployeeId = employeeId;
	}
	public String getEmployeeCity() {
		return EmployeeCity;
	}
	public void setEmployeeCity(String employeeCity) {
		EmployeeCity = employeeCity;
	}
	public String getEmployeeDesignation() {
		return EmployeeDesignation;
	}
	public void setEmployeeDesignation(String employeeDesignation) {
		EmployeeDesignation = employeeDesignation;
	}
	public int getEmployeeSalary() {
		return EmployeeSalary;
	}
	public void setEmployeeSalary(int employeeSalary) {
		EmployeeSalary = employeeSalary;
	}


	
	
	
	
}