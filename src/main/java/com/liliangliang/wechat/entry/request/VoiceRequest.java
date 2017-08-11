package com.liliangliang.wechat.entry.request;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 微信请求的语音消息 包含了语音识别的消息(不强制包含)
 * 
 * @作者 Administrator
 * @日期2017年8月9日 下午3:39:48
 * 
 */
public class VoiceRequest extends MsgBasisRequest {
	/**
	 * 媒体ID,可以通过多媒体下载接口,下载文件
	 */
	@JsonProperty("MediaId")
	private String mediaId;
	/**
	 * 语音格式,amr,speex等
	 */
	@JsonProperty("Format")
	private String format;
	/**
	 * 开通语音识别后,识别后的文本
	 */
	@JsonProperty(value = "Recognition", required = false)
	private String recognition;

	public String getMediaId() {
		return mediaId;
	}

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public String getRecognition() {
		return recognition;
	}

	public void setRecognition(String recognition) {
		this.recognition = recognition;
	}

	@Override
	public String toString() {
		return "VoiceRequest [mediaId=" + mediaId + ", format=" + format
				+ ", recognition=" + recognition + super.toString() + "]";
	}

}
