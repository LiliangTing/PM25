package com.liliangliang.wechat.entry.request;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 微信请求的位置消息
 * 
 * @作者 李亮亮
 * @日期2017年8月9日 下午3:42:48
 * 
 */
public class LocationRequest extends MsgBasisRequest {
	/**
	 * 地理纬度
	 */
	@JsonProperty("Location_X")
	private String locationX;
	/**
	 * 地理经度
	 */
	@JsonProperty("Location_Y")
	private String locationY;
	/**
	 * 缩放级别
	 */
	@JsonProperty("Scale")
	private int scale;
	/**
	 * 地理位置消息
	 */
	@JsonProperty("Lable")
	private String lable;

	@JsonProperty(value = "MsgId", required = false)
	private long msgId;

	public String getLocationX() {
		return locationX;
	}

	public void setLocationX(String locationX) {
		this.locationX = locationX;
	}

	public String getLocationY() {
		return locationY;
	}

	public void setLocationY(String locationY) {
		this.locationY = locationY;
	}

	public int getScale() {
		return scale;
	}

	public void setScale(int scale) {
		this.scale = scale;
	}

	public String getLable() {
		return lable;
	}

	public void setLable(String lable) {
		this.lable = lable;
	}

	public long getMsgId() {
		return msgId;
	}

	public void setMsgId(long msgId) {
		this.msgId = msgId;
	}

	@Override
	public String toString() {
		return "LocationRequest [locationX=" + locationX + ", locationY="
				+ locationY + ", scale=" + scale + ", lable=" + lable
				+ ", msgId=" + msgId + ", " + super.toString() + "]";
	}

}
