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
				Class.forName("oracle.jdbc.driver.OracleDriver");
				connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
				return connection;
			} catch (Exception e) {
					e.printStackTrace();
					return connection;
			}
		}
		return connection;
	}
}
