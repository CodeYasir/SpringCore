package com.autowiring.field;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// Step-1: Add component annotation to java classes
// Step-2: Add Autowiring on fields

@Component
public class CricketCoach implements Coach {

	@Autowired
    Fortune fortune;
    
	@Override
	public String getFortune() {
		return fortune.getDailyFortune();
	}
	
	@Override
	public String getDailyRoutine() {
		return "Run 500m for warmup";
	}
}
