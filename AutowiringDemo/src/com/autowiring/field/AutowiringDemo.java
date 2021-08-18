package com.autowiring.field;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiringDemo {

	public static void main(String[] args) {
		
		// define the container 
		
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("applicationContextField.xml");

		// retrieve beans from container
		
		Coach c = context.getBean("cricketCoach",Coach.class);
		
		// use beans logic
		
		System.out.println(c.getDailyRoutine());
		System.out.println(c.getFortune());
		
		// closing conext
		
		context.close();
	}

}
