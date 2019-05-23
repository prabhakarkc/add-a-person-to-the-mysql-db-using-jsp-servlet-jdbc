package com.my.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcConnection {
	public static Connection createConnection() {
		Connection con = null;

		// MySQL URL followed by the database name
		String url = "jdbc:mysql://localhost:3306/java_evaluation";
		String username = "root"; // MySQL user name
		String password = "Hexaware@123"; // MySQL password

		try {
			try {
				Class.forName("com.mysql.jdbc.Driver"); // loading MySQL drivers
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

			// attempting to connect to MySQL database
			con = DriverManager.getConnection(url, username, password);
			System.out.println("Printing connection object " + con);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return con;
	}
}
