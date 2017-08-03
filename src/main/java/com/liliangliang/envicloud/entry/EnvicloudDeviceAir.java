package com.liliangliang.envicloud.entry;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 监测点数据
 * 
 * @author Administrator
 * 
 */
public class EnvicloudDeviceAir {
	@JsonProperty(value = "AQI")
	private String aqi;
	@JsonProperty(value = "PM25")
	private String pm25;
	@JsonProperty(value = "PM10")
	private String pm10;
	@JsonProperty(value = "CO")
	private String co;
	@JsonProperty(value = "SO2")
	private String so2;
	@JsonProperty(value = "NO2")
	private String no2;
	private String o3;
	private String prkey;
	private String devid;
	private String stationname;
	public String getAqi() {
		return aqi;
	}
	public void setAqi(String aqi) {
		this.aqi = aqi;
	}
	public String getPm25() {
		return pm25;
	}
	public void setPm25(String pm25) {
		this.pm25 = pm25;
	}
	public String getPm10() {
		return pm10;
	}
	public void setPm10(String pm10) {
		this.pm10 = pm10;
	}
	public String getCo() {
		return co;
	}
	public void setCo(String co) {
		this.co = co;
	}
	public String getSo2() {
		return so2;
	}
	public void setSo2(String so2) {
		this.so2 = so2;
	}
	public String getNo2() {
		return no2;
	}
	public void setNo2(String no2) {
		this.no2 = no2;
	}
	public String getO3() {
		return o3;
	}
	public void setO3(String o3) {
		this.o3 = o3;
	}
	public String getPrkey() {
		return prkey;
	}
	public void setPrkey(String prkey) {
		this.prkey = prkey;
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
	@Override
	public String toString() {
		return "监测点数据详情 [aqi=" + aqi + ", pm25=" + pm25 + ", pm10="
				+ pm10 + ", co=" + co + ", so2=" + so2 + ", no2=" + no2
				+ ", o3=" + o3 + ", prkey=" + prkey + ", devid=" + devid
				+ ", stationname=" + stationname + "]";
	}

}
