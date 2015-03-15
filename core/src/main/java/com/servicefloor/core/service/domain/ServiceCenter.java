package com.servicefloor.core.service.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "servicecenters")
public class ServiceCenter {
	@Id
	private String serviceCenterId;
	private String serviceCenterName;
	private String sellerId;
	private String categoryId;

	private ServiceCenterRateCard serviceCenterRateCard;
	private ServiceCenterLocation serviceCenterLocation;
	private ServiceCenterPic serviceCenterPic;

	private ServiceCenter() {

	}

	static ServiceCenter Create(ServiceCenterBuilder serviceCenterBuilder) {
		ServiceCenter serviceCenter = new ServiceCenter();
		serviceCenter.serviceCenterId = serviceCenterBuilder.serviceCenterId;
		serviceCenter.serviceCenterName = serviceCenterBuilder.serviceCenterName;
		serviceCenter.sellerId = serviceCenterBuilder.sellerId;
		serviceCenter.categoryId = serviceCenterBuilder.categoryId;
		serviceCenter.serviceCenterRateCard = serviceCenterBuilder.serviceCenterRateCard;
		serviceCenter.serviceCenterLocation = serviceCenterBuilder.serviceCenterLocation;
		serviceCenter.serviceCenterPic = serviceCenterBuilder.serviceCenterPic;
		return serviceCenter;
	}

	public ServiceCenterRateCard getServiceCenterRateCard() {
		return serviceCenterRateCard;
	}

	public ServiceCenterLocation getServiceCenterLocation() {
		return serviceCenterLocation;
	}

	public ServiceCenterPic getServiceCenterPic() {
		return serviceCenterPic;
	}

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
}
