package com.pack.mockitoapp;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;
import static org.mockito.Mockito.*;


public class AppTest 
{
    Portfolio portfolio;
    StockService stockService;
    
    public static void main(String[] args) {
    	AppTest test = new AppTest();
    	test.setUp();
    	System.out.println(test.testMarketValue()? "pass":"fail");
		
	}
    public void setUp() {
        portfolio = new Portfolio();
        stockService=mock(StockService.class);
        portfolio.setStockService(stockService);
    }
    
    
    public boolean testMarketValue() {
    	ArrayList<Stock> al = new ArrayList<Stock>();
    	Stock apple = new Stock("1", "apple", 10);
    	Stock ms = new Stock("2", "microsoft", 100);
    	Stock google = new Stock("3", "Google", 500);
    	Stock fb = new Stock("4", "Facebook", 200);
    	al.add(apple);
    	al.add(ms);
    	al.add(google);
    	al.add(fb);
    	portfolio.setStocks(al);
    	
    	when(stockService.getPrice(apple)).thenReturn(50.00);
    	when(stockService.getPrice(ms)).thenReturn(1000.00);
    	when(stockService.getPrice(google)).thenReturn(100.00);
    	when(stockService.getPrice(fb)).thenReturn(1000.00);
    	
    	double marketValue=portfolio.getMarketValue();
    	return marketValue ==350500;
    	
    }
}
