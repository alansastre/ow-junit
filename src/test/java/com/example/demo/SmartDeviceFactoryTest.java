package com.example.demo;

import org.junit.jupiter.api.Test;

import com.example.demo.service.SmartDeviceFactory;
import com.example.demo.domain.SmartDevice;
import com.example.demo.domain.SmartPhone;
import com.example.demo.domain.SmartWatch;

import static org.junit.jupiter.api.Assertions.*;

class SmartDeviceFactoryTest {

	
	@Test
	void testSmartPhoneInstance() {
		// 1. preparacion
		
		// 2. ejecucion del codigo a testear
		SmartDevice phone = SmartDeviceFactory.createByType("phone");
		
		// 3. verificaciones
		assertNotNull(phone);
		assertTrue(phone instanceof SmartPhone);
		assertEquals("Default smartphone", phone.getName());
		assertEquals(1L, phone.getId());
	}
	
	
	@Test
	void testSmartWatchInstance() {
		// 1. preparacion
		
		// 2. ejecucion del codigo a testear
		SmartDevice watch = SmartDeviceFactory.createByType("watch");
		
		// 3. verificaciones
		assertNotNull(watch);
		assertTrue(watch instanceof SmartWatch);
		assertEquals("Default smartwatch", watch.getName());
		assertEquals(1L, watch.getId());
	}
	
	@Test
	void testDefaultInstance() {
		
		// 2. ejecucion del codigo a testear
		Exception exception = assertThrows(
				IllegalArgumentException.class, 
				() -> SmartDeviceFactory.createByType("notexists")
				);
		
		assertEquals("Unexpected value: notexists", exception.getMessage());

	}
	
	
	
	
	
	
	
}
