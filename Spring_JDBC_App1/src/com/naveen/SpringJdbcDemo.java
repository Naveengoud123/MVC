package com.naveen;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringJdbcDemo {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		context.register(SpringJdbcConfiguration.class);
		context.refresh();

		EmployeeOperations ops = context.getBean(EmployeeOperations.class);
		
		ops.addEmployee();

	}

}