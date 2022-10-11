package com.av.springbootpersonandaadhar.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Person {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private String pass;
	private int age;
	
	@OneToOne
	
	private Aadhar aadhar;
	
	public Aadhar getAadhar() {
		return aadhar;
	}
	public void setAadhar(Aadhar aadhar) {
		this.aadhar = aadhar;
	}
	public int getId() {
	return id;
	}
	public void setId(int id) {
	this.id = id;
	}
	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	public String getEmail() {
	return email;
	}
	public void setEmail(String email) {
	this.email = email;
	}
	public String getPass() {
	return pass;
	}
	public void setPass(String pass) {
	this.pass = pass;
	}
	public int getAge() {
	return age;
	}
	public void setAge(int age) {
	this.age = age;
	}

}
