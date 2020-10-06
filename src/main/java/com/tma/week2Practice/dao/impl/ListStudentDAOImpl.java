package com.tma.week2Practice.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.tma.week2Practice.dao.ListStudentDAO;
import com.tma.week2Practice.dto.StudentDTO;
import com.tma.week2Practice.validation.StudentValidation;

public class ListStudentDAOImpl implements ListStudentDAO {

	@Autowired
	StudentValidation studentValidation;

	@Override
	public void addStudent(StudentDTO student) {

	}

	@Override
	public StudentDTO findStudentByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeStudentByName(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public StudentDTO getSmartestStudent() {
		return null;
//		StudentDTO smartestStudent = this.get
//		for (int i = 0; i < this.students.size(); i++) {
//			if (students.get(i).getGPA() > this.smartestStudent.getGPA()) {
//				this.smartestStudent = this.students.get(i);
//			}
//
//		}
//		return smartestStudent;
	}

	@Override
	public StudentDTO getStupidStudent() {
		return null;
//		StudentDTO stupidStudent = this.getStudents().get(0);
//		for (int i = 0; i < this.students.size(); i++) {
//			if (this.students.get(i).getGPA() < stupidStudent.getGPA()) {
//				this.stupidStudent = this.students.get(i);
//			}
//		}
//
//		return this.stupidStudent;
	}

	@Override
	public void updateStudent(StudentDTO student) {
		String message = studentValidation.check(student);
		if (message == "valid") {
//			listStudent.removeStudentByName(student.getName());
//			listStudent.addStudent(student);
		}

	}
}