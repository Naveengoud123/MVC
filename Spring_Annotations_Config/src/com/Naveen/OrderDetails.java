package com.Naveen;

import java.util.List;

public class OrderDetails {
   private int orderId;
   private List<String> items;
   private double amount;
   private boolean isOrderSuccss;
   private String orderDescription;
   
public int getOrderId() {
	return orderId;
}
public void setOrderId(int orderId) {
	this.orderId = orderId;
}
public List<String> getItems() {
	return items;
}
public void setItems(List<String> items) {
	this.items = items;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
public boolean isOrderSuccss() {
	return isOrderSuccss;
}
public void setOrderSuccss(boolean isOrderSuccss) {
	this.isOrderSuccss = isOrderSuccss;
}
public String getOrderDescription() {
	return orderDescription;
}
public void setOrderDescription(String orderDescription) {
	this.orderDescription = orderDescription;
}
   
	
}
