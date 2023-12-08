package com.naveen.beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringBeanTest {
  
	public static void main(String args[]) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(SpringBeansConfiguration.class);
		context.refresh();
		
	   //Use Case : 1 : No Bean Name Provided
		Empoyee emp =context.getBean("createEmployee",Empoyee.class);
		System.out.println(emp);
		System.out.println(emp.getEmpId());
		System.out.println(emp.getEmpName());
		
		System.out.println();
		System.out.println("***** This Object is created by Employee Class ****** " );
		//Only one Object available : Employee
		Empoyee emp2 = (Empoyee) context.getBean("createEmp2");
		System.out.println(emp2);
		System.out.println(emp2.getEmpId());
		System.out.println(emp2.getEmpName());
				
		
	}
}
