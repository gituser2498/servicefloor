package com.servicefloor.core.service.manager;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.servicefloor.core.service.domain.ServiceCenter;
import com.servicefloor.core.service.domain.ServiceCenterBuilder;
import com.servicefloor.core.service.domain.ServiceCenterRepository;
import com.servicefloor.core.service.dto.ServiceCenterDto;
import com.servicefloor.core.service.dto.ServiceDto;
import com.servicefloor.core.service.dto.ServiceSubCategoryDto;

@Component
public class ServiceManager {

	@Autowired
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

	public static void main(String args[]) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"servicefloor-core.xml");

		ServiceManager serviceManager = ctx.getBean("serviceManager",
				ServiceManager.class);

		ServiceDto serviceDto = new ServiceDto();
		serviceDto.setDiscountedPrice(new BigDecimal(100));
		serviceDto.setOriginalPrice(new BigDecimal(500));
		serviceDto.setServiceId("1");
		serviceDto.setServiceName("new service");
		serviceDto.setServiceSubCategoryId("1");

		ServiceSubCategoryDto serviceSubCategoryDto = new ServiceSubCategoryDto();
		serviceSubCategoryDto.setServiceSubCategoryId("1");
		serviceSubCategoryDto.setServiceSubCategoryName("subCategory");

		List<ServiceDto> services = new ArrayList<ServiceDto>();
		services.add(serviceDto);

		List<ServiceSubCategoryDto> serviceSubCategories = new ArrayList<ServiceSubCategoryDto>();
		serviceSubCategories.add(serviceSubCategoryDto);

		ServiceCenterDto serviceCenterDto = new ServiceCenterDto();
		serviceCenterDto.setAddress("Address");
		serviceCenterDto.setLandline("123456");
		serviceCenterDto.setMainPic("images/mainpic.png");
		serviceCenterDto.setMobile("99999");
		serviceCenterDto.setSellerId("1");
		serviceCenterDto.setServiceCenterId("1");
		serviceCenterDto.setServiceCenterName("serviceCenter");
		serviceCenterDto.setServices(services);
		serviceCenterDto.setServiceSubCategories(serviceSubCategories);

		serviceManager.addServiceCenter(serviceCenterDto);

		ctx.close();
	}
}
