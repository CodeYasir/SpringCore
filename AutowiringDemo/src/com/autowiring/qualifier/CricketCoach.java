package com.autowiring.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// Add component annotation to java classes
// Add Autowiring on constructor

@Component
public class CricketCoach implements Coach {

	@Autowired
	@Qualifier("badFortune")
    Fortune fortune;
    
	@Override
	public String getDailyRoutine() {
		return "Run 500m for warmup";
	}
	@Override
	public String getFortune() {
		return fortune.getDailyFortune();
	}
}
