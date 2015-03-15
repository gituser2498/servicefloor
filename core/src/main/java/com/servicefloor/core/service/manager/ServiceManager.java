package com.servicefloor.core.service.manager;

import java.util.List;

import com.servicefloor.core.service.dto.ServiceCenterDto;
import com.servicefloor.core.service.dto.ServiceDto;

public interface ServiceManager {

	public abstract void addServiceCenter(ServiceCenterDto serviceCenterDto);

	public abstract ServiceCenterDto findServiceCenterById(
			String serviceCenterId);

	public abstract List<ServiceDto> findServicesByCategory(String categoryId);

}