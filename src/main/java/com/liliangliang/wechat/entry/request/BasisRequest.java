package com.liliangliang.wechat.entry.request;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 微信请求的基本信息
 * 
 * @作者 李亮亮
 * @日期2017年8月9日 下午3:44:26
 * 
 */
// 重命名节点名@JacksonXmlRootElement(localName = "xml")
public class BasisRequest {
	/**
	 * 接受者OpenId(你的公众好ID)
	 */
	@JsonProperty("ToUserName")
	private String toUserName;
	/**
	 * 发送者的公众号ID (粉丝的公众号ID)
	 */
	@JsonProperty("FromUserName")
	private String fromUserName;
	/**
	 * 创建时间戳,可以记录用户活跃时间
	 */
	@JsonProperty("CreateTime")
	private long createTime;
	/**
	 * 消息类型(文本,图片,语音,地理位置,视频,小视频,链接)
	 */
	@JsonProperty("MsgType")
	private String msgType;

	public String getToUserName() {
		return toUserName;
	}

	public void setToUserName(String toUserName) {
		this.toUserName = toUserName;
	}

	public String getFromUserName() {
		return fromUserName;
	}

	public void setFromUserName(String fromUserName) {
		this.fromUserName = fromUserName;
	}

	public long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(long createTime) {
		this.createTime = createTime;
	}

	public String getMsgType() {
		return msgType;
	}

	public void setMsgType(String msgType) {
		this.msgType = msgType;

	}

	@Override
	public String toString() {
		return "BasisRequest [toUser=" + toUserName + ", fromUserName="
				+ fromUserName + ", createTime=" + createTime + ", msgType="
				+ msgType + "]";
	}

}
