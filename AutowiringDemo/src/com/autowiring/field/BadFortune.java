package com.autowiring.field;

import org.springframework.stereotype.Component;

// Add component annotation to java classes

@Component
public class BadFortune implements Fortune {

	@Override
	public String getDailyFortune() {
		return "Today is the bad day";
	}

}
