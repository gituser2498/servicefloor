package com.servicefloor.core.deal.domain;

import java.util.List;

public class DealHighlight {
	List<String> highlights;

	private DealHighlight() {

	}

	static DealHighlight create(List<String> highlights) {
		DealHighlight dealHighlight = new DealHighlight();
		dealHighlight.highlights = highlights;
		return dealHighlight;
	}
}
