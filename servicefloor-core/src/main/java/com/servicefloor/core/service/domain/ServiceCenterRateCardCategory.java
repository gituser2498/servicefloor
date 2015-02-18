package com.servicefloor.core.service.domain;

public class ServiceCenterRateCardCategory {
	private String categoryId;
	private String categoryName;

	private ServiceCenterRateCardCategory() {

	}

	static ServiceCenterRateCardCategory Create(String categoryId,
			String categoryName) {
		ServiceCenterRateCardCategory serviceSubCategory = new ServiceCenterRateCardCategory();
		serviceSubCategory.categoryId = categoryId;
		serviceSubCategory.categoryName = categoryName;
		return serviceSubCategory;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
}
