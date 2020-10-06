package com.tma.week2Practice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.tma.week2Practice.dto.ScoreDTO;
import com.tma.week2Practice.dto.StudentDTO;
import com.tma.week2Practice.service.StudentService;
import com.tma.week2Practice.validation.ScoreValidation;

public class StudentServiceImpl implements StudentService {

	@Autowired
	private ScoreValidation scoreValidation;
	@Autowired
	private StudentDTO studentDTO;

	@Override
	public void addScore(ScoreDTO score) {
		if (this.scoreValidation.check(score) == "valid") {
			this.studentDTO.addScore(score);
		}

	}

	@Override
	public void removeScoreByName(String name) {
		studentDTO.getScores().removeIf(score -> score.getName().equals(name));

	}

	@Override
	public ScoreDTO findScoreByName(String name) {
		for (ScoreDTO score : studentDTO.getScores()) {
			if (score.getName() == name) {
				return score;
			}
		}
		return null;
	}

	@Override
	public double getGPA() {
		double GPA = 0;
		for (ScoreDTO score : studentDTO.getScores()) {
			GPA += score.getPoint();
		}
		return GPA / (studentDTO.getScores().size());
	}

}
