package com.javaconfig.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//Step-1: Create java class as configuration file by @Configuration annotation

@Configuration
@ComponentScan("com.javaconfig.demo") 
public class JavaConfigFile {

}



