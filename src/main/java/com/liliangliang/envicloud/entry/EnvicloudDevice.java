package com.liliangliang.envicloud.entry;
/**
 * 监测点信息
 * @author Administrator
 *
 */
public class EnvicloudDevice {

	private String devid;
	private String stationname;
	private String lng;
	private String lat;
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
		return "监测点信息 [监测点编号=" + devid + ", 监测点名称=" + stationname
				+ ", lng=" + lng + ", lat=" + lat + "]";
	}
	
}
