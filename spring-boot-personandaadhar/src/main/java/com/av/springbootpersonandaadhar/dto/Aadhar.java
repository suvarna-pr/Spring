package com.av.springbootpersonandaadhar.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.springframework.stereotype.Component;
@Entity
@Component
public class Aadhar {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int id;
	private long no;
	private String fName;
	@OneToOne

	private Person person;
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public int getId() {
	return id;
	}
	public void setId(int id) {
	this.id = id;
	}
	public long getNo() {
	return no;
	}
	public void setNo(long no) {
	this.no = no;
	}
	public String getfName() {
	return fName;
	}
	public void setfName(String fName) {
	this.fName = fName;
	}


	}