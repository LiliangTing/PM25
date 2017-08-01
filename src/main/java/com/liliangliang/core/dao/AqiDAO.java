package com.liliangliang.core.dao;

import java.util.List;

import com.liliangliang.core.entry.CityAir;
import com.liliangliang.core.entry.MapData;

public interface AqiDAO {

	int insertList(List<CityAir> list);

	int insert(CityAir cityair);

	List<CityAir> getNow();

	List<MapData> getMapData();

}
