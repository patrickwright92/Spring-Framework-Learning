package com.pwright.junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyBeforeAfterTest {
	
	// before all and after all are class level methods, run BEFORE testing begins
	@BeforeAll
	static void BeforeAll() {
		System.out.println("Setup for all tests before beginning");
	}
	
	@BeforeEach
	void BeforeEach() {
		System.out.println("Setup for each test");
	}

	@Test
	void test1() {
		System.out.println("Test1");
		
	}
	
	@Test
	void test2() {
		System.out.println("Test2");
		
	}
	
	@Test
	void test3() {	
		System.out.println("Test3");
		
	}
	
	@AfterEach
	void AfterEach() {
		System.out.println("Cleanup after each test");
	}
	
	@AfterAll
	static void AfterAll() {
		System.out.println("Cleanup for all tests after ending");
	}
}
