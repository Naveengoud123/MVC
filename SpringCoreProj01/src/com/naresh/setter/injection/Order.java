package com.naresh.setter.injection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Order {

	private int OrderId;
	private String amount;
	private List<String> items;
	private Set<Double> prices;
	private Map<String,Double> itemPrices;
	
	public int getOrderId() {
		return OrderId;
	}
	public void setOrderId(int orderId) {
		OrderId = orderId;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public List<String> getItems() {
		return items;
	}
	public void setItems(List<String> items) {
		this.items = items;
	}
	public Set<Double> getPrices() {
		return prices;
	}
	public void setPrices(Set<Double> prices) {
		this.prices = prices;
	}
	public Map<String, Double> getItemPrices() {
		return itemPrices;
	}
	public void setItemPrices(Map<String, Double> itemPrices) {
		this.itemPrices = itemPrices;
	}
	
}
