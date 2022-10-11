package com.av.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.av.annotation2.MyConfig;
import com.av.dto.Person;

public class TestPerson {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfig.class);
		Person e=(Person) applicationContext.getBean("per");
		e.details();
	}

}
