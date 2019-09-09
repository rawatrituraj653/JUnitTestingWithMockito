package com.app.test;


import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.app.CalculatorService;

public class TestCalculatorService {


	private CalculatorService calc=null;
	private int a,b,actual,expected;
	
	@Before
	public void doSetup() {
		calc=new CalculatorService();
		a=20;b=10;	
	}	
	
	@Test
	public void testAdd() {
		actual =calc.add(a, b);
		expected=30;
		assertEquals(expected, actual);	
	}
	@After
	public void clear() {
		a=b=actual=expected=0;
		calc=null;
	}
	@Test
	public void testSub() {
		actual=calc.sub(a, b);
		expected=10;
		assertEquals(expected, actual);
	}
	@Test
	public void testMul() {
		actual=calc.mul(a, b);
		expected=200;
		assertEquals(expected, actual);
	}
	@Test
	public void testDiv() {
		actual=calc.div(a, b);
		expected=2;
		assertEquals(expected, actual);
	}
	@Test
	public void testRem() {
		a=200;b=30;
		actual=calc.rem(a, b);
		expected=20;
		assertEquals(expected, actual);
	}
}
