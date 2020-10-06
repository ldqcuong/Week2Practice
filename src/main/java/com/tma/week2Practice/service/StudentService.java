package com.tma.week2Practice.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.tma.week2Practice.dto.ScoreDTO;

public interface StudentService {
	// gọi xuống DAO
	@Autowired
	public void addScore(ScoreDTO score);

	public void removeScoreByName(String name);

	public ScoreDTO findScoreByName(String name);

	public double getGPA();
}
