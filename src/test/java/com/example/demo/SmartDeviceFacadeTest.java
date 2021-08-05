package com.example.demo;

import org.junit.jupiter.api.Test;

import com.example.demo.domain.SmartDevice;
import com.example.demo.domain.SmartPhone;
import com.example.demo.domain.SmartWatch;
import com.example.demo.service.SmartDeviceFacade;
import static org.junit.jupiter.api.Assertions.*;

class SmartDeviceFacadeTest {

	@Test
	void testCreateSmartphone(){
		
		SmartDevice phone = SmartDeviceFacade.createSmartPhone();
		
		assertNotNull(phone);
		assertTrue(phone instanceof SmartPhone);
		assertEquals(1L, phone.getId());
	}
	
	@Test
	void testCreateSmartWatch(){
		
		SmartDevice watch = SmartDeviceFacade.createSmartWatch();
		
		assertNotNull(watch);
		assertTrue(watch instanceof SmartWatch);
		assertEquals(1L, watch.getId());
	}
}
