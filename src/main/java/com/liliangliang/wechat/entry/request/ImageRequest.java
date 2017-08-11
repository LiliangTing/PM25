package com.liliangliang.wechat.entry.request;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 微信请求的图片消息
 * 
 * @作者 李亮亮
 * @日期2017年8月9日 下午3:43:06
 * 
 */
public class ImageRequest extends MsgBasisRequest {
	/**
	 * 图片链接,微信生成,但链接不指向图片地址
	 */
	@JsonProperty("PicUrl")
	private String picUrl;
	/**
	 * 媒体消息类型,用于多媒体文件下载接口,下载数据
	 */
	@JsonProperty("MediaId")
	private String mediaId;

	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getMediaId() {
		return mediaId;
	}

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}

	@Override
	public String toString() {
		return "ImageRequest [picUrl=" + picUrl + ", mediaId=" + mediaId
				+ super.toString() + "]";
	}

}
