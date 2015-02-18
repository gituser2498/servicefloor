package com.servicefloor.core.service.domain;

import java.math.BigDecimal;

public class ServicePrice {
	private BigDecimal originalPrice;
	private BigDecimal discountedPrice;

	private ServicePrice() {

	}

	static ServicePrice create(BigDecimal originalPrice,
			BigDecimal discountedPrice) {
		ServicePrice servicePrice = new ServicePrice();
		servicePrice.originalPrice = originalPrice;
		servicePrice.discountedPrice = discountedPrice;
		return servicePrice;
	}

	public BigDecimal getOriginalPrice() {
		return originalPrice;
	}	

	public BigDecimal getDiscountedPrice() {
		return discountedPrice;
	}	
}
