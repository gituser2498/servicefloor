package com.servicefloor.core.service.domain;

public class ServiceCenterPic {
	private String mainPic;
	private String thumbnailPic;

	private ServiceCenterPic() {

	}

	static ServiceCenterPic Create(String mainPic, String thumbnailPic) {
		ServiceCenterPic serviceCenterPic = new ServiceCenterPic();
		serviceCenterPic.mainPic = mainPic;
		serviceCenterPic.thumbnailPic = thumbnailPic;
		return serviceCenterPic;
	}

	public String getMainPic() {
		return mainPic;
	}

	public String getThumbnailPic() {
		return thumbnailPic;
	}
}
