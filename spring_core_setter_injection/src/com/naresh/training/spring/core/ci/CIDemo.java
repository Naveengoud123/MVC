package com.naresh.training.spring.core.ci;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class CIDemo {

	public static void main(String[] args) {

       
		BeanFactory factory = new FileSystemXmlApplicationContext
        		("C:\\Java Practice\\Spring\\spring_core_setter_injection\\ci-beans.xml");
        
		Employye emp = (Employye) factory.getBean("emp1");
		System.out.println(emp.getEmpId());
		System.out.println(emp.getEmpName());
		System.out.println(emp.getSalary());
		
		Employye emp1 = (Employye) factory.getBean("emp2");
	    System.out.println(emp1.getEmpId());
		System.out.println(emp1.getEmpName());
		System.out.println(emp1.getSalary());

		System.out.println("**********  Order Details *************");
		Order order = (Order) factory.getBean("order1");
		System.out.println(order.getOrderId());
		System.out.println(order.getItems());
		System.out.println(order.getAmount());

		System.out.println("**********  Order Prices *************");

		Order orderPrices = (Order) factory.getBean("orderPrices");
		System.out.println(orderPrices.getPrices());
		System.out.println(orderPrices.getItems());
		System.out.println(orderPrices.getAmount());
		System.out.println(orderPrices.getOrderId());

		System.out.println("***********Customer Data ***************");
		Customer customer = (Customer) factory.getBean("customer1");
		System.out.println(customer.getUserId());
		System.out.println(customer.getMobile());

		// Extract Address obj from Customer
		CustomerAddress address = customer.getAddress();
		System.out.println(address.getArea());
		System.out.println(address.getPincode());
		System.out.println(address.getCity());

		// Extract AreaInfo from Address
		AreaInfo area = address.getAreaInfo();
		System.out.println(area.getFlatName());
		System.out.println(area.getStreetName());
		System.out.println(area.getClass());

	}

}