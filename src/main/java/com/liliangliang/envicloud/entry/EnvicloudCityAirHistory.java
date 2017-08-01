package com.liliangliang.envicloud.entry;

import java.util.List;

public class EnvicloudCityAirHistory extends EnvicloudResultInfo {

	private List<EnvicloudCityAir> history;

	public List<EnvicloudCityAir> getHistory() {
		return history;
	}

	public void setHistory(List<EnvicloudCityAir> history) {
		this.history = history;
	}

	@Override
	public String toString() {
		String s = "相应状态码=" + getRcode() + ", 相应状态码解释=" + getRdesc();
		for (EnvicloudCityAir c : history) {
			s += c.toString();
		}
		return s;
	}

}
