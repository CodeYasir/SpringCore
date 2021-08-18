package com.demo.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Traveller {

	public static void main(String args[]) {
	
		//load the config file
		   ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationcontextLifecycle.xml");
		   
		//retrieve the bean
		   Car c = context.getBean("myCar",Car.class);
		   
		//perform your logic
		   System.out.println(c.getStart());
		   
		//close context
		   System.out.println(c.getStop());
		   context.close();
		
	   }
} 
 
