package com.servicefloor.core.service.domain;

import java.math.BigDecimal;

public class Service {
	private String serviceId;
	private String serviceName;
	private ServicePrice servicePrice;
	private String serviceSubCategoryId;

	private Service() {

	}

	static Service create(String serviceId, String serviceName,
			String serviceSubCategoryId, BigDecimal originalPrice,
			BigDecimal discountedPrice) {
		Service service = new Service();
		ServicePrice servicePrice = ServicePrice.create(originalPrice,
				discountedPrice);
		service.serviceId = serviceId;
		service.serviceName = serviceName;
		service.servicePrice = servicePrice;
		service.serviceSubCategoryId = serviceSubCategoryId;
		return service;
	}
}
