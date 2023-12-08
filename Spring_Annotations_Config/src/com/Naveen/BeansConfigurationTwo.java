package com.Naveen;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfigurationTwo {
  
	@Bean(name="orderThree")
	public OrderDetails getOrderTwoDetails() {
		return new OrderDetails();
	}
}
