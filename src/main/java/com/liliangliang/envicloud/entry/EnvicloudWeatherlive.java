package com.liliangliang.envicloud.entry;


/**
 * 天气预报和指数
 * @author Administrator
 *
 */
public class EnvicloudWeatherlive extends EnvicloudResultInfo{
	
	private String updatetime;
	private String phenomena;
	private String temperature;
	private String feelst;
	private String airpressure;
	private String humidity;
	private String rain;
	private String winddirect;
	private String windpower;
	private String windspeed;
	public String getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(String updatetime) {
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
		return "实时天气 [更新时间=" + updatetime + ", 天气现象="
				+ phenomena + ", 气温=" + temperature + ", 体感温度="
				+ feelst + ", 气压=" + airpressure + ", 相对湿度="
				+ humidity + ", 降雨量=" + rain + ", 风向=" + winddirect
				+ ", 风力=" + windpower + ", 风速=" + windspeed + "]";
	}
	
	
	

}
