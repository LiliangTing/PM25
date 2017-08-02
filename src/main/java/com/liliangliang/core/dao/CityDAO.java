package com.liliangliang.core.dao;

import java.util.List;

import com.liliangliang.core.entry.City;
import com.liliangliang.envicloud.entry.EnvicloudCities;

public interface CityDAO {
	/**
	 * 按照城市ID获取城市信息
	 * 
	 * @param citycode
	 * @return
	 */
	City getById(String citycode);

	/**
	 * 按照类型获取城市列表 0,1是否有空气质量
	 * 
	 * @param type
	 * @return
	 */
	List<City> getByType(int type);

	/**
	 * 
	 * @param name
	 * @return
	 */
	List<City> getByName(String name);

	/**
	 * 
	 * @param citycode
	 * @return
	 */
	String getNameById(String citycode);

	/**
	 * 插入操作
	 * 
	 * @param list
	 * @return
	 */
	int setAqiCode(String citycode);

}
