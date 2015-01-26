package com.servicefloor.core.deal.domain;

public class DealInventory {
	long totalNumberOfDeals;
	long numberOfDealsRemaining;

	private DealInventory() {

	}

	static DealInventory create(long totalNumberOfDeals,
			long numberOfDealsRemaining) {
		DealInventory dealInventory = new DealInventory();
		dealInventory.totalNumberOfDeals = totalNumberOfDeals;
		dealInventory.numberOfDealsRemaining = numberOfDealsRemaining;
		return dealInventory;
	}
}
