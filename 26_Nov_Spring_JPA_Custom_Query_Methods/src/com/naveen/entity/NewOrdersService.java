package com.naveen.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NewOrdersService {

	@Autowired
	OrderRepository repository;

	public int addOrderInformation() {
													//int oid, String city, String gender, int noOfItems, int pincode, double price, String state
		int noFoRowsInserted = repository.addOrderInformation(1, "HYD","MALE", 10, 500072, 10000, "TG");
		
		System.out.println("No OF Rows inserted : "+noFoRowsInserted);
		
		return noFoRowsInserted; 
	}

}