package com.naresh.training.spring.core.ci;

public class Employye {

	private int empId;
	private String empName;
	private double salary;

	public Employye(int empId, String empName, double salary) {
		super();
		System.out.println("Params COnstructor called");
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}

	public Employye(int empId, String empName) {
		super();
		System.out.println("2 Params COnstructor called");
		this.empId = empId;
		this.empName = empName;

	}
	
	public Employye() {
		System.out.println("Default constructor executed");
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		System.out.println("Set Emp Id method called");
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		System.out.println("Set Emp Name method called");
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		System.out.println("Set Emp Saalry method called");
		this.salary = salary;
	}

}