package com.naveen.auto.wiring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SPringAutowiringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(SpringBeanConfig.class);
		context.refresh();
		/*
		 * Address address = context.getBean(Address.class);
		 * System.out.println(address);
		 */
		
		  Employee emp = context.getBean(Employee.class); 
		  emp.setEmpName("Naveen");
		  emp.setEmpId(001);
		  System.out.println(emp.getEmpName());
		  System.out.println(emp.getEmpId());
		  
		  //Address
		  System.out.println(emp.getAddress().getCityName());
		 
		  //ofcAddress
		  System.out.println(emp.getOfcAddress().getPincode());
	}

}
	