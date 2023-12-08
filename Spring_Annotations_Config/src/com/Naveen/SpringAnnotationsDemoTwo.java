package com.Naveen;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAnnotationsDemoTwo {
   public static void main(String args[]) {
	   //container instance created
	   AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
	   context.register(BeanConfiguration.class,BeansConfigurationTwo.class);
	   context.register(BeansConfigurationThree.class);
	   context.refresh();
	   
	   //Get bean Object
	   PriscriptionDetails details = (PriscriptionDetails)context.getBean("prescription");
	   System.out.println(details);
	   
	   //Get bean Object
	   PriscriptionDetails prescriptionTwo = (PriscriptionDetails)context.getBean("prescriptionTwo");
	   System.out.println(prescriptionTwo);
	   
	   //get Order Object 
	   System.out.println("***** Getting Order Object ****");
	   OrderDetails orderDetails = (OrderDetails) context.getBean("orderOne");
	   System.out.println(orderDetails.getAmount());
	   System.out.println(orderDetails.getOrderId());
	   System.out.println(orderDetails.getOrderDescription());
	   System.out.println(orderDetails.getClass());
	   
	   
	   OrderDetails orderDetailsTwo = (OrderDetails) context.getBean("orderTwo");
	   System.out.println(orderDetailsTwo);
	   
	   OrderDetails  orderDetailsThree = (OrderDetails) context.getBean("orderThree");
	   System.out.println(orderDetailsThree);
	   



   }
   
}
