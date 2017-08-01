package com.liliangliang.envicloud.entry;

import java.util.List;

public class EnvicloudDevices extends EnvicloudResultInfo {

	private String citycode;
	private String cityname;
	private List<EnvicloudDevice> devices;

	public String getCitycode() {
		return citycode;
	}

	public void setCitycode(String citycode) {
		this.citycode = citycode;
	}

	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}

	public List<EnvicloudDevice> getDevices() {
		return devices;
	}

	public void setDevices(List<EnvicloudDevice> devices) {
		this.devices = devices;
	}

	@Override
	public String toString() {
		String s = "设备列表 [城市编号=" + citycode + ", 城市名称=" + cityname;
		for (EnvicloudDevice d : devices) {
			s += d.toString();
		}
		return s += "]";
	}

}
