package com.servicefloor.core.service.manager;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.servicefloor.core.service.domain.Service;
import com.servicefloor.core.service.domain.ServiceCenter;
import com.servicefloor.core.service.domain.ServiceCenterBuilder;
import com.servicefloor.core.service.domain.ServiceCenterRateCardCategory;
import com.servicefloor.core.service.domain.ServiceCenterRepository;
import com.servicefloor.core.service.dto.ServiceCenterDto;
import com.servicefloor.core.service.dto.ServiceCenterRateCardCategoryDto;
import com.servicefloor.core.service.dto.ServiceDto;

@Component("serviceManager")
public class ServiceManagerImpl implements ServiceManager {

	private static final Logger LOG = LoggerFactory
			.getLogger(ServiceManagerImpl.class.getName());

	@Autowired
	private ServiceCenterRepository serviceCenterRepository;

	public void addServiceCenter(ServiceCenterDto serviceCenterDto) {
		ServiceCenterBuilder serviceCenterBuilder = new ServiceCenterBuilder(
				serviceCenterDto.getServiceCenterName(),
				serviceCenterDto.getSellerId(),
				serviceCenterDto.getCategoryId());

		serviceCenterBuilder.serviceCenterLocation(
				serviceCenterDto.getAddress(), serviceCenterDto.getLandline(),
				serviceCenterDto.getMobile());

		serviceCenterBuilder.serviceCenterPic(serviceCenterDto.getMainPic(),
				serviceCenterDto.getThumbnailPic());

		serviceCenterBuilder.serviceCenterRateCard(
				serviceCenterDto.getServices(),
				serviceCenterDto.getServiceCenterRateCardCatDtoList());

		ServiceCenter serviceCenter = serviceCenterBuilder.build();
		serviceCenterRepository.save(serviceCenter);
	}

	public ServiceCenterDto findServiceCenterById(String serviceCenterId) {
		ServiceCenter serviceCenter = serviceCenterRepository
				.findServiceCenterById(serviceCenterId);
		if (serviceCenter == null)
			throw new IllegalArgumentException(
					"No service center found for serviceCenterId "
							+ serviceCenterId);
		return mapServiceCenterToDto(serviceCenter);
	}

	public List<ServiceDto> findServicesByCategory(String categoryId) {
		List<ServiceCenter> serviceCenters = serviceCenterRepository
				.findServiceCenterByCategory(categoryId);
		if (serviceCenters == null || serviceCenters.size() == 0)
			throw new IllegalArgumentException(
					"No service found for category id " + categoryId);
		List<ServiceDto> result = new ArrayList<ServiceDto>();
		for (ServiceCenter serviceCenter : serviceCenters) {
			List<Service> services = serviceCenter.getServiceCenterRateCard()
					.getServices();
			result = mapServicesToDto(services, serviceCenter);
		}
		return result;
	}

	private ServiceCenterDto mapServiceCenterToDto(ServiceCenter serviceCenter) {
		ServiceCenterDto serviceCenterDto = new ServiceCenterDto();
		serviceCenterDto.setServiceCenterId(serviceCenter.getServiceCenterId());
		serviceCenterDto.setServiceCenterName(serviceCenter
				.getServiceCenterName());
		serviceCenterDto.setSellerId(serviceCenter.getSellerId());
		serviceCenterDto.setCategoryId(serviceCenter.getCategoryId());
		serviceCenterDto.setLandline(serviceCenter.getServiceCenterLocation()
				.getLandline());
		serviceCenterDto.setAddress(serviceCenter.getServiceCenterLocation()
				.getAddress());
		serviceCenterDto.setMobile(serviceCenter.getServiceCenterLocation()
				.getMobile());
		serviceCenterDto.setMainPic(serviceCenter.getServiceCenterPic()
				.getMainPic());
		serviceCenterDto.setThumbnailPic(serviceCenter.getServiceCenterPic()
				.getThumbnailPic());
		serviceCenterDto.setServices(mapServicesToDto(serviceCenter
				.getServiceCenterRateCard().getServices(), serviceCenter));
		serviceCenterDto
				.setServiceCenterRateCardCatDtoList(mapServiceCenterRateCardCategoriesToDto(
						serviceCenter.getServiceCenterRateCard()
								.getServiceCenterRateCardCategories(),
						serviceCenter));
		return serviceCenterDto;
	}

	private List<ServiceDto> mapServicesToDto(List<Service> services,
			ServiceCenter serviceCenter) {
		List<ServiceDto> result = new ArrayList<ServiceDto>();
		for (Service service : services) {
			ServiceDto serviceDto = new ServiceDto();
			serviceDto.setServiceId(service.getServiceId());
			serviceDto.setOriginalPrice(service.getServicePrice()
					.getOriginalPrice());
			serviceDto.setDiscountedPrice(service.getServicePrice()
					.getDiscountedPrice());
			serviceDto.setServiceName(service.getServiceName());
			serviceDto.setServiceCenterId(serviceCenter.getServiceCenterId());
			result.add(serviceDto);
		}
		return result;
	}

	private List<ServiceCenterRateCardCategoryDto> mapServiceCenterRateCardCategoriesToDto(
			List<ServiceCenterRateCardCategory> serviceCenterRateCardCats,
			ServiceCenter serviceCenter) {
		List<ServiceCenterRateCardCategoryDto> result = new ArrayList<ServiceCenterRateCardCategoryDto>();
		for (ServiceCenterRateCardCategory serviceCenterRateCardCategory : serviceCenterRateCardCats) {
			ServiceCenterRateCardCategoryDto serviceCenterRateCardCategoryDto = new ServiceCenterRateCardCategoryDto();
			serviceCenterRateCardCategoryDto
					.setCategoryId(serviceCenterRateCardCategory
							.getCategoryId());
			serviceCenterRateCardCategoryDto
					.setCategoryName(serviceCenterRateCardCategory
							.getCategoryName());
			result.add(serviceCenterRateCardCategoryDto);
		}
		return result;
	}
}
