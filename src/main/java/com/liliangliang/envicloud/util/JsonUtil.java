package com.liliangliang.envicloud.util;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {
	private static ObjectMapper om = new ObjectMapper();

	/**
	 * 输入Json转化为Json数组
	 * 
	 * @param strJson
	 * @return
	 */
	public static <T> T jsonConver(String strJson, Class<T> c, Class<T> backup) {
		if (strJson.indexOf("error") != -1) {
			return null;
		}
		om.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		try {
			return om.readValue(strJson, c);
		} catch (JsonProcessingException e) {
			return null;

		} catch (IOException e) {
			return null;
		}

	}

	public static String beanToJson(Object o) {
		try {
			return om.writeValueAsString(o);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			return null;
		}

	}

}
