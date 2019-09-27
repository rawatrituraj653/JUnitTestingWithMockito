package com.app.test;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.app.ArmStrongNum;

public class TestArmStrongNum {

	private ArmStrongNum asn=null;
	@Before
	public void setValue() {
		asn=new ArmStrongNum();
	}
	
	@Test
	public void checkArmStrong() {
		boolean flag=asn.isArmStrongForThreeDigit(3751);
		assertTrue(flag);
		
	}
	
	@After
	public void clear() {
		asn=null;
	}

}
