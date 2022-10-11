package com.av.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.av.dto.Teacher;

public class JeeContainer {
		public static void main(String[] args) {
			ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
			Teacher teacher=(Teacher) applicationContext.getBean("teacher");
			teacher.display();
		}

}
