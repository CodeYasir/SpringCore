package com.javaconfig.property;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

// Step-1: Load property file in config file

@Configuration
@ComponentScan("com.javaconfig.property") 
@PropertySource("classpath:sport.properties")
public class JavaConfigFile {
	
}

