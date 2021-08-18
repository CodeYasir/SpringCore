package com.javaconfig.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

	@Autowired
	Fortune fortune;
	
	@Override
	public String getDailyWorkout() {
		
		return "Run 500m for  warmup";
	}

	@Override
	public String getDailyFortune() {
		return fortune.getDailyFortune();
	}

}
