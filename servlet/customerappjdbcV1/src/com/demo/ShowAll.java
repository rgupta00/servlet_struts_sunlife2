package com.demo;

import java.sql.*;

public class ShowAll {

	public static void main(String[] args) {
		try {
			Connection connection=ConnectionFactory.getConnection();
			
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("select * from customer");
			while (rs.next()) {
				System.out.println(
						rs.getInt(1) + ": " + rs.getString(2) + ": " + rs.getString(3) + ": " + rs.getString(4));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		// statement and display all records

	}

}
