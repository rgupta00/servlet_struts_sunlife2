package com.customerapp.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.sql.*;
import java.util.Properties;

public class ConnectionFactory {
	private static Connection connection = null;

	public static Connection getConnection() {

		Properties properties = new Properties();
		InputStream inStream;
		try {
			//inStream = new FileInputStream("db.properties");
			inStream=ConnectionFactory.class.getClassLoader()
					.getResourceAsStream("db.properties");
			
			properties.load(inStream);
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		String driver= properties.getProperty("jdbc.driver");
		String url= properties.getProperty("jdbc.url");
		String username= properties.getProperty("jdbc.username");
		String password= properties.getProperty("jdbc.password");
		
		
		
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			connection = DriverManager
					.getConnection(url,username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return connection;

	}

}
