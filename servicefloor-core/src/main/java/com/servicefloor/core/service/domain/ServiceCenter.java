package com.servicefloor.core.service.domain;

public class ServiceCenter {
	private String serviceCenterId;
	private String serviceCenterName;
	private String sellerId;

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
		serviceCenter.serviceCenterRateCard = serviceCenterBuilder.serviceCenterRateCard;
		serviceCenter.serviceCenterLocation = serviceCenterBuilder.serviceCenterLocation;
		serviceCenter.serviceCenterPic = serviceCenterBuilder.serviceCenterPic;
		return serviceCenter;
	}
}
