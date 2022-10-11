package com.av.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.av.dto.Car;

public class TestSetterObject {

	public static void main(String[] args) {
				ApplicationContext applicationContext=new ClassPathXmlApplicationContext("MyObject.xml");
				Car car=(Car) applicationContext.getBean("mycar");
				car.playingMusic.play();

	}

}
