package com.naresh;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringCoreDemo {

	public static void main(String[] args) {
			
		//Creation of Container 
		// XML config : Provide xml file location 
		BeanFactory beanFactory = new FileSystemXmlApplicationContext("D:\\workspaces\\Spring8PM_Oct09_Batch\\spring-core-example\\srping-beans.xml");
		// get employye object from container
		
		// Employye Tyep object 
		 Object obj =   beanFactory.getBean("emp");
		 // Type casting
		 // Your got employye class Object from Spring FW 
		 Employee emp = (Employee)obj;
		 System.out.println(emp.getEmpId());
		 System.out.println(emp.empDetails());
		 
		 
		 // Company Data 
		Company cmp  =  (Company)beanFactory.getBean("naresh");
		cmp.printComapnyDetails();
		 

	}

}