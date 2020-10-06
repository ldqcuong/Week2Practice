package com.tma.week2Practice.dto;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class ListStudentDTO {
	public ArrayList<StudentDTO> students;

	public ListStudentDTO() {
		this.students = new ArrayList<StudentDTO>();
	}

	public ArrayList<StudentDTO> getStudents() {
		return this.students;
	}

	public void setStudents(ArrayList<StudentDTO> students) {
		this.students = students;
	}

}
