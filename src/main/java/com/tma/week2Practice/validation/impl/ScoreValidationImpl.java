package com.tma.week2Practice.validation.impl;

import com.tma.week2Practice.dto.ScoreDTO;
import com.tma.week2Practice.validation.ScoreValidation;

public class ScoreValidationImpl implements ScoreValidation {

	@Override
	public String check(ScoreDTO score) {
		if (score.getName().length() > 30) {
			return "Subject's name is too long"; 
		} else if (score.getPoint() < 0 || score.getPoint() > 10) {
			return "Subject's point is not valid (1 - 10)"; 
		}
		return "valid";
	}
}
