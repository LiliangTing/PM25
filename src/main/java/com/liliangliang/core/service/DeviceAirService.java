package com.liliangliang.core.service;

import com.liliangliang.core.dao.DeviceAirDAO;
import com.liliangliang.core.entry.DeviceAir;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceAirService {
  @Autowired
  private DeviceAirDAO deviceAirDAO;


  public List<DeviceAir> getByNew(String cityName){
    return deviceAirDAO.getByNew(cityName);
  }


  public List<DeviceAir> getByDate(String date){
    return deviceAirDAO.getByDate(date);
  }
}
