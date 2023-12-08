package com.naveen;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringBeanScopesApp {

	public static void main(String args[]) {
		BeanFactory factory = new FileSystemXmlApplicationContext
				("C:\\Java Practice\\Spring\\spring_beans_scopes\\beans.xml");
		
		// Requesting Bean Object 1st time with bean ID home
		System.out.println("************* Bean Id = home **************");
		Address address = (Address) factory.getBean("home");
		System.out.println(address);
		System.out.println(address.getCity());
		System.out.println(address.getPincode());
		
		// Requesting Bean Object 2nd time with bean ID home
		// Getting/requesting container with same bean ID of Address
		Address address2 = (Address)factory.getBean("home");
		System.out.println(address2);
		System.out.println(address2.getCity());
		System.out.println(address2.getPincode());
		
		// Requesting Bean Object 3rd time with bean ID home
		// Getting/requesting container with same bean ID of Address
		Address address3 = (Address)factory.getBean("home");
		System.out.println(address3);
		System.out.println(address3.getCity());
		System.out.println(address3.getPincode());
		
		System.out.println("************* Bean Id = office **************");
		
		// 1st time with bean Id = office
		Address address4 = (Address)factory.getBean("office");
		System.out.println(address4);
		System.out.println(address4.getCity());
		System.out.println(address4.getPincode());
		
		// 2nd time with bean Id = office
		Address address5 = (Address)factory.getBean("office");
		System.out.println(address5);
		System.out.println(address5.getCity());
		System.out.println(address5.getPincode());
		
		System.out.println("******** Scope:Prototype ********");
		// 1st time requesting Bean object with Bean Id product1 of Product class
		Product p1 = (Product) factory.getBean("product1");
		System.out.println(p1);
		
		// 1st time requesting Bean object with Bean Id product1 of Product class
		Product p2 = (Product) factory.getBean("product2");
		System.out.println(p2);
		
		System.out.println("*********** Bean Id = 'product1'  references ***********");
		System.out.println((Product) factory.getBean("product1"));
		System.out.println((Product) factory.getBean("product1"));
		System.out.println((Product) factory.getBean("product1"));
		System.out.println((Product) factory.getBean("product1"));
		System.out.println((Product) factory.getBean("product1"));
		
		System.out.println("*********** 'product2' Bean Object refernces ************");
		// 1st time requesting Bean object with Bean Id product2 of Product class
		System.out.println((Product) factory.getBean("product2"));
		System.out.println((Product) factory.getBean("product2"));
		System.out.println((Product) factory.getBean("product2"));
		System.out.println((Product) factory.getBean("product2"));

				
		
	}
}
