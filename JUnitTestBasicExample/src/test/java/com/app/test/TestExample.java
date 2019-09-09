package com.app.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestExample {

	
	
	@Test
	public void testA() {
		System.out.println("this is my first Test case:: testA()");
	}
	
	@Test
	public void testB() {
		System.out.println("this is my first Test case:: testB()");
	}
	@Before
	public void beforeTest() {
		System.out.println("this is my before method/.......");
	}
	@After
	public void afterTest() {
		
		System.out.println("this is my After method......");
	}
	@BeforeClass
	public static void beforeClassMethod() {
		System.out.println("this is before class method........");
	}
	
	@AfterClass
	public static void afterclassMethod() {
		System.out.println("this is my after class method........");
	}
	
	
	
	
}
