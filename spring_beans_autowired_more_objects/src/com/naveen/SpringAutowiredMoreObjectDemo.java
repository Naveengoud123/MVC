package com.naveen;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAutowiredMoreObjectDemo {

	public static void main(String args[]) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(BeansConfiguration.class);
		context.refresh();
		
		Company company = context.getBean(Company.class);
		System.out.println(company);
		//company.setCompanyName("Mondee.Tech");
		System.out.println(company.getEmployee().getId());
		System.out.println(company.getClass());
		
		
		System.out.println("******** Orgnization Data *********");
		Organization org = context.getBean(Organization.class);
		System.out.println(org.getEmp().getId());
		System.out.println(org.getClass());
		
	}
}
