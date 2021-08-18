package com.javaconfig.beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestDemo {

	public static void main(String[] args) {
		
		// Step-3: Load the config file
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigFile.class);
		
        // Step-4: retrieve the beans 
		
		Coach c= context.getBean("getCricketCoach", Coach.class);
		
		// use bean in logic
		
		System.out.println(c.getDailyWorkout());
		
		// closing context
		
		context.close();
		
	}

}
