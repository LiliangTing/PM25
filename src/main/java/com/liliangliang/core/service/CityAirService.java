package com.liliangliang.core.service;

import java.util.List;
import com.liliangliang.core.dto.MapData;

import com.liliangliang.core.entry.CityAir;

public interface CityAirService {

	List<CityAir> getByNew();
	
	List<MapData> getMapByNew();
}
