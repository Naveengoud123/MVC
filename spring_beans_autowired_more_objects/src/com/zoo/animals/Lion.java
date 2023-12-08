package com.zoo.animals;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class Lion implements Animal{
	
	public void getAnimalName() {
		System.out.println("This is Lion..");
	}

}
