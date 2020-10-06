package com.tma.week2Practice.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.tma.week2Practice.controller.ListStudentAPI;
import com.tma.week2Practice.controller.StudentAPI;

@ComponentScan({ "com.tma.week2Practice.dto" })
@ComponentScan(basePackageClasses = ListStudentAPI.class)
@ComponentScan(basePackageClasses = StudentAPI.class)
@SpringBootApplication
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
//		IScore iscore = context.getBean(IScore.class);
//		System.out.println("Instance: " + iscore);
//		System.out.println("String: " + iscore.getString());
//		StudentDTO student = context.getBean(StudentDTO.class);
//		System.out.println("StudentDTO: " + student);
//		System.out.println("StudentDTO: " + student.scores);
//		ListStudentDTO students = context.getBean(ListStudentDTO.class);
//		System.out.println("StudentDTO: " + students);
//		System.out.println("StudentDTO: " + students.students);
	}

}