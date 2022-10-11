package com.av.dto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
		Person person=(Person) applicationContext.getBean("person");
		person.savePerson(1, "Shivani", 21);
		person.getPerson();
		
	}

}
