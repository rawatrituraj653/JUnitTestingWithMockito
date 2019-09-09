package com.app;

import java.util.Random;
import java.util.UUID;

public class CaptchaAndOTP {

	public int getOtp() {
		int otp=new Random().nextInt(1500);
		return otp;
	}
	
	public String getCaptcha() {
		
		return UUID.randomUUID().toString().replace("-", "").substring(0, 6);
	}
	public static void main(String[] args) {
		CaptchaAndOTP andOTP=new CaptchaAndOTP();
		System.out.println(andOTP.getCaptcha());
		System.out.println(andOTP.getOtp());
				
	}
	
}
