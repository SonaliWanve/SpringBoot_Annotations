package com.SpringBootAnnotations.SpringBootAnnotations;

import org.springframework.context.annotation.Bean;

public class Address {
	 String city;
	 long  PIN;
	 
	 @Bean("execution")
	 String m1(){
		 return "Hello Guys";
		 
	 }

}
