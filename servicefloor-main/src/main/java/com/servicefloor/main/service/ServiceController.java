package com.servicefloor.main.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.servicefloor.core.service.dto.ServiceCenterDto;
import com.servicefloor.core.service.dto.ServiceDto;
import com.servicefloor.core.service.manager.ServiceManager;

@RestController
@RequestMapping("/api/service")
public class ServiceController {

	private static final Logger LOG = LoggerFactory
			.getLogger(ServiceController.class.getName());

	@Autowired
	ServiceManager serviceManager;

	@RequestMapping(value = "/center", method = RequestMethod.POST, consumes = "application/json")
	@ResponseStatus(HttpStatus.OK)
	public void addServiceCenter(@RequestBody ServiceCenterDto serviceCenterDto) {
		LOG.info("Request to add new service center "
				+ serviceCenterDto.toString());

		serviceManager.addServiceCenter(serviceCenterDto);
	}

	@RequestMapping(value = "/center/{serviceCenterId}", method = RequestMethod.GET)
	public ServiceCenterDto findServiceCenterById(
			@PathVariable String serviceCenterId) {
		return serviceManager.findServiceCenterById(serviceCenterId);
	}

	@RequestMapping(value = "/category/{categoryId}", method = RequestMethod.GET)
	public List<ServiceDto> findServiceByCategory(
			@PathVariable String categoryId) {
		return serviceManager.findServicesByCategory(categoryId);
	}
}
