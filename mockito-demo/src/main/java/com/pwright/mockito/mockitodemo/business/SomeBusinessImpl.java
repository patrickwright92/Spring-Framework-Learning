package com.pwright.mockito.mockitodemo.business;

public class SomeBusinessImpl {

	private DataService dataService;

	public SomeBusinessImpl(DataService dataService) {
		super();
		this.dataService = dataService;
	}


	// Find the greatest value in all the data via DataService
	public int findTheGreatestFromAllData() {
		int[] data = dataService.retrieveAllData();
		int greatestValue = Integer.MIN_VALUE;

		for (int value : data) {
			if (value > greatestValue) {
				greatestValue = value;
			}
		}
		return greatestValue;
	}

}

interface DataService {
	int[] retrieveAllData();
}
