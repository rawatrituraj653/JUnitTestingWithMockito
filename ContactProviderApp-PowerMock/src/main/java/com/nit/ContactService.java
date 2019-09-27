package com.nit;

import com.nit.dao.IContactDao;

public class ContactService {

	private IContactDao dao; 
	
	public String findNameById(Integer id) {
		String name=dao.findNameById(id);
		return name;
	}
	public static Double getData(Double num1,Double num2) {
		double x=num1+num2;
		return x;
	}
	
	public final  String getBrandName(String  msg) {
		return msg;
	}
	
	private String getMsg(Integer rid) {
		return "This is from Private Msg";
	}
	public void getDataFromMe(Integer id) {
		dao.SendData(id);

	}
	public static String getData11(String str ) {
		return "12322";
	}
}
