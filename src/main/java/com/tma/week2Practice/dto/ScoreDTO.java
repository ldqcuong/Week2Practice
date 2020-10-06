package com.tma.week2Practice.dto;

import org.springframework.stereotype.Component;

@Component("ScoreDTO")
public class ScoreDTO {
	private String name;
	private double point;

	public ScoreDTO() {
		this.name = "";
		this.point = 0.0;
	}

	public ScoreDTO(String name, double point) {
		this.name = name;
		this.point = point;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPoint() {
		return this.point;
	}

	public void setPoint(double score) {
		this.point = score;
	}
}