package com.tma.week2Practice.dto;

import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ListStudent {
	public ArrayList<Student> students;
	private Student stupidStudent;
	private Student smartestStudent;

	private static Logger LOGGER = LogManager.getLogger(ListStudent.class);

	public ListStudent() {
		this.students = new ArrayList<Student>();
		this.smartestStudent = new Student();
		this.stupidStudent = new Student();
		LOGGER.info("New list student was created");
	}

	@Autowired
	public void addStudent(Student student) {
		this.students.add(student);
		this.smartestStudent = this.getSmartestStudent();
		this.stupidStudent = this.getStupidStudent();
		LOGGER.info("Add new student was successfully");
	}

	public ListStudent(ArrayList<Student> students) {
		this.students = students;
		this.smartestStudent = this.getSmartestStudent();
		this.stupidStudent = this.getStupidStudent();
		LOGGER.info("New list student was created");
	}

	public Student findStudentByName(String name) {
		for (Student student : students) {
			if (student.getName().equals(name)) {
				return student;
			}
		}
		return null;

	}

	public void removeStudentByName(String name) {
		students.removeIf(obj -> obj.getName().equals(name));
	}

	// find student who has max GPA
	public Student getSmartestStudent() {
		this.smartestStudent = this.students.get(0);
		for (int i = 0; i < this.students.size(); i++) {
			if (students.get(i).getGPA() > this.smartestStudent.getGPA()) {
				this.smartestStudent = this.students.get(i);
			}

		}
		return smartestStudent;
	}

	public void setSmartestStudent(Student smartestStudent) {
		this.smartestStudent = smartestStudent;
	}

	// find student who has minimum GPA
	public Student getStupidStudent() {
		this.stupidStudent = this.students.get(0);
		for (int i = 0; i < this.students.size(); i++) {
			if (this.students.get(i).getGPA() < stupidStudent.getGPA()) {
				this.stupidStudent = this.students.get(i);
			}
		}

		return this.stupidStudent;
	}

	public void setStupidStudent(Student stupidStudent) {
		this.stupidStudent = stupidStudent;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

	public String getString() {
		return String.valueOf(this.students.size());
	}
}
