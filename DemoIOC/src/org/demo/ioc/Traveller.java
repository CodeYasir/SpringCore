package org.demo.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Traveller{

	public static void main(String args[]) {

        //load the spring configration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextIOC.xml");
	   
		//retreive the bean from spring container
		Vehicle thevehicle = context.getBean("myCar",Vehicle.class);
		
		//using the bean 
		System.out.println(thevehicle.move());
		
		//closing container
		context.close();
	}
} 
 
