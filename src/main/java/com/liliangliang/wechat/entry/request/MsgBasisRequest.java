package com.liliangliang.wechat.entry.request;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * @作者 李亮亮
 * @日期2017年8月9日 下午4:48:36
 * 
 */
public class MsgBasisRequest extends BasisRequest {
	@JsonProperty(value = "MsgId")
	private long msgId;

	public long getMsgId() {
		return msgId;
	}

	public void setMsgId(long msgId) {
		this.msgId = msgId;
	}

	@Override
	public String toString() {
		return "MsgBasisRequest [msgId=" + msgId + ", " + super.toString()
				+ "]";
	}

}
