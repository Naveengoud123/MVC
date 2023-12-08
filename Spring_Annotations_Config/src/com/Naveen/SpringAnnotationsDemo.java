package com.Naveen;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAnnotationsDemo {
  public static void main(String args[]) {
	  
	  //container instance created
	  BeanFactory context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
	  
	  //provide configuration classes info to container 
	  PriscriptionDetails details = (PriscriptionDetails) context.getBean("prescription","prescriptionTwo");
	  System.out.println(details);  
	  
	  System.out.println(details.getMedicineId());
	  System.out.println(details.getMedicineName());
	  System.out.println(details.getAmount());
	  
  }
  
}
