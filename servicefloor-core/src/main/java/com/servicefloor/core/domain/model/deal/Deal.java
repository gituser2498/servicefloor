package com.servicefloor.core.domain.model.deal;

public class Deal {
	private String id;
	private String title;
	private String sellerId;
	private DealTime dealTime;
	private DealHighlight dealHighlight;
	private DealFinePrint dealFinePrint;
	private DealPrice dealPrice;
	private DealPic dealPic;
	private DealInventory dealInventory;
	private DealLocation dealLocation;

	private Deal() {

	}

	static Deal create(DealBuilder dealBuilder) {
		Deal deal = new Deal();
		deal.id = dealBuilder.id;
		deal.title = dealBuilder.title;
		deal.sellerId = dealBuilder.sellerId;
		deal.dealTime = dealBuilder.dealTime;
		deal.dealHighlight = dealBuilder.dealHighlight;
		deal.dealFinePrint = dealBuilder.dealFinePrint;
		deal.dealPrice = dealBuilder.dealPrice;
		deal.dealPic = dealBuilder.dealPic;
		deal.dealInventory = dealBuilder.dealInventory;
		deal.dealLocation = dealBuilder.dealLocation;
		return deal;
	}
}
