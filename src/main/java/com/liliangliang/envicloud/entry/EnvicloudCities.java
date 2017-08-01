package com.liliangliang.envicloud.entry;

import java.util.List;

/**
 * 获取地级市信息
 * 
 * @author Administrator
 * 
 */
public class EnvicloudCities extends EnvicloudResultInfo {

	private List<EnvicloudCity> cities;

	public List<EnvicloudCity> getCities() {
		return cities;
	}

	public void setCities(List<EnvicloudCity> cities) {
		this.cities = cities;
	}

	@Override
	public String toString() {
		String s = "Cities [cities=";
		for (EnvicloudCity c : cities) {
			s += c.toString();
		}
		return s += "]";

	}

}
