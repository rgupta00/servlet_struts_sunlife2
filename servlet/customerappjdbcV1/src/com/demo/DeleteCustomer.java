package com.demo;

import java.sql.*;

public class DeleteCustomer {

	public static void main(String[] args) {
		try {
			Connection connection=ConnectionFactory.getConnection();
			
			//Statement vs PrepareStatement vs CallableStatement
			
			PreparedStatement stmt =
					connection
					.prepareStatement("delete from customer where id=?");
			
			stmt.setInt(1,3);
			
			int executeUpdate = stmt.executeUpdate();
			System.out.println(executeUpdate);
			

		} catch (SQLException e) {
			e.printStackTrace();
		}

		// statement and display all records

	}

}
