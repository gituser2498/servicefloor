package com.servicefloor.core.domain.model.deal;

import java.util.Date;

public class DealTime {
	private Date startTime;
	private Date endTime;

	private DealTime() {

	}

	static DealTime create(Date startTime, Date endTime) {
		DealTime dealTime = new DealTime();
		dealTime.startTime = startTime;
		dealTime.endTime = endTime;
		return dealTime;
	}
}
