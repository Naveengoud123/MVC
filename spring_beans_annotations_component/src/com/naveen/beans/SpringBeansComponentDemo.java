package com.naveen.beans;

import org.jntu.College;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.google.MailServerDetails;
import com.naresh_it.Course;
import com.naresh_it.Trainer;

public class SpringBeansComponentDemo {

	public static void main(String[] args) {
     AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
     context.scan("com.*");
     context.refresh();
     
     System.out.println("****** Class: Employee ******");
     Employee e = context.getBean(Employee.class);
     System.out.println(e);
        
       // Setting values
		e.setEmpId(123);
		e.setEmpName("Naveen");
		
	//Getting values	
     System.out.println(e.getEmpId());
     System.out.println(e.getEmpName());
     
     System.out.println("****** Class: Student ******");
     Student s =(context.getBean(Student.class));
     System.out.println(s);
     
        // Setting values
         s.setId(143);
         s.setName("BALU");
         s.setAvgOfMarks(400.00);
        
     // Getting values    
      System.out.println(s.getId());  
      System.out.println(s.getName());
      System.out.println(s.getAvgOfMarks());
     
     
     
     System.out.println("****** Class: University ******");
     University uni = (context.getBean(University.class));
     
       // Setting values
        uni.setCity("Hyderabad");
        uni.setPincode(500072);
     
        //Getting Values
        System.out.println(uni.getCity());
        System.out.println(uni.getPincode());
        

        System.out.println("****** Class: MailServerDetails ******");
        MailServerDetails msd = (context.getBean(MailServerDetails.class));
        
        //setting values
        msd.setHostName("Naveen");
        msd.setContactMail("Naveen@gmail.com");
        
        //Getting values
        System.out.println(msd.getHostName());
        System.out.println(msd.getContactMail());
        
        
        System.out.println("****** Class: Course ******");
        Course cr =  (context.getBean(Course.class));
        System.out.println(cr.getClass());
        
        System.out.println("****** Class: Trainer ******");
        Trainer tr = (context.getBean(Trainer.class));
        System.out.println(tr.getClass());
        
        System.out.println("****** Class: College ******");
        College cl =  (context.getBean(College.class));
        System.out.println(cl.getClass());

        
 
	}

}
