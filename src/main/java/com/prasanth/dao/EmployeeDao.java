package com.prasanth.dao;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.prasanth.model.Employee;
@Service
public interface EmployeeDao {
	
	Employee addEmployee(@Validated Employee employee);
	List<Employee> getEmployees();

}
