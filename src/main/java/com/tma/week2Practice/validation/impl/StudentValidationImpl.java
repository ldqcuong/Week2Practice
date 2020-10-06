
package com.tma.week2Practice.validation.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.tma.week2Practice.dto.ScoreDTO;
import com.tma.week2Practice.dto.StudentDTO;
import com.tma.week2Practice.validation.ScoreValidation;
import com.tma.week2Practice.validation.StudentValidation;

public class StudentValidationImpl implements StudentValidation {
//	public static ListStudentDTO getSampleStudent() {
//		ScoreDTO math = new ScoreDTO("math", 5.0);
//		ScoreDTO english = new ScoreDTO("english", 9.0);
//		ScoreDTO physical = new ScoreDTO("physical", 9.0);
//		StudentDTO student1 = new StudentDTO("Hai1", 18, "12C1", "Gia Lai");
//		student1.addScore(math);
//		student1.addScore(english);
//		StudentDTO student2 = new StudentDTO("Hai2", 18, "12C1", "Gia Lai");
//		student2.addScore(math);
//		student2.addScore(english);
//		student2.addScore(physical);
//		ListStudentDTO listStudent = new ListStudentDTO();
//		listStudent.addStudent(student1);
//		listStudent.addStudent(student2);
//
//		LOGGER.info("Get smaple student successfully");
//		return listStudent;
//	}
	@Autowired
	private ScoreValidation scoreValidation;

	@Override
	public String check(StudentDTO studentDTO) {
		String message = "valid";
		if (studentDTO.getName().length() > 30) {
			message = "Name was tool long!";
		} else if (studentDTO.getAge() < 0 || studentDTO.getAge() > 100) {
			message = "Age is not valid";
		} else if (studentDTO.getClasses().length() < 1 || studentDTO.getClasses().length() > 10) {
			message = "Class's name is not valid";
		}

		for (ScoreDTO score : studentDTO.getScores()) {
			if (scoreValidation.check(score) != "valid") {
				message = score.getName() + " score is not valid";
				return message;
			}
		}

		return message;
	}
}
