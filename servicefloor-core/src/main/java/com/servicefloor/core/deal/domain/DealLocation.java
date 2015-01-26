package com.servicefloor.core.deal.domain;

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
