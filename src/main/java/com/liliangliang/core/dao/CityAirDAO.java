package com.liliangliang.core.dao;

import java.util.List;

import com.liliangliang.core.entry.CityAir;
import com.liliangliang.core.entry.MapData;
import com.liliangliang.envicloud.entry.EnvicloudCityAirLive;

public interface CityAirDAO {

	int insertSql(EnvicloudCityAirLive cityair);

	List<CityAir> getNow();

	List<MapData> getMapData();

}
