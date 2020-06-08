package com.prasanth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prasanth.dao.EmployeeDaoImpl;
import com.prasanth.model.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	EmployeeDaoImpl empdao;
	
	@PostMapping("/add")
	private int saveEmp(@RequestBody Employee emp) 
	{
		empdao.addEmployee(emp);
	return emp.getEmployeeid();
	}
	
	@GetMapping("/get")
	private List<Employee> getAllEmployees() 
	{
		return empdao.getEmployees();
	}
	
	

}
