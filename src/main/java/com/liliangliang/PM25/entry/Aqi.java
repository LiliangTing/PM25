package com.liliangliang.PM25.entry;
/**
 * 
 * @author Administrator
 *
 */
public class Aqi {

	private int aqi;
	private String area;
	private int pm2_5;
	private int pm2_5_24h;
	private String position_name;
	private String primary_pollutant;
	private String quality;
	private String station_code;
	private String time_point;

	public int getAqi() {
		return aqi;
	}

	public void setAqi(int aqi) {
		this.aqi = aqi;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getPm2_5() {
		return pm2_5;
	}

	public void setPm2_5(int pm2_5) {
		this.pm2_5 = pm2_5;
	}

	public int getPm2_5_24h() {
		return pm2_5_24h;
	}

	public void setPm2_5_24h(int pm2_5_24h) {
		this.pm2_5_24h = pm2_5_24h;
	}

	public String getPosition_name() {
		return position_name;
	}

	public void setPosition_name(String position_name) {
		this.position_name = position_name;
	}

	public String getPrimary_pollutant() {
		return primary_pollutant;
	}

	public void setPrimary_pollutant(String primary_pollutant) {
		this.primary_pollutant = primary_pollutant;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	public String getStation_code() {
		return station_code;
	}

	public void setStation_code(String station_code) {
		this.station_code = station_code;
	}

	public String getTime_point() {
		return time_point;
	}

	public void setTime_point(String time_point) {
		this.time_point = time_point;
	}

	@Override
	public String toString() {
		return "Aqi [aqi=" + aqi + ", 地点=" + area + ", pm2.5" + pm2_5
				+ ", pm2.5一天平均值=" + pm2_5_24h + ", 检测点名称=" + position_name
				+ ", 主要污染物=" + primary_pollutant + ", 空气级别=" + quality
				+ ", 监测点编号=" + station_code + ", 时间=" + time_point + "]";
	}

}
