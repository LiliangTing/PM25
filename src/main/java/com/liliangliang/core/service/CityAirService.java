package com.liliangliang.core.service;

import java.util.List;

import com.liliangliang.core.entry.CityAir;
import com.liliangliang.core.entry.MapData;



public interface CityAirService {

	int insert(List<CityAir> list);

	int insert(CityAir aqi);

	List<CityAir> getNow();

	List<MapData> getMapData();

}
