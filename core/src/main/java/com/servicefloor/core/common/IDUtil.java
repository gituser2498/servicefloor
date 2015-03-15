package com.servicefloor.core.common;

import java.util.UUID;

public class IDUtil {
	public static String generateUID() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
}
