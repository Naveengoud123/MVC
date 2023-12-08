package com.naresh.training.spring.core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringSetterInjectionDemo {

	public static void main(String[] args) {

		BeanFactory factory = new FileSystemXmlApplicationContext(
				"C:\\Java Practice\\Spring\\spring_core_setter_injection\\spring-beans.xml");

		/*Address add1 = (Address) factory.getBean("address1");
		System.out.println(add1.getCity());
		System.out.println(add1.getCountry());
		System.out.println(add1.getPincode());  */
		
		
		System.out.println("************  Student Data *********");
		Student stu1 =  (Student) factory.getBean("student1");
		System.out.println(stu1.getStudentId());
		System.out.println(stu1.getStudentName());
		
		Address stu1Address = stu1.getAddress();
		System.out.println(stu1Address);
		
		System.out.println(stu1Address.getCity());
		System.out.println(stu1Address.getCountry());
		System.out.println(stu1Address.getPincode());
		
		Student stu2 =  (Student) factory.getBean("student2");
		System.out.println(stu2.getStudentId());
		System.out.println(stu2.getStudentName());
		System.out.println(stu2.getAddress().getCity());
		System.out.println(stu2.getAddress().getCountry());
		System.out.println(stu2.getAddress().getPincode());
		
		Student stu3 =  (Student) factory.getBean("student3");
		System.out.println(stu3.getStudentId());
		System.out.println(stu3.getStudentName());
		System.out.println(stu3.getAddress().getCity());
		System.out.println(stu3.getAddress().getCountry());
		System.out.println(stu3.getAddress().getPincode());
		
		Student stu4 =  (Student) factory.getBean("student4");
		System.out.println(stu4.getStudentId());
		System.out.println(stu4.getStudentName());
		stu4.getAddress().setCity("Kolakat");
		System.out.println(stu4.getAddress().getCity());
		System.out.println(stu4.getAddress().getCountry());
		System.out.println(stu4.getAddress().getPincode());
		
			
	}

}