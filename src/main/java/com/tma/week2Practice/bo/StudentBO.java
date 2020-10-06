package com.tma.week2Practice.bo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.tma.week2Practice.dto.IScore;
import com.tma.week2Practice.dto.ListStudent;
import com.tma.week2Practice.dto.Score;
import com.tma.week2Practice.dto.Student;

public class StudentBO {
	private static Logger LOGGER = LogManager.getLogger(ListStudent.class);

	public static ListStudent getSampleStudent() {
		Score math = new Score("math", 5.0);
		Score english = new Score("english", 9.0);
		Score physical = new Score("physical", 9.0);
		Student student1 = new Student("Hai1", 18, "12C1", "Gia Lai");
		student1.addScore(math);
		student1.addScore(english);
		Student student2 = new Student("Hai2", 18, "12C1", "Gia Lai");
		student2.addScore(math);
		student2.addScore(english);
		student2.addScore(physical);
		ListStudent listStudent = new ListStudent();
		listStudent.addStudent(student1);
		listStudent.addStudent(student2);

		LOGGER.info("Get smaple student successfully");
		return listStudent;
	}

	public static String checkStudent(Student student) {
		String message = "valid";
		if (student.getName().length() > 30) {
			message = "Name was tool long!";
		} else if (student.getAge() < 0 || student.getAge() > 100) {
			message = "Age is not valid";
		} else if (student.getClasses().length() < 1 || student.getClasses().length() > 10) {
			message = "Class's name is not valid";
		}

		for (IScore score : student.getScores()) {
			if (score.getPoint() < 0 || score.getPoint() > 10) {
				message = score.getName() + " score is not valid";
				return message;
			}
		}

		return message;
	}
}
