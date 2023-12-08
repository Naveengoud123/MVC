package com.naveen.auto.wiring.more.objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OrderDetails {
  
	private int noOfOrders;
	
	//Ambiguity
	
	//byName : order1 
	@Qualifier("order1")
	@Autowired
	private Order order;
	// order1 Bean Object is injected
	
	public int getNoOfOrders() {
		return noOfOrders;
	}
	public void setNoOfOrders(int noOfOrders) {
		this.noOfOrders = noOfOrders;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	
}
