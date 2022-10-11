package com.av.annotation2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.av.dto.Person;

@Configuration
@ComponentScan(basePackages="com.av")//scan base package
public class MyConfig {
//	public Person getPerson() {
//		return new Person();
		
	
}
