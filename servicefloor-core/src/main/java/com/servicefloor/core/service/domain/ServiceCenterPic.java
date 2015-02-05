package com.servicefloor.core.service.domain;

public class ServiceCenterPic {
	String mainPic;
	String thumbnailPic;

	private ServiceCenterPic() {

	}

	static ServiceCenterPic Create(String mainPic, String thumbnailPic) {
		ServiceCenterPic serviceCenterPic = new ServiceCenterPic();
		serviceCenterPic.mainPic = mainPic;
		serviceCenterPic.thumbnailPic = thumbnailPic;
		return serviceCenterPic;
	}
}
