package com.jdbc;

import java.sql.*;

public class MyJdbc {

	// Database credentials (username and password url

	static final String JDBC_Driver = "com.mysql.jdbc.Driver";
	static final String Database_URL = "jdbc:mysql://localhost:3306/Instagram_db";

	static final String USER = "root";
	static final String password = "Root";

	public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException {

		Connection connect = null;
		Statement stat = null;

	//	try {

			// Register JDBC
			Class.forName(JDBC_Driver);

			System.out.println("Connecting to Database");

			connect = DriverManager.getConnection(Database_URL, USER, password);

			// Execute a Query

			stat = connect.createStatement();

			String sql;

			sql = "Select * from user";

			ResultSet rs = stat.executeQuery(sql);

			// Extract data from result set

			while (rs.next()) {

				Thread.sleep(1000);
				// Retriving by column name

				int id = rs.getInt("id");
				String firstName = rs.getString("firstName");
				String lastName = rs.getString("lastName");
				String address = rs.getString("address");
				String city = rs.getString("city");
				String state = rs.getString("state");

				// Display our values

				System.out.println("ID " + id);
				System.out.println("First Name" + firstName);
				System.out.println("Last Name " + lastName);
				System.out.println("Address" + address);
				System.out.println("City " + city);
				System.out.println("State " + state);

			

	}
}
}
