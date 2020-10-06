package com.tma.week2Practice.dto;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component("StudentDTO")
public class StudentDTO {
	private String name;
	private int age;
	private String province;
	private String classes;
	public ArrayList<ScoreDTO> scores = new ArrayList<ScoreDTO>();

	public StudentDTO() {
		this.name = "";
		this.age = 0;
		this.province = "";
		this.classes = "";
	}

	public StudentDTO(StudentDTO student) {
		this.name = student.name;
		this.age = student.age;
		this.province = student.province;
		this.classes = student.classes;
		this.scores = student.scores;
	}

	public StudentDTO(String name, int age, String province, String classes) {
		this.name = name;
		this.age = age;
		this.province = province;
		this.classes = classes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<ScoreDTO> getScores() {
		return scores;
	}

	public void addScore(ScoreDTO score) {
		this.scores.add(score);
	}

	public void setScores(ArrayList<ScoreDTO> scores) {
		this.scores = scores;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getClasses() {
		return classes;
	}

	public void setClasses(String classes) {
		this.classes = classes;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

}
