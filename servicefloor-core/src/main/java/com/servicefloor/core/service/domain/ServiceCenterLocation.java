package com.servicefloor.core.service.domain;

public class ServiceCenterLocation {
	String address;
	String landline;
	String mobile;

	private ServiceCenterLocation() {

	}

	static ServiceCenterLocation Create(String address, String landline,
			String mobile) {
		ServiceCenterLocation serviceCenterLocation = new ServiceCenterLocation();
		serviceCenterLocation.address = address;
		serviceCenterLocation.landline = landline;
		serviceCenterLocation.mobile = mobile;
		return serviceCenterLocation;
	}
}
