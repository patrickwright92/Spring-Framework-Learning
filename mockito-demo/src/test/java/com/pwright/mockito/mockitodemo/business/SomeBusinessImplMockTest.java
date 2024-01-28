package com.pwright.mockito.mockitodemo.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SomeBusinessImplMockTest {

	@Mock
	private DataService dataServiceMock;

	@InjectMocks
	private SomeBusinessImpl businessImpl;

	@Test
	void findTheGreatestFromAllData_basicScenario() {
		
		// Mocks are simpler to write, and easier to maintain
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 25, 15, 5 });
		assertEquals(25, businessImpl.findTheGreatestFromAllData());
	}

	@Test
	void findTheGreatestFromAllData_oneValueScenario() {
		
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 35 });
		assertEquals(35, businessImpl.findTheGreatestFromAllData());
	}
}
