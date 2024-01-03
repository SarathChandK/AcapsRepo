package com.details.employee.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	
	public void saveDetails(Employee employee)
	{
		employeeRepo.save(employee);
		
	}
	
	public Employee getEmployee(int id)
	{
		return employeeRepo.findById(id).orElse(null);
	}

}
