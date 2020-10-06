package com.tma.week2Practice.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tma.week2Practice.dto.ListStudentDTO;
import com.tma.week2Practice.dto.StudentDTO;
import com.tma.week2Practice.service.ListStudentService;
import com.tma.week2Practice.utils.Utils.ListStudentUtils;

@RestController
public class ListStudentAPI {

	private ListStudentService listStudentService;

	public ListStudentDTO listStudent = new ListStudentDTO();

	public ListStudentAPI() {
		listStudent = ListStudentUtils.getSampleStudent();
	}

	@GetMapping("/")
	public String defaultGet() {
		return "<h1>Welcome</h1>";
	}

	@GetMapping("/students")
	public ListStudentDTO getStudent() {
		return listStudent;
	}

	@PostMapping("/students")
	public void createStudent(@RequestBody StudentDTO student) {
		this.listStudentService.addStudent(student);
	}

	@PutMapping("/students")
	public void updateStudent(@RequestBody StudentDTO student) {
		this.listStudentService.updateStudent(student);

	}

	@DeleteMapping("/students")
	public void removeStudent(@RequestParam(value = "name") String name) {
		this.listStudentService.removeStudentByName(name);
	}

	@GetMapping("/smartestStudents")
	public StudentDTO getSmartestStudent() {
		return this.listStudentService.getSmartestStudent();
	}

	@GetMapping("/stupidStudents")
	public StudentDTO getStupidStudent() {
		return this.listStudentService.getStupidStudent();
	}
}