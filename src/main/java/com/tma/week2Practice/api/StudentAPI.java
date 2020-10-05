package com.tma.week2Practice.api;

import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tma.week2Practice.bo.StudentBO;
import com.tma.week2Practice.dto.ListStudent;
import com.tma.week2Practice.dto.Score;
import com.tma.week2Practice.dto.Student;

@RestController
public class StudentAPI {
	public ListStudent listStudent = new ListStudent();
	private static Logger LOGGER = LogManager.getLogger(ListStudent.class);

	public StudentAPI() {
		listStudent = StudentBO.getSampleStudent();
	}

	@PostMapping("/students")
	public void createStudent(@RequestBody Student student) {
		listStudent.addStudent(student);
		return;
	}

	@GetMapping("/students")
	public ListStudent getStudent() {
		return listStudent;
	}

	@GetMapping("/smartestStudents")
	public Student getSmartestStudent() {
		return listStudent.getSmartestStudent();
	}

	@GetMapping("/stupidStudents")
	public Student getStupidStudent() {
		return listStudent.getStupidStudent();
	}

	@PostMapping("/scores")
	public void createScores(@RequestParam(value = "student") String name, @RequestBody Score score) {
		LOGGER.info(name + " aaaaaaaa");
		System.out.print(name);
		// listStudent.getStudents().get(0).addScores(score);
		return;
	}

	@GetMapping("/scores")
	public ArrayList<Score> getScores(@RequestParam(value = "student") String name) {
		LOGGER.info(name + " aaaaaaaa");
		return this.listStudent.getStudents().get(0).getScores();
	}
}