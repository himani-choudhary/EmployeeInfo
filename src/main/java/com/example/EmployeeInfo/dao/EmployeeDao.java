package com.example.EmployeeInfo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EmployeeInfo.model.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Long> {

}
