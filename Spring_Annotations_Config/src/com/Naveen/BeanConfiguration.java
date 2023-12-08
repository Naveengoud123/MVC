package com.Naveen;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
	
	@Bean(name="prescription")
    public PriscriptionDetails CreatePriscriptionDetails(){
    	PriscriptionDetails details = new PriscriptionDetails("paracetmol.....", 1000.00, "A121");
    	
    	return details;
    }
	 @Bean(name="prescriptionTwo")
	public PriscriptionDetails getPriscriptionDetails() {
		PriscriptionDetails details = new PriscriptionDetails("omniGel", 2000.00, "A121");
		return details;
	}
	 
	 @Bean(name="orderOne")
	public OrderDetails getOrderDetails() {
		OrderDetails details = new OrderDetails();
		details.setAmount(20000);
		details.setItems(List.of("Laptop","Iphone15pro"));
		details.setOrderDescription("Amazon Diwali Fest Offers....");
		details.setOrderId(12345);
		details.setOrderSuccss(true);
		return details;
	}
	
	 @Bean(name="orderTwo")
		public OrderDetails getOrderTwoDetails() {
		 return new OrderDetails();
	 }
}
