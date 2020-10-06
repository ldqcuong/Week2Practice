package com.tma.week2Practice.dto;

import org.springframework.stereotype.Component;

@Component("Score")
public class Score implements IScore {
	private String name;
	private double point;

	public Score() {
		this.name = "";
		this.point = 0.0;
	}

	public Score(String name, double point) {
		this.name = name;
		this.point = point;
	}

	public Score(Score score) {
		this.name = score.name;
		this.point = score.point;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public double getPoint() {
		return this.point;
	}

	@Override
	public void setPoint(double score) {
		this.point = score;
	}

	@Override
	public String getString() {
		return this.name + ": " + this.point;
	}
}
