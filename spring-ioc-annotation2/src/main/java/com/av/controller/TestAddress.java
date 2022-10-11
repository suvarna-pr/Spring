package com.av.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.av.annotation2.MyConfig;

import com.av.dto.Branch;

public class TestAddress {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfig.class);
		Branch b=(Branch) applicationContext.getBean("branch");
		b.address.display();
		
		
	}

}
