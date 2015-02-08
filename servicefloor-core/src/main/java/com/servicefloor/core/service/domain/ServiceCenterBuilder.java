package com.servicefloor.core.service.domain;

import java.util.List;

import com.servicefloor.core.service.dto.ServiceDto;
import com.servicefloor.core.service.dto.ServiceSubCategoryDto;

public class ServiceCenterBuilder {
	String serviceCenterId;
	String serviceCenterName;
	String sellerId;

	ServiceCenterRateCard serviceCenterRateCard;
	ServiceCenterLocation serviceCenterLocation;
	ServiceCenterPic serviceCenterPic;

	public ServiceCenterBuilder(String serviceCenterId,
			String serviceCenterName, String sellerId) {
		this.serviceCenterId = serviceCenterId;
		this.serviceCenterName = serviceCenterName;
		this.sellerId = sellerId;
	}

	public ServiceCenterBuilder serviceCenterRateCard(
			List<ServiceDto> services,
			List<ServiceSubCategoryDto> serviceSubCategories) {
		this.serviceCenterRateCard = ServiceCenterRateCard.Create(services,
				serviceSubCategories);
		return this;
	}

	public ServiceCenterBuilder serviceCenterLocation(String address,
			String landline, String mobile) {
		this.serviceCenterLocation = ServiceCenterLocation.Create(address,
				landline, mobile);
		return this;
	}

	public ServiceCenterBuilder serviceCenterPic(String mainPic,
			String thumbnailPic) {
		this.serviceCenterPic = ServiceCenterPic.Create(mainPic, thumbnailPic);
		return this;
	}

	public ServiceCenter build() {
		return ServiceCenter.Create(this);
	}
}
