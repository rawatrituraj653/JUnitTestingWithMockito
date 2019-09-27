package com.beans.test;


import static org.junit.Assert.assertNotNull;

import org.easymock.EasyMock;
import org.junit.Test;

import com.ibm.temp.IWeatherForcastor;
import com.nit.beans.WeatherForcastorService;

public class WeatherForcastorServiceTest {

	@Test
	public void testgetTemperature() {
		WeatherForcastorService service=new  WeatherForcastorService();
		IWeatherForcastor stub=EasyMock.createMock(IWeatherForcastor.class);
		EasyMock.expect(stub.invokeTemperature(500016)).andReturn(43.2);
		EasyMock.expect(stub.invokeTemperature(500012)).andReturn(37.2);
		EasyMock.expect(stub.invokeTemperature(500014)).andReturn(44.2);
		EasyMock.expect(stub.invokeTemperature(500011)).andReturn(33.2);
		EasyMock.replay(stub);
		service.setStub(stub);
		Double temp= service.getTemperature(500014);
		assertNotNull(temp);		
	}


}
