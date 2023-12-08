package com.naresh.training.spring.core;

public class Address {

	private String city;
	private int pincode;
	private String country;
	
	public Address(){
		System.out.println("Address instance/constructed ");
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
}
