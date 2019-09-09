package com.app.test;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.app.StringOpr;

public class TestStringOpr {

	private StringOpr op=null;
	
	@Before
	public void  beforeStart() {
		op=new StringOpr();
	}
	
	@Test
	public void checkPalin() {
		boolean b=op.checkPalin("MOM");
		assertTrue(b);
	}
	
	@Test
	public void checkPalins() {
		boolean b1=op.checkPalin("DAD");
		//assertFalse(b1);
		assertTrue(b1);
	}
	
	@After
	public void afterMethod() {
		op=null;
	}
}
