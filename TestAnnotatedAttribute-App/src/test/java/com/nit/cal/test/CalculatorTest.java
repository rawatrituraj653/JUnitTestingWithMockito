package com.nit.cal.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.nit.cal.Calculator;

public class CalculatorTest {
	
	
	private static Calculator calculator;
	@BeforeClass
	public static  void preLogic() {
		calculator=new Calculator();
	}
	@Test
	public void test_getSum() {
		Integer sum = calculator.getSum(10,20);
		Integer actual=30;
		assertEquals(sum, actual);
	} 
	
	@Test
	public void test_getSub() {
		Integer sub = calculator.getSub(20, 10);
		Integer expected=10;
		assertEquals(expected, sub);
	} 
	
	@Test(expected = ArithmeticException.class)
	public void test_div() {
		Integer div= calculator.getDiv(20, 0);
		assertNotNull(div);
	}
	
	@Test(expected = NullPointerException.class)
	public void  test_getEnameId() {
		String name = calculator.getEnameById(101);
		assertNotNull(name);
	}
	
	@Test(timeout = 5000)
	public void test_getId() throws InterruptedException {
		String id = calculator.getId();
	}
	
	@AfterClass
	public static void cleanObjects() {
		calculator=null;
	}

}
