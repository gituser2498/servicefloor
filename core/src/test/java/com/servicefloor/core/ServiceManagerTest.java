package com.servicefloor.core;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.servicefloor.core.service.dto.ServiceCenterDto;
import com.servicefloor.core.service.dto.ServiceCenterRateCardCategoryDto;
import com.servicefloor.core.service.dto.ServiceDto;
import com.servicefloor.core.service.manager.ServiceManager;
import com.servicefloor.core.service.manager.ServiceManagerImpl;

public class ServiceManagerTest {
	public static void main(String args[]) {
		addServiceCenterTest();
		findServicesByCategoryTest("catId1");
		findServiceCenterByIdTest("87fecc936a044c81b551861662bc076b");
	}

	private static void findServiceCenterByIdTest(String serviceCenterId) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"servicefloor-core.xml");

		ServiceManager serviceManager = ctx.getBean("serviceManager",
				ServiceManagerImpl.class);
		ServiceCenterDto serviceCenterDto = serviceManager
				.findServiceCenterById(serviceCenterId);
		System.out.println("********Found for id query***********"
				+ serviceCenterDto.toString());
		ctx.close();
	}

	private static void findServicesByCategoryTest(String categoryId) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"servicefloor-core.xml");

		ServiceManager serviceManager = ctx.getBean("serviceManager",
				ServiceManagerImpl.class);
		List<ServiceDto> serviceDtoList = serviceManager
				.findServicesByCategory(categoryId);
		System.out.println("********Found for category query***********"
				+ serviceDtoList);
		ctx.close();

	}

	private static void addServiceCenterTest() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"servicefloor-core.xml");

		ServiceManager serviceManager = ctx.getBean("serviceManager",
				ServiceManagerImpl.class);

		ServiceDto serviceDto = new ServiceDto();
		serviceDto.setDiscountedPrice(new BigDecimal(100));
		serviceDto.setOriginalPrice(new BigDecimal(500));
		serviceDto.setServiceId("1");
		serviceDto.setServiceName("new service");
		serviceDto.setServiceSubCategoryId("1");

		ServiceCenterRateCardCategoryDto serviceCenterRateCardCategoryDto = new ServiceCenterRateCardCategoryDto();
		serviceCenterRateCardCategoryDto.setCategoryId("1");
		serviceCenterRateCardCategoryDto.setCategoryName("subCategory");

		List<ServiceDto> services = new ArrayList<ServiceDto>();
		services.add(serviceDto);

		List<ServiceCenterRateCardCategoryDto> serviceCenterRateCardCatDtoList = new ArrayList<ServiceCenterRateCardCategoryDto>();
		serviceCenterRateCardCatDtoList.add(serviceCenterRateCardCategoryDto);

		ServiceCenterDto serviceCenterDto = new ServiceCenterDto();
		serviceCenterDto.setAddress("Address");
		serviceCenterDto.setLandline("123456");
		serviceCenterDto.setMainPic("images/mainpic.png");
		serviceCenterDto.setMobile("99999");
		serviceCenterDto.setSellerId("1");
		serviceCenterDto.setServiceCenterName("serviceCenter");
		serviceCenterDto.setServices(services);
		serviceCenterDto.setCategoryId("catId1");
		serviceCenterDto
				.setServiceCenterRateCardCatDtoList(serviceCenterRateCardCatDtoList);

		serviceManager.addServiceCenter(serviceCenterDto);

		ctx.close();
	}
}
