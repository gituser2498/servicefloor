package com.servicefloor.core.domain.model.deal;

import java.util.List;

public class DealFinePrint {
	List<String> validity;
	List<String> generalFinePrint;

	private DealFinePrint() {

	}

	static DealFinePrint create(List<String> validity,
			List<String> generalFinePrint) {
		DealFinePrint dealFinePrint = new DealFinePrint();
		dealFinePrint.validity = validity;
		dealFinePrint.generalFinePrint = generalFinePrint;
		return dealFinePrint;
	}
}
