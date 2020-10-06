package com.tma.week2Practice.Student;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.tma.week2Practice.dto.ListStudentDTO;
import com.tma.week2Practice.dto.StudentDTO;
import com.tma.week2Practice.utils.Utils.ListStudentUtils;

public class TestJUnit {
	private StudentDTO student;
	private ListStudentDTO listStudent;

	@Before
	public void Setup() {
		listStudent = new ListStudentDTO();
		listStudent = ListStudentUtils.getSampleStudent();
		assertEquals(3, 3);
	}

	@Test
	public void testAddStudent() {

	}

}
