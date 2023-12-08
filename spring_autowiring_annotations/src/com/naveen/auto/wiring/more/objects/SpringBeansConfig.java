package com.naveen.auto.wiring.more.objects;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.naveen.auto.wiring.more.objects")
@Configuration
public class SpringBeansConfig {

	@Bean("order2")
	public Order createOrder() {
		Order order = new Order();
		order.setAmount(222999);
		return new Order();
	}
}
