package com.av.dto;

public class Student {
	int id;
	String name;
	int age;
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public void display()
	{
		System.out.println("Student Id:"+id);
		System.out.println("Student Name:"+name);
		System.out.println("Student Age:"+age);
	}
}
