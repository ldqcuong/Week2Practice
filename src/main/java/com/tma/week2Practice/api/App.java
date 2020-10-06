package com.tma.week2Practice.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({ "com.tma.week2Practice.dto" })
@ComponentScan(basePackageClasses = StudentAPI.class)
@SpringBootApplication
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
//		IScore iscore = context.getBean(IScore.class);
//		System.out.println("Instance: " + iscore);
//		System.out.println("String: " + iscore.getString());
//		Student student = context.getBean(Student.class);
//		System.out.println("Student: " + student);
//		System.out.println("Student: " + student.scores);
//		ListStudent students = context.getBean(ListStudent.class);
//		System.out.println("Student: " + students);
//		System.out.println("Student: " + students.students);
	}

}