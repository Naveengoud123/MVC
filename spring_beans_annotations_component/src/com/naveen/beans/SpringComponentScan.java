package com.naveen.beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

 public class SpringComponentScan {
 
     public static void main(String args[]) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(SpringBeansConfiguration.class);
		context.refresh();
		
		
	}
}
