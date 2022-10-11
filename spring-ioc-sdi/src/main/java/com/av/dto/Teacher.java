package com.av.dto;

public class Teacher { 
	 int id;
	String name;
	 int salary;
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	 
	public void display()
	{
		System.out.println("Teacher Id:"+id);
		System.out.println("Teacher Name:"+name);
		System.out.println("Teacher salary:"+salary);
	}
	 
	 

}
