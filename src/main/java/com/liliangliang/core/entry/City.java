package com.liliangliang.core.entry;

import java.io.Serializable;

/**
 * 城市信息
 * 
 * @author Administrator
 * 
 */
public class City implements Serializable{

	private String citycode;
	private String cityname;
	private String belong;
	private String aqicode;

	public String getAqicode() {
		return aqicode;
	}

	public void setAqicode(String aqicode) {
		this.aqicode = aqicode;
	}

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

	public String getBelong() {
		return belong;
	}

	public void setBelong(String belong) {
		this.belong = belong;
	}

	@Override
	public String toString() {
		return "城市信息 [城市编号=" + citycode + ", 城市名称=" + cityname + ", 地级市名称="
				+ belong + "是否有空气质量" + aqicode + "]";
	}

}
