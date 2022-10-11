package com.av.springbooksimple1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.core.joran.conditional.ElseAction;
@RestController
public class Demo {
	@GetMapping("helo")
	public String getData()
	{
		return "Hii ISE";
	}
	
	@GetMapping("/getstudent")
	public Student getStudent()
	{
		Student student=new Student();
		student.setId(1);
		student.setName("Anu");
		student.setAge(21);
		
		return student;
	}
	
	@PostMapping("/savestudent")
	public String saveStudent(@RequestBody Student student){   
		
		//@RequestBody:catching object from Front End or Postman
		if(student!=null){
		System.out.println("Student Id:"+student.getId());
		System.out.println("Student Name:"+student.getName());
		System.out.println("Student Age:"+student.getAge());
		return "Student data";
		
	}
	else{
		return null;

	}	
	}
	
	
}
