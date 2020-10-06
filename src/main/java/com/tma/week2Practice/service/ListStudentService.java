package com.tma.week2Practice.service;

import org.springframework.stereotype.Component;

import com.tma.week2Practice.dto.StudentDTO;

@Component("ListStudentService")
public interface ListStudentService {
	// gọi xuống DAO
	public void addStudent(StudentDTO studentDTO);

	public void updateStudent(StudentDTO studentDTO);

	public void removeStudentByName(String name);

	public StudentDTO findStudentByName(String name);

	public StudentDTO getSmartestStudent();

	public StudentDTO getStupidStudent();

}
