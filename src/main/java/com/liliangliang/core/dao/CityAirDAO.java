package com.liliangliang.core.dao;

import java.util.Date;
import java.util.List;

import com.liliangliang.core.entry.CityAir;
import com.liliangliang.core.dto.MapData;

public interface CityAirDAO {


  List<CityAir> getNew();

  List<MapData> getNewMapData();


  List<CityAir> getByDate(Date date);

}
