package com.servicefloor.core.service.dto;

import java.math.BigDecimal;

public class ServiceDto {
	private String serviceId;
	private String serviceName;
	private BigDecimal originalPrice;
	private BigDecimal discountedPrice;

	public String getServiceId() {
		return serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public BigDecimal getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(BigDecimal originalPrice) {
		this.originalPrice = originalPrice;
	}

	public BigDecimal getDiscountedPrice() {
		return discountedPrice;
	}

	public void setDiscountedPrice(BigDecimal discountedPrice) {
		this.discountedPrice = discountedPrice;
	}

	public String getServiceSubCategoryId() {
		return serviceSubCategoryId;
	}

	public void setServiceSubCategoryId(String serviceSubCategoryId) {
		this.serviceSubCategoryId = serviceSubCategoryId;
	}

	private String serviceSubCategoryId;
}
