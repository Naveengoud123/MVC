package com.naveen.auto.wiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	private int empId;
	private String empName;
	private double salary;
	
	@Autowired
	private Address address;
	
	@Autowired
	private Address ofcAddress;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		System.out.println("Address object via Employee class");
		this.address = address;
	}
	public Address getOfcAddress() {
		return ofcAddress;
	}
	
}
