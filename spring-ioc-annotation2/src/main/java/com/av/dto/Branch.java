package com.av.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Branch {
	
	
	public Address address;
	

//	public void setAddress(Address address) {
//		this.address = address;
//	}
	
	public Branch(@Autowired Address address) {
		super();
		this.address = address;
	}
	public void display()
	{
		System.out.println("Branch address");
	}

}

