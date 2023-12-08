package com.naveen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Company {

	private String companyName;
	
	
	//Scanaration : No Qualifier
	// inject one Employee object out more always by default : "emp1" 
	
	@Autowired
	@Qualifier("emp2")
	private Employee employee;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
	
}
