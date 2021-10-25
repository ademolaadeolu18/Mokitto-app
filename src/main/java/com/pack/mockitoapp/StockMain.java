package com.pack.mockitoapp;

import java.util.ArrayList;
import java.util.List;

public class StockMain {

	public static void main(String[] args) {
		
		Portfolio pf = new Portfolio();
		
		List<Stock> ls = new ArrayList<Stock>();
		Stock s1 = new Stock("101", "Google", 50);
		Stock s2 = new Stock("102", "Facebook", 20);
		Stock s3 = new Stock("103", "Amazon", 30);
		ls.add(s1);
		ls.add(s2);
		ls.add(s3);
		
		pf.setStocks(ls);
		
		System.out.println(pf.getMarketValue());
		
		
		
		
		

	}

}
