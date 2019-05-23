package com.my.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

import com.my.pojo.Person;
import com.my.util.JdbcConnection;

public class PersonDao {
	public String addUser(Person person) {
		String firstname = person.getFirstName();
		String lastname = person.getLastName();
		LocalDate dob = person.getDob();
		String city = person.getAddress().getCity();
		String state = person.getAddress().getState();

		Connection con = null;
		PreparedStatement preparedStatement = null;

		try {
			con = JdbcConnection.createConnection();
			// Insert user details into the table
			String query = "insert into person(firstname,lastname,dob,city,state) values (?,?,?,?,?)";
			// Making use of prepared statements here to insert bunch of data
			preparedStatement = con.prepareStatement(query);
			preparedStatement.setString(1, firstname);
			preparedStatement.setString(2, lastname);
			preparedStatement.setObject(3, dob);
			preparedStatement.setString(4, city);
			preparedStatement.setString(5, state);

			int i = preparedStatement.executeUpdate();

			// Just to ensure data has been inserted into the database
			if (i != 0)
				return "SUCCESS";
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// On failure, send a message
		return "Oops.. Something went wrong while inserting the data into the db table..!";
	}
}
