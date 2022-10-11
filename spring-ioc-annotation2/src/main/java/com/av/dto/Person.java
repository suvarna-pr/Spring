package com.av.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="per")
public class Person {
	@Autowired
	Aadhar aadhar;
	public void details()
	{
		System.out.println("Jeevitha");
		aadhar.number();
	}

}
