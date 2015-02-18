package com.servicefloor.core.service.domain;

public class ServiceCenterLocation {
	private String address;
	private String landline;
	private String mobile;

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

	public String getAddress() {
		return address;
	}

	public String getLandline() {
		return landline;
	}

	public String getMobile() {
		return mobile;
	}
}
