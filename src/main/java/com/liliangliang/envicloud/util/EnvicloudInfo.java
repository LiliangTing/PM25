package com.liliangliang.envicloud.util;

/**
 * 环境云信息
 * 
 * @author Administrator
 * 
 */
public class EnvicloudInfo {
	/**
	 * 用户私钥
	 */
	public static final String ACCESSKEY = "";
	/**
	 * 基础URL
	 */
	public static final String BASISURL = "http://service.envicloud.cn:8082";
	/**
	 * 环境云接口版本号
	 */
	public static final String VERSION = "/v2";

	/**
	 * 查询指定城市的天气实况 GET /v2/weatherlive/{accesskey}/{citycode}
	 */
	public static final String WEARTHERLIVE = "/weatherlive";
	/**
	 * 查询指定城市的空气质量实况 GET /v2/cityairlive/{accesskey}/{citycode}/{type}
	 */
	public static final String CITYAIRLIVE = "/cityairlive";
	/**
	 * 查询指定城市过去24小时的空气质量 GET /v2/cityairhistory/{accesskey}/{citycode}
	 */
	public static final String CITYAIRHISTORY = "/cityairhistory";
	/**
	 * 查询指定城市指定日期的空气质量 GET /v2/citydailyair/{accesskey}/{citycode}/{date}/{type}
	 */
	public static final String CITYDAILYAIR = "/citydailyair";
	/**
	 * 查询指定城市指定小时的空气质量 GET
	 * /v2/cityhourlyair/{accesskey}/{citycode}/{time}/{type}
	 */
	public static final String CITYHOURLYAIR = "/cityhourlyair";
	/**
	 * 查询空气质量支持的城市列表 GET /v2/air/cities/{accesskey}
	 */
	public static final String AIR_CITIES = "/air/cities";
	/**
	 * 查询指定城市的空气质量测点列表 GET /v2/air/devices/{accesskey}/{citycode}
	 */
	public static final String AIR_DIVICES = "/air/devices";
	/**
	 * 查询指定城市所有测点的空气质量实况 GET /v2/air/live/city/{accesskey}/{citycode}
	 */
	public static final String AIR_LIVE_CIRT = "/air/live/city";
	/**
	 * 查询指定测点的空气质量实况 GET /v2/air/live/device/{accesskey}/{devid}
	 */
	public static final String AIR_LIVE_DEVICE = "/air/live/device";
	/**
	 * 查询指定城市所有测点指定小时的空气质量 GET /v2/air/hourly/city/{accesskey}/{citycode}/{time}
	 */
	public static final String AIR_HOURLY_CITY = "/air/hourly";
	/**
	 * 查询指定测点指定小时的空气质量 GET /v2/air/hourly/device/{accesskey}/{devid}/{time}
	 */
	public static final String AIR_HOURLY_DEVICE = "/air/hourly/device";
	/**
	 * 查询指定测点指定日期的每小时空气质量 GET /v2/air/daily/device/{accesskey}/{devid}/{date}
	 */
	public static final String AIR_DAILY_DEVICE = "/air/daily/device";
}
