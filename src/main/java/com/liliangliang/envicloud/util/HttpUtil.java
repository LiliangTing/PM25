package com.liliangliang.envicloud.util;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HttpUtil {
	private static Logger logger = LoggerFactory.getLogger(HttpUtil.class);

	public static String HttpGetJson(String... args) {
		String url = "";
		for (String s : args) {
			url += s;
		}
		// 创建默认的httpClient实例
		CloseableHttpClient httpClient = getHttpClient();
		try {
			// 用get方法发送http请求
			HttpGet get = new HttpGet(url);
			logger.info("执行get请求:...." + get.getURI());
			CloseableHttpResponse httpResponse = null;
			// 发送get请求
			httpResponse = httpClient.execute(get);
			try {
				// response实体
				HttpEntity entity = httpResponse.getEntity();
				if (null != entity) {
					return EntityUtils.toString(entity);
				}
			} finally {
				httpResponse.close();
			}
		} catch (Exception e) {
			return "";
		} finally {
			try {
				closeHttpClient(httpClient);
			} catch (IOException e) {
				return "";
			}
		}
		return "";
	}

	/**
	 * 获取默认HttpClient
	 * 
	 * @return
	 */
	private static CloseableHttpClient getHttpClient() {
		return HttpClients.createDefault();
	}

	/**
	 * 关闭HttpClient
	 * 
	 * @param client
	 * @throws IOException
	 */
	private static void closeHttpClient(CloseableHttpClient client)
			throws IOException {
		if (client != null) {
			client.close();
		}
	}

}