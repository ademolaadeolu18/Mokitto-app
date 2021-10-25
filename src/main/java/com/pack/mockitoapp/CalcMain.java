package com.pack.mockitoapp;

public class CalcMain {

	private CalcService calcService;

	public CalcService getCalcService() {
		return calcService;
	}

	public void setCalcService(CalcService calcService) {
		this.calcService = calcService;
	}
	
	public double addTesting(double a, double b) {
		return calcService.add(a, b);
	}
}
