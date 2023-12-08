package com.naresh;

public class Employee {

	//Properties 
	private int empId;
	private String empName;
	
	public Employee() {
		System.out.println("This is Employee Constructor.. Instance Creating of Employee");
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		System.out.println("Setting Emp Id ");
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		System.out.println("Setting Emp Name ");
		this.empName = empName;
	}

	public String empDetails() {
		return "This is employee class. Spring First example";
	}
}