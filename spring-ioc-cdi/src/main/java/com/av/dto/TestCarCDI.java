package com.av.dto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class TestCarCDI {

	public static void main(String[] args) {
	
				ApplicationContext applicationContext=new ClassPathXmlApplicationContext("MyObject.xml");
				Car car=(Car) applicationContext.getBean("mycar");
				car.playingMusic.play();
	

	}

}
