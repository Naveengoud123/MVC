package com.naveen;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Company {

	
	// Verifying Employee Objects and collecting all 
	//Employee Objects and Converted as List of Employee Objects 
	@Autowired
	List<Employee> employee;

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	
}
