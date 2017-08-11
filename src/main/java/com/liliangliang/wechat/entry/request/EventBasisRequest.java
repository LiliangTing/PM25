package com.liliangliang.wechat.entry.request;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 微信推送的事件消息
 * 
 * @作者 李亮亮
 * @日期2017年8月9日 下午4:51:58
 * 
 */
public class EventBasisRequest extends BasisRequest {
	/**
	 * 推送事件类型
	 */
	@JsonProperty("Event")
	private String event;

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	@Override
	public String toString() {
		return "EventBasisRequest [event=" + event + ", " + super.toString()
				+ "]";
	}

}
