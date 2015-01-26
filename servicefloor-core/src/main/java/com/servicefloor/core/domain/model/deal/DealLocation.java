package com.servicefloor.core.domain.model.deal;

public class DealLocation {
	String address;
	String phoneNumber;

	private DealLocation() {

	}

	static DealLocation create(String address, String phoneNumber) {
		DealLocation dealLocation = new DealLocation();
		dealLocation.address = address;
		dealLocation.phoneNumber = phoneNumber;
		return dealLocation;
	}
}
