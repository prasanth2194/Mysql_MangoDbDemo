package com.prasanth.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prasanth.model.Employee;
import com.prasanth.repository.EmpRepository;
@Service
public class EmployeeDaoImpl implements EmployeeDao {
	@Autowired
	EmpRepository empRepository;

	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return empRepository.save(employee);
	}

	@Override
	public List<Employee> getEmployees() {
		List<Employee>getemp=empRepository.findAll();
		return getemp;
	}

}
