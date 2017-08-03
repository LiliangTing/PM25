package com.liliangliang.core.dao;

import java.util.List;

import com.liliangliang.core.entry.CityAir;
import com.liliangliang.core.entry.MapData;
import com.liliangliang.envicloud.entry.EnvicloudCityAirLive;

public interface CityAirDAO {

	int insert(EnvicloudCityAirLive cityair);

	List<CityAir> getNew();

	List<MapData> getNewMapData();

}
