package com.servicefloor.core.deal.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class DealBuilder {
	// required fields
	String id;
	String title;
	String sellerId;

	// optional fields
	DealTime dealTime;
	DealHighlight dealHighlight;
	DealFinePrint dealFinePrint;
	DealPrice dealPrice;
	DealPic dealPic;
	DealInventory dealInventory;
	DealLocation dealLocation;

	public DealBuilder(String id, String title, String sellerId) {
		this.id = id;
		this.title = title;
		this.sellerId = sellerId;
	}

	public Deal build() {
		return Deal.create(this);
	}

	public DealBuilder dealTime(Date startTime, Date endTime) {
		this.dealTime = DealTime.create(startTime, endTime);
		return this;
	}

	public DealBuilder dealHighlight(List<String> highlights) {
		this.dealHighlight = DealHighlight.create(highlights);
		return this;
	}

	public DealBuilder dealFinePrint(List<String> validity,
			List<String> generalFinePrint) {
		this.dealFinePrint = DealFinePrint.create(validity, generalFinePrint);
		return this;
	}

	public DealBuilder dealPrice(BigDecimal originalPrice,
			BigDecimal discountedPrice) {
		this.dealPrice = DealPrice.create(originalPrice, discountedPrice);
		return this;
	}

	public DealBuilder dealPic(String mainPic, String summaryPic,
			List<String> pics) {
		this.dealPic = DealPic.create(mainPic, summaryPic, pics);
		return this;
	}

	public DealBuilder dealInventory(long totalNumberOfDeals,
			long numberOfDealsRemaining) {
		this.dealInventory = DealInventory.create(totalNumberOfDeals,
				numberOfDealsRemaining);
		return this;
	}

	public DealBuilder dealLocation(String address, String phoneNumber) {
		this.dealLocation = DealLocation.create(address, phoneNumber);
		return this;
	}
}
