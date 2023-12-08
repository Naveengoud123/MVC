package com.dilip.config;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

	// CREATE table Student(sid NUMBER(10) PRIMARY key, sname varchar2(50), age
	// NUMBER(3));

	@Id
	@Column(name = "sid")
	private long studentID;

	@Column(name = "sname")
	private String studentName;
	
	@Column(name = "age")
	private int age;

	public long getStudentID() {
		return studentID;
	}

	public void setStudentID(long studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
