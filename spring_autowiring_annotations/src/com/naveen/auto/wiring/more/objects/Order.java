package com.naveen.auto.wiring.more.objects;

import org.springframework.stereotype.Component;

@Component("order1")
public class Order {

	private int orderId;
	private double amount;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
}
