package com.nit.service;

public class CalculatorService {

	public int add(int num1,int num2) {
		int c=0;
		c=num1+num2;
		System.out.println(c);
		return c;
	}

	public int sub(int num1,int num2) {
		int c=0;
		c=num1-num2;
		return c;
	}
	public int mul(int num1,int num2) {
		int c=0;
		c=num1*num2;
		return c;
	}
	public int div(int num1,int num2) {
		int c=0;
		c=num1/num2;
		return c;
	}
	public int rem(int num1,int num2) {
		int c=0;
		c=num1%num2;
		return c;
	}
}
