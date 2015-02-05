package com.servicefloor.core.service.dto;

import java.util.List;

public class ServiceCenterDto {
	private String serviceCenterId;
	private String serviceCenterName;
	private String sellerId;

	private String address;
	private String landline;
	private String mobile;

	private String mainPic;
	private String thumbnailPic;

	private List<ServiceDto> services;
	private List<ServiceSubCategoryDto> serviceSubCategories;

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

	public List<ServiceDto> getServices() {
		return services;
	}

	public void setServices(List<ServiceDto> services) {
		this.services = services;
	}

	public List<ServiceSubCategoryDto> getServiceSubCategories() {
		return serviceSubCategories;
	}

	public void setServiceSubCategories(
			List<ServiceSubCategoryDto> serviceSubCategories) {
		this.serviceSubCategories = serviceSubCategories;
	}

}
