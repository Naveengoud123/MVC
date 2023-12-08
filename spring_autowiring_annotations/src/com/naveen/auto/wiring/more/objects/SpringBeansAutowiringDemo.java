package com.naveen.auto.wiring.more.objects;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringBeansAutowiringDemo {

	public static void main(String args[]) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(SpringBeansConfig.class);
		context.refresh();
		
		OrderDetails orderDetails = context.getBean(OrderDetails.class);
		System.out.println(orderDetails);
		Order order = orderDetails.getOrder();
		
		order.setAmount(50000.00);
		order.setOrderId(123);
		System.out.println(order.getAmount());
		System.out.println(order.getOrderId());
	}
}
