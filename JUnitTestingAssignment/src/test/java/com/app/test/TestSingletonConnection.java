package com.app.test;


import static org.junit.Assert.assertSame;

import java.sql.Connection;

import org.junit.Test;

import com.app.SingletonConnection;

public class TestSingletonConnection {

	@Test
	public void testSingleton() {
		Connection connection=SingletonConnection.getConnection();
		Connection connection1=SingletonConnection.getConnection();
		assertSame(connection, connection1);
	}
}
