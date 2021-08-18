package com.demo.scope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPrototype{

	public static void main(String args[]) {

        //load the spring configration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextScope.xml");
	   
		//retreive the bean from spring container
		Car c1 = context.getBean("carPrototype",Car.class);
		Car c2 = context.getBean("carPrototype",Car.class);
		
		//using the bean 
		boolean b = (c1==c2);
		System.out.println("Both object refer to same instance: "+b);
		
		System.out.println("Address of both object \n"+c1+"\n "+c2);
		
		//closing container
		context.close();
	}
} 
 
