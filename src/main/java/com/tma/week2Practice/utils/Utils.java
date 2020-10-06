package com.tma.week2Practice.utils;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.gson.Gson;
import com.tma.week2Practice.dto.ListStudentDTO;
import com.tma.week2Practice.dto.ScoreDTO;
import com.tma.week2Practice.dto.StudentDTO;

public class Utils {
	private static Logger LOGGER = LogManager.getLogger(ListStudentDTO.class);

	public static class JDBCUtils {
		private static String jdbcURL = "jdbc:mysql://localhost:3306/demo";
		private static String jdbcUsername = "root";
		private static String jdbcPassword = "root";

		public static Date getSQLDate(LocalDate date) {
			return java.sql.Date.valueOf(date);
		}

		public static LocalDate getUtilDate(Date sqlDate) {
			return sqlDate.toLocalDate();
		}

		public static Connection getConnection() {
			Connection connection = null;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
				LOGGER.info("Connect databse successfully");
			} catch (SQLException e) {
				printSQLException(e);
			} catch (ClassNotFoundException e) {
				LOGGER.error("JDBC not fould, conect database falled");
				e.printStackTrace();
			}
			return connection;
		}

		public static void printSQLException(SQLException ex) {
			for (Throwable e : ex) {
				if (e instanceof SQLException) {
					LOGGER.error("Conect database falled");
					LOGGER.error("SQLState: " + ((SQLException) e).getSQLState());
					LOGGER.error("Error Code: " + ((SQLException) e).getErrorCode());
					LOGGER.error("Message: " + e.getMessage());
					e.printStackTrace(System.err);
					Throwable t = ex.getCause();
					while (t != null) {
						LOGGER.error("Cause: " + t);
						t = t.getCause();
					}
				}
			}
		}
	}

	public static class JSONUtils {
		public static String getJSON(Object object) {
			String jsonString = new Gson().toJson(object);
			return jsonString;
		}
	}

	public static class ListStudentUtils {
		public static ListStudentDTO getSampleStudent() {
			ScoreDTO math = new ScoreDTO("math", 5.0);
			ScoreDTO english = new ScoreDTO("english", 9.0);
			ScoreDTO physical = new ScoreDTO("physical", 9.0);
			StudentDTO student1 = new StudentDTO("Hai1", 18, "12C1", "Gia Lai");
			student1.addScore(math);
			student1.addScore(english);
			StudentDTO student2 = new StudentDTO("Hai2", 18, "12C1", "Gia Lai");
			student2.addScore(math);
			student2.addScore(english);
			student2.addScore(physical);
			ListStudentDTO listStudent = new ListStudentDTO();
			listStudent.getStudents().add(student1);
			listStudent.getStudents().add(student2);
			return listStudent;
		}
	}
}