package com.servicefloor.core.service.domain;

import java.math.BigDecimal;

public class ServicePrice {
	BigDecimal originalPrice;
	BigDecimal discountedPrice;

	private ServicePrice() {

	}

	static ServicePrice create(BigDecimal originalPrice,
			BigDecimal discountedPrice) {
		ServicePrice servicePrice = new ServicePrice();
		servicePrice.originalPrice = originalPrice;
		servicePrice.discountedPrice = discountedPrice;
		return servicePrice;
	}
}
