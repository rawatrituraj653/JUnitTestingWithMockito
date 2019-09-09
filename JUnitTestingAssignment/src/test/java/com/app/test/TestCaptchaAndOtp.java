package com.app.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.app.CaptchaAndOTP;


public class TestCaptchaAndOtp {

	private CaptchaAndOTP otp;
	@Before
	public void getObj() {
		otp=new CaptchaAndOTP();
	}

	@Test
	public void testOtp() {
		int myOtp=otp.getOtp();
		if(myOtp>1000) {
			fail();
		}
	}
	
	@Test
	public void testcaptcha() {
	String str=otp.getCaptcha();	
	if(str.length()!=6)	
		fail();
	}
	
	@After
	public void clean() {
		otp=null;
	}
	
}
