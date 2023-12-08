package maccess;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringAutoWiring {

	public static void main(String[] args) {
		
      BeanFactory factory = new FileSystemXmlApplicationContext
    		  ("C:\\Java Practice\\Spring\\Spring_Bean_AutoWiring\\beans.xml");
      AccountDetails details = (AccountDetails) factory.getBean("accountTwo");
      System.out.println(details.getAccountNumber());
      System.out.println(details.getBalance());
      System.out.println(details.getName());
      System.out.println(details.getAbc().getCity());
		System.out.println(details.getAbc().getPinCode());
		
		
	}

}
