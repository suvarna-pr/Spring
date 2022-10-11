package org.alvas.controller;

import org.alvas.MyConfig;
import org.alvas.dto.Student;
import org.alvas.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentController {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfig.class);
		StudentService student1=(StudentService) applicationContext.getBean("myservice");
		Student student=(Student) applicationContext.getBean("mystudent");
		
		student.setId(101);
		System.out.println(student.getId());
		student.setName("Ram");
		student.setEmail("sitaram@gmail.com");
		
		student1.saveStudent(student);
	}

}
