package com.naveen.auto.wiring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.naveen.auto.wiring")
@Configuration
public class SpringBeanConfig {

	@Bean 
	public Address getAddress() {
		Address add = new Address();
		add.setCityName("Hyderabad");
		add.setPincode(500072);
		
		return add;
	}
}
