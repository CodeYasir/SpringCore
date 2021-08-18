package com.javaconfig.property;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

// Step-2: Apply value annotation for injection
	
	@Value("${email}")
	private String emailId;
	
	@Value("${name}")
	private String FirstName;
	
	@Override
	public String getDetails() {
		return "Your name: \t"+FirstName+"\t Your email: \t"+emailId;
	}
}


