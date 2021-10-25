package com.pack.mockitoapp;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import junit.framework.Assert;

import static org.mockito.Mockito.when;
@RunWith(MockitoJUnitRunner.class)

public class CalcTest {
	
	@InjectMocks
	CalcMain calcMain = new CalcMain();
	@Mock
	CalcService calcService;
	
	@Test
	
	public void testAdd() {
		when(calcService.add(20.0,  30.0)).thenReturn(50.0);
		Assert.assertEquals(calcMain.addTesting(20.0, 30.0), 50.0);
	}

}
