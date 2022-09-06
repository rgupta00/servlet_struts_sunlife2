package com.customerapp.dao.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.customerapp.util.ConnectionFactory;

public class UserDaoImpl implements UserDao {

	@Override
	public void addUser(User user) {
		try {
			Connection connection = ConnectionFactory.getConnection();

			// Statement vs PrepareStatement vs CallableStatement

			PreparedStatement stmt = connection
					.prepareStatement("insert into user(username, password, profile) values(?,?,?)");

			stmt.setString(1, user.getUsername());
			stmt.setString(2, user.getPassword());
			stmt.setString(3, user.getProfile());

			stmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public User checkUser(String username, String password) {

		User user = null;
		try {
			Connection connection = ConnectionFactory.getConnection();

			PreparedStatement stmt = 
					connection.prepareStatement("select * from user where username=? and password=?");
			stmt.setString(1, username);
			stmt.setString(2, password);
			
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				user = new User(rs.getString(1), rs.getString(2), rs.getString(3));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return user;
	}

}
