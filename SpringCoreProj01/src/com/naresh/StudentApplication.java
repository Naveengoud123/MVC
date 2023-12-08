package com.naresh;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class StudentApplication {
@SuppressWarnings("resource")
public static void main(String[]args) {
	 BeanFactory Container = new FileSystemXmlApplicationContext
			 ("C:\\Java Practice\\Spring\\SpringCoreProj01\\Spring-beans.Xml");
	 
	 //get employee object from container
	 Student student=(Student)Container.getBean("student1");
	 
	 System.out.println(student.getStudentId());
	 System.out.println(student.getAvgOfMarks());
	 System.out.println(student.getStudentName());
	 System.out.println(student.isSelected());
	 System.out.println(student.getgender());
 }
}
