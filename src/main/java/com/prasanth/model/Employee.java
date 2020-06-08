package com.prasanth.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity

@Table(name = "employee")
public class Employee {
	@Id

	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "Employeeid")
	private int Employeeid;
	@Column(name = "Employeename")
	private String Employeename;
	public int getEmployeeid() {
		return Employeeid;
	}
	public void setEmployeeid(int employeeid) {
		Employeeid = employeeid;
	}
	public String getEmployeename() {
		return Employeename;
	}
	public void setEmployeename(String employeename) {
		Employeename = employeename;
	}

}


