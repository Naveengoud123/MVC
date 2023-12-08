package com.naresh;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringBeansDemo {

	public static void main(String[] args) {

		// Creation of Container
		// XML config : Provide xml file location
		BeanFactory container = new FileSystemXmlApplicationContext(
				"C:\\Java Practice\\Spring\\SpringCoreProj01\\Spring-beans.Xml");
		// get employye object from container

		Object obj = container.getBean("emp");
		Employee employee = (Employee) obj;

		System.out.println(employee.getEmpId());
		System.out.println(employee.getEmpName());
		
		
		Object obj2 = container.getBean("emp2");
		Employee employee2 = (Employee) obj2;

		System.out.println(employee2.getEmpId());
		System.out.println(employee2.getEmpName());

	}

}