package com.Naveen;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfigurationThree {
	@Bean(name= "payment1")
  public Payment getPayment() {
	  return new Payment();
  }
}
