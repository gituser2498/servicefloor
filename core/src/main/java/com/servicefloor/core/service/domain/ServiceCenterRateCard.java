package com.servicefloor.core.service.domain;

import java.util.ArrayList;
import java.util.List;

import com.servicefloor.core.service.dto.ServiceDto;
import com.servicefloor.core.service.dto.ServiceCenterRateCardCategoryDto;

public class ServiceCenterRateCard {

	private List<ServiceCenterRateCardCategory> serviceCenterRateCardCategories;
	private List<Service> services;

	private ServiceCenterRateCard() {

	}

	static ServiceCenterRateCard Create(
			List<ServiceDto> servicesDto,
			List<ServiceCenterRateCardCategoryDto> serviceCenterRateCardCatDtoList) {
		ServiceCenterRateCard serviceCenterRateCard = new ServiceCenterRateCard();
		List<Service> services = new ArrayList<Service>();
		for (ServiceDto serviceDto : servicesDto) {
			services.add(Service.create(serviceDto.getServiceId(),
					serviceDto.getServiceName(),
					serviceDto.getServiceSubCategoryId(),
					serviceDto.getOriginalPrice(),
					serviceDto.getDiscountedPrice()));
		}

		List<ServiceCenterRateCardCategory> serviceCenterRateCardCategories = new ArrayList<ServiceCenterRateCardCategory>();
		for (ServiceCenterRateCardCategoryDto serviceCenterRateCardCategoryDto : serviceCenterRateCardCatDtoList) {
			serviceCenterRateCardCategories
					.add(ServiceCenterRateCardCategory.Create(
							serviceCenterRateCardCategoryDto.getCategoryId(),
							serviceCenterRateCardCategoryDto.getCategoryName()));
		}

		serviceCenterRateCard.services = services;
		serviceCenterRateCard.serviceCenterRateCardCategories = serviceCenterRateCardCategories;

		return serviceCenterRateCard;
	}

	public List<Service> getServices() {
		return services;
	}

	public List<ServiceCenterRateCardCategory> getServiceCenterRateCardCategories() {
		return serviceCenterRateCardCategories;
	}
}
