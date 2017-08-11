package com.liliangliang.wechat.entry.request;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 微信请求的文本消息
 * 
 * @作者 李亮亮
 * @日期2017年8月9日 下午3:44:02
 * 
 */
public class TextRequest extends MsgBasisRequest {
	/**
	 * 文本消息正文
	 */
	@JsonProperty("Content")
	private String content;
	

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "TextRequest [content=" + content + ", " + super.toString()
				+ "]";
	}

}
