package com.naresh.training.spring.core.ci;

public class Customer {
	
	private String userId;
	private int mobile;
	private CustomerAddress address;
	
	public Customer(String userId, int mobile, CustomerAddress address) {
		super();
		this.userId = userId;
		this.mobile = mobile;
		this.address = address;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public CustomerAddress getAddress() {
		return address;
	}
	public void setAddress(CustomerAddress address) {
		this.address = address;
	}
	
	

}