package com.naveen.entity;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.naveen.config.JPAConfiguration;

public class SpringCustomQueryMethods {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(JPAConfiguration.class);
		context.refresh();
		
		
		OrderService service = context.getBean(OrderService.class);
		System.out.println("****** add orders *****");
		//service.addOrders();
		
		System.out.println("***** getOrdersByCityName ****** ");
		service.getOrdersByCityName("HYD");
		System.out.println();
		
		System.out.println("***** getOrdersByItemsCount *****");
		service.getOrdersByItemsCount(10);
		System.out.println();
		
		System.out.println("***** getDataByCityAndGender ****** ");
		service.getDataByCityAndGender();
		System.out.println();
		
		System.out.println("***** getDataByCityOrGender ****** ");
		service.getDataByCityOrGender();
		System.out.println();
		
		System.out.println("***** getOrders ****** ");
		service.getOrders();
		System.out.println();
		
		System.out.println("***** ordersWithCityOrGender ****");
		service.ordersWithCityOrGender();
		System.out.println();


		// ************** New Service Classs

		NewOrdersService newService = context.getBean(NewOrdersService.class);
		newService.addOrderInformation();
	}

}