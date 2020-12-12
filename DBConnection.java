package com.aruvishal.medical_management.util;

import java.sql.Connection;

import java.sql.DriverManager;

public class DBConnection {
	public static Connection getConnection() throws Exception {
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hms?user=root&password=123456");
		} catch (ClassNotFoundException e) {
					}
		return connection;
	}

}
