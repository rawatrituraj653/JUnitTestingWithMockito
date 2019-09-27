package com.nit.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;
import static org.powermock.api.mockito.PowerMockito.verifyStatic;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.nit.ContactService;
import com.nit.dao.IContactDao;

@RunWith(PowerMockRunner.class)
@PrepareForTest(fullyQualifiedNames = "com.*")
public class ContactServiceTest {
	
	
	private  static IContactDao dao; 
	@BeforeClass
	public static void setUp() {
		dao=PowerMockito.mock(IContactDao.class);
		when(dao.findNameById(101)).thenReturn("Amit");
		when(dao.getBrandName(202)).thenReturn("Wipro");	
	}
	@Test
	public void test_getData() {
		ContactService contactService=new ContactService();
		Double sum=contactService.getData(101.00, 200.00);
		assertNotNull(sum);
	}
	@Test
	//@Ignore
	public void test_getBrandName() throws Exception {
		String msg="This from final method";
		ContactService service=PowerMockito.mock(ContactService.class);
		PowerMockito.whenNew(ContactService.class).withNoArguments().thenReturn(service);
		ContactService contactService=new ContactService();
		PowerMockito.verifyNew(ContactService.class).withNoArguments();
		when(service.getBrandName(msg)).thenReturn(msg);
		String str=service.getBrandName(msg);
		Mockito.verify(contactService).getBrandName(msg);
		assertEquals(msg, str);
	}
	@Test
	public void test_getData11() {
	PowerMockito.spy(ContactService.class);
	when(ContactService.getData11("success")).thenReturn("this is static test");
	String value=ContactService.getData11("success");
	verifyStatic();
	ContactService.getData11("success");
	assertNotNull(value);
	}
	
	
}
