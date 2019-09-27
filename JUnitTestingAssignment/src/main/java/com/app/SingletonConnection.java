package com.app;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingletonConnection {

	private static Connection  connection;
	
	private SingletonConnection() {
		System.out.println("this is my singleton");
	}
	
	public static synchronized Connection getConnection() {
		if(connection==null) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				connection=DriverManager.getConnection("jdbc:mysql:///springdb","root","root");
				return connection;
			} catch (Exception e) {
					e.printStackTrace();
					return connection;
			}
		}
		return connection;
	}
}
