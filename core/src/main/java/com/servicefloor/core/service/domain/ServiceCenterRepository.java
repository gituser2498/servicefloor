package com.servicefloor.core.service.domain;

import java.util.List;

public interface ServiceCenterRepository {
	public void save(ServiceCenter serviceCenter);
	
	public ServiceCenter findServiceCenterById(String serviceCenterId);

	public List<ServiceCenter> findServiceCenterByCategory(String categoryId);
}
