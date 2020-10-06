package com.tma.week2Practice.dao;

import org.springframework.stereotype.Component;

import com.tma.week2Practice.dto.StudentDTO;

@Component
public interface ListStudentDAO {
	// truy vấn tới repository
	public void addStudent(StudentDTO student);

	public void updateStudent(StudentDTO student);

	public StudentDTO findStudentByName(String name);

	public void removeStudentByName(String name);

	public StudentDTO getSmartestStudent();

	public StudentDTO getStupidStudent();
}
