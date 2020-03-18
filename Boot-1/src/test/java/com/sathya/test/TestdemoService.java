package com.sathya.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.sathya.service.DemoService;

public class TestdemoService {
	
	@Test
	public void testGetService() {
		DemoService ds=new DemoService();
		
		Assertions.assertEquals("raj",ds.getService());
	}

}
