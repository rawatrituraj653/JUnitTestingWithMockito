package com.nit.mydata.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.nit.mydata.MyPowerMock;

@RunWith(PowerMockRunner.class)
@PrepareForTest(fullyQualifiedNames = "com.nit.*")
public class MyPowerMockTest {

	
	@Test
	public void test_getMsg() throws Exception{
		String hello="this is from me";
		MyPowerMock mock = PowerMockito.mock(MyPowerMock.class);
		PowerMockito.whenNew(MyPowerMock.class).withNoArguments().thenReturn(mock);
		MyPowerMock powerMock=new MyPowerMock();
		PowerMockito.verifyNew(MyPowerMock.class).withNoArguments();
		PowerMockito.when(powerMock.getMsg(hello)).thenReturn(hello);
		String msg=powerMock.getMsg(hello);
		Mockito.verify(powerMock).getMsg(hello);
		assertEquals(hello, msg);
	}
	
	
	@Test
	public void test_printMsg() {
		
		String msg="this is  for static message test";
		String expect="it it written by rituraj rawat";
		PowerMockito.mockStatic(MyPowerMock.class);
		PowerMockito.when(MyPowerMock.printMsg(msg)).thenReturn(expect);
		String actual=MyPowerMock.printMsg(msg);
		assertEquals(expect, actual);
		
	}
	
	@Test
	public void test_privateMsg() throws Exception {
			String msg ="this is from test class side";
			String expected="this is my expectation";
		MyPowerMock mock=PowerMockito.spy(new MyPowerMock());
		PowerMockito.doReturn(expected).when(mock, "privateMsg", msg);
		String actual=mock.callPrivate(msg);
		assertEquals(expected, actual);
			
	}
}
