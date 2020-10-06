package com.tma.week2Practice.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.tma.week2Practice.dto.ScoreDTO;
import com.tma.week2Practice.service.StudentService;

public class StudentAPI {
	@Autowired
	private StudentService studentService;

	@PostMapping("/scores")
	public void createScores(@RequestParam(value = "student") String name, @RequestBody ScoreDTO score) {
		// studentService.addScores(score);
		return;
	}

	@GetMapping("/scores")
	public ArrayList<ScoreDTO> getScores(@RequestParam(value = "student") String name) {
		return null;
		// return this.listStudent.findStudentByName(name).getScores();

	}
}
