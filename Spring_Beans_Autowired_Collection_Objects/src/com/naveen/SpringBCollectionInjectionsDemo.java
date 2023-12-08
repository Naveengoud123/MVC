package com.naveen;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringBCollectionInjectionsDemo {

	public static void main(String args[]) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(BeanConfiguration.class);
		context.refresh();
		
		Company company = context.getBean(Company.class);
		
		List<Employee> emp = company.getEmployee();
		
		for(Employee e: emp)
			System.out.println(e);
		
	 
	}
}
