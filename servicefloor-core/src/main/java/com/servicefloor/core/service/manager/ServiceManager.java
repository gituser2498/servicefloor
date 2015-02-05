package com.servicefloor.core.service.manager;

import com.servicefloor.core.service.domain.ServiceCenter;
import com.servicefloor.core.service.domain.ServiceCenterBuilder;
import com.servicefloor.core.service.domain.ServiceCenterRepository;
import com.servicefloor.core.service.dto.ServiceCenterDto;

public class ServiceManager {

	private ServiceCenterRepository serviceCenterRepository;

	public void addServiceCenter(ServiceCenterDto serviceCenterDto) {
		ServiceCenterBuilder serviceCenterBuilder = new ServiceCenterBuilder(
				serviceCenterDto.getServiceCenterId(),
				serviceCenterDto.getServiceCenterName(),
				serviceCenterDto.getSellerId());

		serviceCenterBuilder.serviceCenterLocation(
				serviceCenterDto.getAddress(), serviceCenterDto.getLandline(),
				serviceCenterDto.getMobile());

		serviceCenterBuilder.serviceCenterPic(serviceCenterDto.getMainPic(),
				serviceCenterDto.getThumbnailPic());

		serviceCenterBuilder.serviceCenterRateCard(
				serviceCenterDto.getServices(),
				serviceCenterDto.getServiceSubCategories());

		ServiceCenter serviceCenter = serviceCenterBuilder.build();
		serviceCenterRepository.save(serviceCenter);
	}
}
