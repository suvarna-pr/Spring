package org.alvas.controller;

import org.alvas.MyConfig;
import org.alvas.dto.Student;
import org.alvas.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentDeleController {
	public static void main(String[] args) {
			ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfig.class);
			StudentService student1=(StudentService) applicationContext.getBean("myservice");
			Student student=(Student) applicationContext.getBean("mystudent");
			
			Student s=entityManager.find(Student.class, 1);
			entityTransaction.begin();
			entityManager.remove(student);
			entityTransaction.commit();
			System.out.println("Student data deleted");
	}

}
