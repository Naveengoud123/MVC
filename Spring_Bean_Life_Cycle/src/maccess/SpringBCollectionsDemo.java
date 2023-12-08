package maccess;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringBCollectionsDemo {

	public static void main(String[] args) {

		//Created the Container
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		//Providing Bean Classes Information Container
		context.register(BeanConfiguration.class);
		
		//Create/Instantiate Objects
		context.refresh();
		
		//Closing The Container
		context.close();
	}

}
