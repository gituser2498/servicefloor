package com.servicefloor.core.service.dto;

import java.util.List;

public class ServiceCenterDto {
	private String serviceCenterId;
	private String serviceCenterName;
	private String sellerId;
	private String categoryId;

	private String address;
	private String landline;
	private String mobile;

	private String mainPic;
	private String thumbnailPic;

	private List<ServiceDto> services;
	private List<ServiceCenterRateCardCategoryDto> serviceCenterRateCardCatDtoList;

	public String getServiceCenterId() {
		return serviceCenterId;
	}

	public void setServiceCenterId(String serviceCenterId) {
		this.serviceCenterId = serviceCenterId;
	}

	public String getServiceCenterName() {
		return serviceCenterName;
	}

	public void setServiceCenterName(String serviceCenterName) {
		this.serviceCenterName = serviceCenterName;
	}

	public String getSellerId() {
		return sellerId;
	}

	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLandline() {
		return landline;
	}

	public void setLandline(String landline) {
		this.landline = landline;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getMainPic() {
		return mainPic;
	}

	public void setMainPic(String mainPic) {
		this.mainPic = mainPic;
	}

	public String getThumbnailPic() {
		return thumbnailPic;
	}

	public void setThumbnailPic(String thumbnailPic) {
		this.thumbnailPic = thumbnailPic;
	}

	public List<ServiceCenterRateCardCategoryDto> getServiceCenterRateCardCatDtoList() {
		return serviceCenterRateCardCatDtoList;
	}

	public void setServiceCenterRateCardCatDtoList(
			List<ServiceCenterRateCardCategoryDto> serviceCenterRateCardCatDtoList) {
		this.serviceCenterRateCardCatDtoList = serviceCenterRateCardCatDtoList;
	}

	public List<ServiceDto> getServices() {
		return services;
	}

	public void setServices(List<ServiceDto> services) {
		this.services = services;
	}

	@Override
	public String toString() {
		return "ServiceCenterDto [serviceCenterId=" + serviceCenterId
				+ ", serviceCenterName=" + serviceCenterName + ", sellerId="
				+ sellerId + ", categoryId=" + categoryId + ", address="
				+ address + ", landline=" + landline + ", mobile=" + mobile
				+ ", mainPic=" + mainPic + ", thumbnailPic=" + thumbnailPic
				+ ", services=" + services
				+ ", serviceCenterRateCardCatDtoList="
				+ serviceCenterRateCardCatDtoList + "]";
	}
}
