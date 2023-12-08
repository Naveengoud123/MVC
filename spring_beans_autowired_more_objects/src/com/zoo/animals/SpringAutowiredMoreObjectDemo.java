package com.zoo.animals;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAutowiredMoreObjectDemo {
  
	public static void main(String args[]) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(AnimalBeansConfiguration.class);
		context.refresh();
		
		Zoo zoo = context.getBean(Zoo.class);
		Animal animal = zoo.getAnimal();
		animal.getAnimalName();
	}
}
