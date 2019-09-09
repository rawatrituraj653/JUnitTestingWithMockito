package com.app;

public class ArmStrongNum {

	private int sum=0;
	
	public boolean isArmStrongForThreeDigit(Integer num) {
		System.out.println(num);
		int num1 = armStrongCheck(num);
		System.out.println(num1);
		if(num1==num) {
			return true;
		}
		else
			return false;
	}

	private Integer armStrongCheck(Integer num) {
		int c=0;
		int temp=num;
		while(temp!=0) {
			c++;
			temp=temp/10;
		}
		while(num!=0) {
		int rem= num%10;
		//sum=sum+rem*rem*rem;
		int nu=(int) Math.pow((int)rem,(int)c);
		sum=sum+nu;
		num=num/10;
		}
		return sum;
	}
}
