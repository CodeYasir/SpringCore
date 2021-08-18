package com.javaconfig.property;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestDemo {

	public static void main(String[] args) {
		
		// Step-3: Load the config file
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigFile.class);
		
        // retrieve the beans 
		
		Coach c= context.getBean("cricketCoach", Coach.class);
		
		// use bean in logic
		
		System.out.println(c.getDetails());
		
		// closing context
		
		context.close();
		
	}

}
