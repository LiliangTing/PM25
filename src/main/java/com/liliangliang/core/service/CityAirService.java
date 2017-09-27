package com.liliangliang.core.service;

import java.util.List;

import com.liliangliang.core.entry.CityAir;
import com.liliangliang.core.entry.MapData;
import com.liliangliang.envicloud.entry.EnvicloudCityAirLive;

public interface CityAirService {

	List<CityAir> getByNew();

	List<MapData> getMapByNew();

	void create(EnvicloudCityAirLive e);

	/**
	 * 清空缓存
	 */
	void reload();
}
