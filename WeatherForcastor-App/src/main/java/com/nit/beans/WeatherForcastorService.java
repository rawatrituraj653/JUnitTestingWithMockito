package com.nit.beans;

import com.ibm.temp.IWeatherForcastor;

public class WeatherForcastorService {

	private IWeatherForcastor stub;


	public void setStub(IWeatherForcastor stub) {
		this.stub = stub;
	}
	public Double getTemperature(Integer zip) {
		Double temperature=stub.invokeTemperature(zip);
		System.out.println(temperature);
		return temperature;
	}

}
