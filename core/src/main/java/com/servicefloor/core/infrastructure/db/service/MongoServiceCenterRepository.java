package com.servicefloor.core.infrastructure.db.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.BasicQuery;
import org.springframework.stereotype.Component;

import com.servicefloor.core.service.domain.ServiceCenter;
import com.servicefloor.core.service.domain.ServiceCenterRepository;

@Component("serviceCenterRepository")
public class MongoServiceCenterRepository implements ServiceCenterRepository {

	private static final String SERVICE_CENTER_COLLECTION = "servicecenters";

	@Autowired
	private MongoOperations mongoOps;

	public void save(ServiceCenter serviceCenter) {
		mongoOps.insert(serviceCenter, SERVICE_CENTER_COLLECTION);
	}

	public ServiceCenter findServiceCenterById(String serviceCenterId) {
		BasicQuery queryById = new BasicQuery("{ serviceCenterId : '"
				+ serviceCenterId + "'}");
		return mongoOps.findOne(queryById, ServiceCenter.class);
	}

	public List<ServiceCenter> findServiceCenterByCategory(String categoryId) {
		BasicQuery queryByCategory = new BasicQuery("{ categoryId : '"
				+ categoryId + "'}");
		return mongoOps.find(queryByCategory, ServiceCenter.class);
	}
}
