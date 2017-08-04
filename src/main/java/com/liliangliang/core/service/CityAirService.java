package com.liliangliang.core.service;

import java.util.List;

import com.liliangliang.core.entry.CityAir;
import com.liliangliang.core.entry.MapData;

public interface CityAirService {

	List<CityAir> getByNew();
	
	List<MapData> getMapByNew();
}
