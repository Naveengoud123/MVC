package com.naresh.setter.injection;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SwiggyApplication {

	public static void main(String[]args) {
		BeanFactory container = new FileSystemXmlApplicationContext
				("C:\\Java Practice\\Spring\\SpringCoreProj01\\spring-beans-two.xml",
						"C:\\Java Practice\\Spring\\SpringCoreProj01\\Spring-beans.Xml");
		Order order = (Order)container.getBean("order1");
		System.out.println(order.getAmount());
		System.out.println(order.getOrderId());
		System.out.println(order.getItems());
		
		System.out.println(order.getItems().size());
		
		//get prices
		System.out.println(order.getPrices());
		
		//map data
		System.out.println(order.getItemPrices());
	}
}
