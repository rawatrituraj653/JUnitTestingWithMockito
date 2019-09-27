package com.nit.beans;

import com.nit.dao.IContactDao;

public class WishUser {

	private IContactDao dao; 
	
	public void setDao(IContactDao dao) {
		this.dao=dao;
	}
	public String fetchEmpNameById(Integer id) {
		String msg=dao.findNameById(id);
		return msg;
	}
	private  String getMessage() {
		
		return "This is from my private method";
	}
	
	private  Integer getSum(int...num) {
		int sum=0;
		for(int i=0;i<num.length;i++) {
		sum=sum+num[i];
		}
		return sum;
	}
}
