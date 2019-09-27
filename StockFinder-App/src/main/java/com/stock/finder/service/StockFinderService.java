package com.stock.finder.service;

import com.stock.finder.IStockerFinder;

public class StockFinderService {

	private IStockerFinder stub;

	public void setStub(IStockerFinder stub) {
		this.stub = stub;
	}
	
	public Double getStockPrice(String company) {
		Double sharepoint=stub.getShareValue(company);
		
		return sharepoint;
	}
	
	
	
}
