package com.example.EmployeeInfo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EmployeeInfo.dao.EmployeeDao;
import com.example.EmployeeInfo.model.Employee;

@Service
public class EmployeeImpl implements EmployeeInf //Interface
{
	
	@Autowired
	private EmployeeDao empDao;
		
	
	@Override
	public List<Employee>employeeInfo() {
	
		return empDao.findAll();
	}


	@Override
	public Employee addEmployee(Employee employee) {
	    
		empDao.save(employee);
		return employee;
	}


	@Override
	public Employee updateEmployee(Employee employee) {

		empDao.save(employee);
		return employee;
	}


	@Override
	public Optional<Employee> getEmployee(long EmployeeId) {
		
		//select * from employee where employee_id=EmployeeId;
		Optional<Employee> entity2=empDao.findById(EmployeeId);
		return entity2;
	}


	@Override
	public void deleteEmployee(long employeeId) {
		
		@SuppressWarnings("deprecation")
		Employee entity1= empDao.getOne(employeeId);
		empDao.delete(entity1);
		
	}



}

	