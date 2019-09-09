package com.app;

public class StringOpr {
	
	
	public String revStr(String str) {
		//String rev=new StringBuilder(str).reverse().toString();
		char []chr=str.toCharArray();
		int len=chr.length;
		char[]temp=new char[len];
		for (int i = 0; i < temp.length; i++) {
			temp[i]=chr[len-1-i];
		}
		return new String(temp);
	}
	public boolean checkPalin(String s) {
		return s.equals(revStr(s));
	}
}
