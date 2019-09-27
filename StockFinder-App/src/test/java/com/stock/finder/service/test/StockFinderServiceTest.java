package com.stock.finder.service.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.easymock.EasyMock;
import org.junit.Test;

import com.stock.finder.IStockerFinder;
import com.stock.finder.service.StockFinderService;

public class StockFinderServiceTest {
	
	@Test
	public void  test_getStockPrice() {
		StockFinderService service=new StockFinderService();
		IStockerFinder finder=EasyMock.createMock(IStockerFinder.class);
		EasyMock.expect(finder.getShareValue("TCS")).andReturn(50000.00);
		EasyMock.expect(finder.getShareValue("IBM")).andReturn(33000.00);
		EasyMock.expect(finder.getShareValue("Cogniant")).andReturn(54000.99);
		EasyMock.replay(finder);
		service.setStub(finder);
		Double exp=50000.00;
		Double getPrice=service.getStockPrice("TCS");
		assertEquals(exp, getPrice);
		assertNotNull(getPrice);
		
	}
}
