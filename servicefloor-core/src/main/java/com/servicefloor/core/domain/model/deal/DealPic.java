package com.servicefloor.core.domain.model.deal;

import java.util.List;

public class DealPic {
	String mainPic;
	String summaryPic;
	List<String> pics;

	private DealPic() {

	}

	static DealPic create(String mainPic, String summaryPic, List<String> pics) {
		DealPic dealPic = new DealPic();
		dealPic.mainPic = mainPic;
		dealPic.summaryPic = summaryPic;
		dealPic.pics = pics;
		return dealPic;
	}
}
