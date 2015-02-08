package com.servicefloor.core.infrastructure.db.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Component;

import com.servicefloor.core.service.domain.ServiceCenter;
import com.servicefloor.core.service.domain.ServiceCenterRepository;

@Component("serviceCenterRepository")
public class MongoServiceCenterRepository implements ServiceCenterRepository {

	private static final String SERVICE_CENTER_COLLECTION = "ServiceCenter";

	@Autowired
	private MongoOperations mongoOps;

	public void save(ServiceCenter serviceCenter) {
		mongoOps.insert(serviceCenter, SERVICE_CENTER_COLLECTION);
	}
}
