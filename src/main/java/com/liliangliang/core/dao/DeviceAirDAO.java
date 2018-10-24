package com.liliangliang.core.dao;

import com.liliangliang.core.entry.DeviceAir;

import java.util.List;

public interface DeviceAirDAO {


  List<DeviceAir> getByNew(String cityName);

  List<DeviceAir> getByDate(String date);
}
