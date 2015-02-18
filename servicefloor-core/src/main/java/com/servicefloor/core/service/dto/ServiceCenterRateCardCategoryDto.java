package com.servicefloor.core.service.dto;

public class ServiceCenterRateCardCategoryDto {
	private String categoryId;
	private String categoryName;

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

	@Override
	public String toString() {
		return "ServiceCenterRateCardCategoryDto [categoryId=" + categoryId
				+ ", categoryName=" + categoryName + "]";
	}
}
