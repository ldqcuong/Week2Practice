package com.tma.week2Practice.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tma.week2Practice.dto.StudentDTO;

public interface StudentRepository extends JpaRepository<StudentDTO, Long> {
	/**
	 * To fetch Food by Range
	 * 
	 * @return
	 */
	@Query("SELECT student FROM FoodEntity food WHERE food.calories BETWEEN :min AND :max")
	ArrayList<StudentDTO> searchStudentByRange();
}
