package maccess;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Customer implements InitializingBean, DisposableBean {

	private int customerId;
	private String name;

	public Customer() {
		System.out.println("Customer Objetc is Created");
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("This is Init logic from afterPropertiesSet()");
		System.err.println("Initilizing Database connection Details ");
		System.err.println("Opning Streams  ");
	}

	@Override
	public void destroy() throws Exception {

		System.out.println("This is destroy logic from destroy()");
		System.err.println("CLosing Database connection Details ");
		System.err.println("Closing Streams  ");
		
	}

}