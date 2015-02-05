package com.servicefloor.core.service.domain;

import java.util.ArrayList;
import java.util.List;

import com.servicefloor.core.service.dto.ServiceDto;
import com.servicefloor.core.service.dto.ServiceSubCategoryDto;

public class ServiceCenterRateCard {

	List<ServiceSubCategory> serviceSubCategories;
	List<Service> services;

	private ServiceCenterRateCard() {

	}

	static ServiceCenterRateCard Create(List<ServiceDto> servicesDto,
			List<ServiceSubCategoryDto> serviceSubCategoryDtoList) {
		ServiceCenterRateCard serviceCenterRateCard = new ServiceCenterRateCard();
		List<Service> services = new ArrayList<Service>();
		for (ServiceDto serviceDto : servicesDto) {
			services.add(Service.create(serviceDto.getServiceId(),
					serviceDto.getServiceName(),
					serviceDto.getServiceSubCategoryId(),
					serviceDto.getOriginalPrice(),
					serviceDto.getDiscountedPrice()));
		}

		List<ServiceSubCategory> serviceSubCategories = new ArrayList<ServiceSubCategory>();
		for (ServiceSubCategoryDto serviceSubCategoryDto : serviceSubCategoryDtoList) {
			serviceSubCategories.add(ServiceSubCategory.Create(
					serviceSubCategoryDto.getServiceSubCategoryId(),
					serviceSubCategoryDto.getServiceSubCategoryName()));
		}
		return serviceCenterRateCard;
	}
}
