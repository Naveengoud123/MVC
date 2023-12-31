package com.naveen;

import org.springframework.stereotype.Component;

@Component
public class Employee {
    
	private String name;
	private int id;
	private double salary;
	
	public Employee() {
		System.out.println("Employee Object Created...");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}
	
}
