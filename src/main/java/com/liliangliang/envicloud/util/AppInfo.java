package com.liliangliang.envicloud.util;

public class AppInfo {
	
	public static final String url="http://www.pm25.in/api/querys/aqis_by_station.json?tocken=";
	public static final String tocken="5j1znBVAsnSf5xQyNQyq";

	public static final String CITY = "&city="; //城市选项

	public static final String STATION_CODE= "&station_code=";//监测点代号

	/** 获取一个城市所有监测点的PM2.5数据
	 *  1、city 必选
	 *  2、avg 可选(默认 true) 是否返回一个城市所有监测点数据均值的标识
	 *  3、stations 可选(默认 yes) 是否只返回一个城市均值的标识
	 */
	public static final String QUERY_PM2_5_BY_CITY = "http://www.pm25.in/api/querys/pm2_5.json?token=" + tocken;


	/** 获取一个城市所有监测点的PM10数据
	 *  1、city 必选
	 *  2、avg 可选(默认 true) 是否返回一个城市所有监测点数据均值的标识
	 *  3、stations 可选(默认 yes) 是否只返回一个城市均值的标识
	 */
	public static final String QUERY_PM_10_BY_CITY = "http://www.pm25.in/api/querys/pm10.json?token=" + tocken;

	/** 获取一个城市所有监测点的CO数据
	 *  1、city 必选
	 *  2、avg 可选(默认 true) 是否返回一个城市所有监测点数据均值的标识
	 *  3、stations 可选(默认 yes) 是否只返回一个城市均值的标识
	 */
	public static final String QUERY_CO_BY_CITY = "http://www.pm25.in/api/querys/co.json?token=" + tocken;

	/** 获取一个城市所有监测点的NO2数据
	 *  1、city 必选
	 *  2、avg 可选(默认 true) 是否返回一个城市所有监测点数据均值的标识
	 *  3、stations 可选(默认 yes) 是否只返回一个城市均值的标识
	 */
	public static final String QUERY_NO2_BY_CITY = "http://www.pm25.in/api/querys/no2.json?token=" + tocken;

	/** 获取一个城市所有监测点的SO2数据
	 *  1、city 必选
	 *  2、avg 可选(默认 true) 是否返回一个城市所有监测点数据均值的标识
	 *  3、stations 可选(默认 yes) 是否只返回一个城市均值的标识
	 */
	public static final String QUERY_SO2_BY_CITY = "http://www.pm25.in/api/querys/so2.json?token=" + tocken;

	/** 获取一个城市所有监测点的O3数据
	 *  1、city 必选
	 *  2、avg 可选(默认 true) 是否返回一个城市所有监测点数据均值的标识
	 *  3、stations 可选(默认 yes) 是否只返回一个城市均值的标识
	 */
	public static final String QUERY_O3_BY_CITY = "http://www.pm25.in/api/querys/o3.json?token=" + tocken;

	/** 获取一个城市所有监测点的AQI数据（含详情）
	 *  1、city 必选
	 *  2、avg 可选(默认 true) 是否返回一个城市所有监测点数据均值的标识
	 *  3、stations 可选(默认 yes) 是否只返回一个城市均值的标识
	 */
	public static final String QUERY_CITY_AQI_DETAILS = "http://www.pm25.in/api/querys/aqi_details.json?token=" + tocken;

	/** 获取一个城市所有监测点的AQI数据（不含详情，仅AQI）
	 *  1、city 必选
	 *  2、avg 可选(默认 true) 是否返回一个城市所有监测点数据均值的标识
	 *  3、stations 可选(默认 yes) 是否只返回一个城市均值的标识
	 */
	public static final String QUERY_CITY_ONLY_AQI = "http://www.pm25.in/api/querys/only_aqi.json?token=" + tocken;

	/** 获取一个监测点的AQI数据（含详情）
	 *  1、station_code 必选
	 */
	public static final String QUERY_AQIS_BY_STATION = "http://www.pm25.in/api/querys/aqis_by_station.json?token=" + tocken;

	/** 获取一个城市的监测点列表
	 *  1、city 必选
	 */
	public static final String QUERY_STATION_NAMES_BY_CITY = "http://www.pm25.in/api/querys/station_names.json?token=" + tocken;

	/** 获取实施了新《环境空气质量标准》的城市列表，即有PM2.5数据的城市列表
	 *  无
	 */
	public static final String QUERY_CITYS_PM2_5 = "http://www.pm25.in/api/querys.json?token=" + tocken;

	/** 获取所有城市的空气质量详细数据
	 *  无
	 */
	public static final String QUERY_ALL_CITY_DETAILS = "http://www.pm25.in/api/querys/all_cities.json?token=" + tocken;

	/** 获取全部城市的空气质量指数(AQI)排行榜
	 *  无
	 */
	public static final String QUERY_AQI_RANKING = "http://www.pm25.in/api/querys/aqi_ranking.json?token=" + tocken;
}
