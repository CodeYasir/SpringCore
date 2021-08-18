package com.annotation.component;

import org.springframework.stereotype.Component;

// Step-2: Add component annotation to java classes

@Component("getCoach")
public class CricketCoach implements Coach {

	@Override
	public String getDailyRoutine() {
		return "Run 500m for warmup";
	}

}
