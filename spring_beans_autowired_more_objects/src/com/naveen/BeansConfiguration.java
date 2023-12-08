package com.naveen;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@ComponentScan("com.naveen")
@Configuration
public class BeansConfiguration {

	 @Primary
	@Bean("emp2")
	public Employee employeeTwo() {
		
		
		Employee emp = new Employee();
		emp.setId(2);
		emp.setName("MANI 2");
		return emp;
		
	}
	@Primary
	//default object should inject of Employee Class when there is no  @Qualifier
	
	@Bean("emp3")
	public Employee employeeThree() {
		
		Employee emp = new Employee();
		emp.setId(3);
		emp.setName("Krithvik 3");
		return emp;
	}
	
	
}
