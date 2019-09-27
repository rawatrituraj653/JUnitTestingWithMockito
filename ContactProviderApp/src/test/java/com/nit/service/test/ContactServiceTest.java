package com.nit.service.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.easymock.EasyMock;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.nit.dao.IContactDao;
import com.nit.service.ContactService;

public class ContactServiceTest {
	
	private static IContactDao dao;
	
	private static ContactService service;
	@BeforeClass
	public static void setUp() {
		service=new ContactService();
		dao=EasyMock.createMock(IContactDao.class);
		EasyMock.expect(dao.getContactById(101)).andReturn("Amit");
		EasyMock.expect(dao.getContactById(102)).andReturn("Rituraj");
		EasyMock.expect(dao.getContactById(103)).andReturn("Sumit");
		EasyMock.expect(dao.getContactById(106)).andReturn(null);
		EasyMock.replay(dao);
		service.setContactDao(dao);
		
	}
	
	@Test
	public  void test_fetchContactById_1() {
	String name=service.fetchContactById(102);
	assertNotNull(name);
	assertEquals("Rituraj", name);
   }
	
	@Test
	public  void test_fetchContactById_2() {
		String name=service.fetchContactById(106);
		assertNull(name);
	}
	@AfterClass
	public static void cleanUp() {
	service=null;
	dao=null;
	}	
}
