package com.nit.service;

import com.nit.dao.IContactDao;

public class ContactService {

	private IContactDao contactDao;
	
	
	
	public void setContactDao(IContactDao contactDao) {
		this.contactDao = contactDao;
	}

	public String fetchContactById(Integer id) {
		String name=contactDao.getContactById(id);
		return name;
	}
	
	public Integer sendData(String name) {
		contactDao.sendBlankRequest(name);
		return 101;
	}
}
