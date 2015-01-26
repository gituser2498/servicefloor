package com.servicefloor.core.domain.model.deal;

import java.math.BigDecimal;

public class DealPrice {
	BigDecimal originalPrice;
	BigDecimal discountedPrice;

	private DealPrice() {

	}

	static DealPrice create(BigDecimal originalPrice, BigDecimal discountedPrice) {
		DealPrice dealPrice = new DealPrice();
		dealPrice.originalPrice = originalPrice;
		dealPrice.discountedPrice = discountedPrice;
		return dealPrice;
	}
}
