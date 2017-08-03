package com.liliangliang.envicloud.entry;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 一个城市所有监测点的数据
 * 
 * @author Administrator
 * 
 */
public class EnvicloudCityAllDevice extends EnvicloudResultInfo {
	static DateFormat format = null;
	static {
		format = new SimpleDateFormat("yyyyMMddhh");

	}
	private String citycode;
	private String cityname;
	private Date time;
	private List<EnvicloudDeviceAir> info;

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

	public Date getTime() {
		return time;
	}

	public void setTime(String time) {
		try {
			this.time = format.parse(time);
		} catch (ParseException e) {
			this.time = null;
		}
	}

	public List<EnvicloudDeviceAir> getInfo() {
		return info;
	}

	public void setInfo(List<EnvicloudDeviceAir> info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return "EnvicloudCityAllDevice [citycode=" + citycode + ", cityname="
				+ cityname + ", time=" + time + ", info=" + info + "]";
	}

}
