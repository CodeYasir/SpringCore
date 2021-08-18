package com.annotation.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;
 
@Component
public class Traveller {

	public static void main(String args[]) {
		
		// define my init method
		
		@PostConstruct
		public void doMyStartupStuff() {
			System.out.println("TennisCoach: inside of doMyStartupStuff()");
		}
		
		// define my destroy method
		
		@PreDestroy
		public void doMyCleanupStuff() {
			System.out.println("TennisCoach: inside of doMyCleanupStuff()");		
		}
	   }
} 
 
