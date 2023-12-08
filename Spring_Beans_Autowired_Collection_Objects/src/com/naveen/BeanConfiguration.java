package com.naveen;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.naveen")
@Configuration
public class BeanConfiguration {

	public Employee getEmployee() {
		Employee e = new Employee();
		e.setId(1);
		e.setName("Naveen");
		e.setSalary(10000.00);
		return e;
	}
}
