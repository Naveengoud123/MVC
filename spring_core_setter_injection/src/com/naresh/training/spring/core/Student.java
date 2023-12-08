package com.naresh.training.spring.core;

public class Student {
	
	private String studentName;
	private int studentId;
	private Address address;
	
	public Student() {
		System.out.println("Student Contructor executed.");
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
	
	

}