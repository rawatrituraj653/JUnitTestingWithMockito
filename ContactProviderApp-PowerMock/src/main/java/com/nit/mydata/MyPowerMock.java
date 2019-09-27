package com.nit.mydata;

public class MyPowerMock {

	public final String getMsg(String message) {
		
		return message;
	}
	
	public static String printMsg(String msg) {
		
		return msg;
	}
	
	public String callPrivate(String msg) {
		
		return privateMsg(msg);
	}

	private String privateMsg(String msg) {
		return msg;
	}
}
