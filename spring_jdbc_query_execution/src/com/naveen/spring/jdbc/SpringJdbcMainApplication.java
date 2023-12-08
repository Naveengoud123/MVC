package com.naveen.spring.jdbc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringJdbcMainApplication {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext();
		
		context.register(SpringJdbcConfiguration.class);
		context.refresh();
		
		
		ProductOperations ops = context.getBean(ProductOperations.class);
		ops.addProduct();
		
		ops.deleteProduct(1);
		
		ops.addProductsWithDynamicData(2, "Lenevo", 70000);
		
		ops.getAllProductAsListOfObjects();
		
		ops.getAllProductNames();
		

	}

}