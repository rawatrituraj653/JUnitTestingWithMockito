package com.nit.beans.test;


import org.junit.Test;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.reflect.Whitebox;

import static org.junit.Assert.assertNotNull;
import static org.powermock.api.mockito.PowerMockito.when;
import com.nit.beans.WishUser;
import com.nit.dao.IContactDao;

public class WishUserTest {

	@Test
	public void test_fetchEmpNameById() {
		IContactDao dao = PowerMockito.mock(IContactDao.class);
		when(dao.findNameById(101)).thenReturn("Amit");
		when(dao.findNameById(102)).thenReturn("Rituraj");
		
		WishUser user=new WishUser();
		user.setDao(dao);
		String msg=user.fetchEmpNameById(101);
		assertNotNull(msg);	
	}
	
	@Test
	public void test_getMessage() throws Exception {
		WishUser user=new WishUser();
		String str=Whitebox.invokeMethod(user, "getMessage");
		assertNotNull(str);
	}
	
	@Test
	public void test_getSum() throws Exception{
		WishUser user=new  WishUser();
		Integer sum= Whitebox.invokeMethod(user, "getSum", 10,20,40,50,60,70);
		assertNotNull(sum);
	}
	
}
