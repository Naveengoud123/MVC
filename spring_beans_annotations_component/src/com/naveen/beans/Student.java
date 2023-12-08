package com.naveen.beans;

import org.springframework.stereotype.Component;

@Component
public class Student {
  private String name;
  private int id;
  private double avgOfMarks;
  
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
public double getAvgOfMarks() {
	return avgOfMarks;
}
public void setAvgOfMarks(double avgOfMarks) {
	this.avgOfMarks = avgOfMarks;
}
  
}
