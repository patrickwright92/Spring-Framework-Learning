package com.pwright.mockito.mockitodemo.business;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SomeBusinessImplStubTest {

	@Test
	void findTheGreatestFromAllData_basicScenario() {
		DataServiceStub dataServiceStub = new DataServiceStub();
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceStub);

		int result = businessImpl.findTheGreatestFromAllData();

		assertEquals(25, result);
	}

	@Test
	void findTheGreatestFromAllData_oneValueScenario() {
		DataServiceStub2 dataServiceStub2 = new DataServiceStub2();
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceStub2);

		int result = businessImpl.findTheGreatestFromAllData();

		assertEquals(35, result);
	}

}

class DataServiceStub implements DataService {

	@Override
	public int[] retrieveAllData() {
		return new int[] { 25, 15, 5 };
	}

}

// Shown in this example stubs are maintenance heavy and repetitive, mocks are better
class DataServiceStub2 implements DataService {

	@Override
	public int[] retrieveAllData() {
		return new int[] { 35 };
	}

}