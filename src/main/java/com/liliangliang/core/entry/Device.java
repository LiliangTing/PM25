package com.liliangliang.core.entry;

/**
 * 监测点信息
 * 
 * @author Administrator
 * 
 */
public class Device {
	// 城市编码
	private String citycode;
	// 设备编号
	private String devid;
	// 监测点名称
	private String stationname;
	// 地理经度
	private String lng;
	// 地理纬度
	private String lat;

	public String getCitycode() {
		return citycode;
	}

	public void setCitycode(String citycode) {
		this.citycode = citycode;
	}

	public String getDevid() {
		return devid;
	}

	public void setDevid(String devid) {
		this.devid = devid;
	}

	public String getStationname() {
		return stationname;
	}

	public void setStationname(String stationname) {
		this.stationname = stationname;
	}

	public String getLng() {
		return lng;
	}

	public void setLng(String lng) {
		this.lng = lng;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	@Override
	public String toString() {
		return "设备信息 [城市编码=" + citycode + ", 设备编号=" + devid + ", 监测点名称="
				+ stationname + ", 地理经度=" + lng + ", 地理纬度=" + lat + "]";
	}

}
