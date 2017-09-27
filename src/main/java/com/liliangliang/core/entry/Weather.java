package com.liliangliang.core.entry;

import java.io.Serializable;
import java.util.Date;

/**
 * 天气预报和指数
 * 
 * @author Administrator
 * 
 */
public class Weather implements Serializable{
	private int id;
	// 城市编码
	private String citycode;
	// 记录创建时间
	private Date createTime;
	// 更新时间
	private Date updatetime;
	// 天气现象
	private String phenomena;
	// 气温
	private String temperature;
	// 体感温度
	private String feelst;
	// 气压
	private String airpressure;
	// 相对湿度
	private String humidity;
	// 降雨量
	private String rain;
	// 风向
	private String winddirect;
	// 风力
	private String windpower;
	// 风速
	private String windspeed;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCitycode() {
		return citycode;
	}

	public void setCitycode(String citycode) {
		this.citycode = citycode;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	public String getPhenomena() {
		return phenomena;
	}

	public void setPhenomena(String phenomena) {
		this.phenomena = phenomena;
	}

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	public String getFeelst() {
		return feelst;
	}

	public void setFeelst(String feelst) {
		this.feelst = feelst;
	}

	public String getAirpressure() {
		return airpressure;
	}

	public void setAirpressure(String airpressure) {
		this.airpressure = airpressure;
	}

	public String getHumidity() {
		return humidity;
	}

	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}

	public String getRain() {
		return rain;
	}

	public void setRain(String rain) {
		this.rain = rain;
	}

	public String getWinddirect() {
		return winddirect;
	}

	public void setWinddirect(String winddirect) {
		this.winddirect = winddirect;
	}

	public String getWindpower() {
		return windpower;
	}

	public void setWindpower(String windpower) {
		this.windpower = windpower;
	}

	public String getWindspeed() {
		return windspeed;
	}

	public void setWindspeed(String windspeed) {
		this.windspeed = windspeed;
	}

	@Override
	public String toString() {
		return "天气 [编号=" + id + ", 城市编码=" + citycode + ", 创建时间=" + createTime
				+ ", 记录更新时间=" + updatetime + ", 天气现象=" + phenomena + ", 气温="
				+ temperature + ", 体感温度=" + feelst + ", 气压=" + airpressure
				+ ", 相对湿度=" + humidity + ", 降雨量=" + rain + ", 风向=" + winddirect
				+ ", 风力=" + windpower + ", 风速=" + windspeed + "]";
	}

}
