package maccess;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("maccess")
@Configuration
public class BeanConfiguration {

	@Bean("customer2")
	public Customer getCustomer() {
		return new Customer() ;
			
			
			}
		
	}

