package com.liliangliang.wechat.util;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.liliangliang.wechat.entry.request.BasisRequest;
import com.liliangliang.wechat.entry.request.ImageRequest;
import com.liliangliang.wechat.entry.request.LocationRequest;
import com.liliangliang.wechat.entry.request.TextRequest;
import com.liliangliang.wechat.entry.request.VoiceRequest;

public class XmlUtil {

	public static <T> T xmlToBean(String xml, Class<T> cls) throws IOException {
		XmlMapper xmlMapper = new XmlMapper();
		xmlMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,
				false);
		T obj = xmlMapper.readValue(xml, cls);
		return obj;
	}

	public static String beanToXml(Object bean) throws JsonProcessingException {
		XmlMapper xmlMapper = new XmlMapper();
		return xmlMapper.writeValueAsString(bean);

	}

	public static void main(String[] args) {

		String xml = "<xml>" + "<ToUserName><![CDATA[toUser]]></ToUserName>"
				+ "<FromUserName><![CDATA[fromUser]]></FromUserName>"
				+ "<CreateTime>1348831860</CreateTime>"
				+ "<MsgType><![CDATA[voice]]></MsgType>"
				+ "<MediaId><![CDATA[media_id]]></MediaId>"
				+ "<Format><![CDATA[Format]]></Format>"
				+ "<MsgId>1234567890123456</MsgId>" + "</xml>";
		try {
			BasisRequest b = xmlToBean(xml, BasisRequest.class);
			switch (b.getMsgType()) {
			case "text":
				System.out.println(xmlToBean(xml, TextRequest.class));
				break;
			case "image":
				System.out.println(xmlToBean(xml, ImageRequest.class));
				break;
			case "voice":
				System.out.println(xmlToBean(xml, VoiceRequest.class));
				break;
			case "location":
				System.out.println(xmlToBean(xml, LocationRequest.class));
				break;
			default:
				System.out.println("不支持类型");
				break;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		/*
		 * BasisRequest b = new BasisRequest(); b.setCreateTime(11111);
		 * b.setFromUserName("FromUserName"); b.setMsgId("text");
		 * b.setToUserName("toUserName"); try { String s = beanToXml(b);
		 * System.out.println(s); } catch (JsonProcessingException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
	}
}
