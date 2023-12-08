package com.naveen.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBeansConfiguration {
	
    @Bean
	public Empoyee createEmployee() {
		return new Empoyee(100,"Naveen");
	}
    
    @Bean(name="createEmp2")
    public Empoyee getEmpoyee() {
    	return new Empoyee(101,"Bala Koteswara Prasad");
    }
}
