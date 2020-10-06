package com.tma.week2Practice.dao;

import org.springframework.stereotype.Component;

import com.tma.week2Practice.dto.ScoreDTO;

@Component("StudentDTO")
public interface StudentDAO {
	// truy vấn tới repository
	public void addScore(ScoreDTO score);

	public void removeScore(String name);
}
