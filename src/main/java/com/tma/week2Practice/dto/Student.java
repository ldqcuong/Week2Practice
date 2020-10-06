package com.tma.week2Practice.dto;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Student")
public class Student {
	private String name = "";
	private int age = 0;
	private String province = "";
	private String classes;
	private double GPA;

	public ArrayList<IScore> scores = new ArrayList<IScore>();

	public Student() {
		this.classes = "";

		this.GPA = 0.0;
	}

	@Autowired
	public void addScore(IScore score) {
		this.scores.add(score);
	}

	public Student(String name, int age, String classes, String province) {
		this.name = name;
		this.age = age;
		this.classes = classes;
		this.province = province;
		this.GPA = this.getGPA();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGPA() {
		double gpa = 0;
		for (IScore score : this.scores) {
			gpa += score.getPoint();
		}
		return gpa / this.scores.size();
	}

	public void setGPA(double GPA) {
		this.GPA = GPA;
	}

	public ArrayList<IScore> getScores() {
		return scores;
	}

	public void setScores(ArrayList<IScore> scores) {
		this.scores = scores;
	}

	public void addScores(Score score) {
		this.scores.add(score);
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
