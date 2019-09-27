package com.nit.dao;

public interface IContactDao {
	public String findNameById(Integer id) ;
	public  String getBrandName(Integer id) ;
	public void SendData(Integer id);
}

