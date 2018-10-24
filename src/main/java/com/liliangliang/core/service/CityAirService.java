package com.liliangliang.core.service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.SimpleFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.liliangliang.core.dto.MapData;

import com.liliangliang.core.dao.CityAirDAO;
import com.liliangliang.core.entry.CityAir;

@Service("cityAirService")
public class CityAirService {
  @Autowired
  private CityAirDAO cityAirDAO;

  public List<CityAir> getByNew() {
    return this.cityAirDAO.getNew();
  }

  public List<MapData> getMapByNew() {
    return this.cityAirDAO.getNewMapData();
  }

  public  List<CityAir> getByDate(String date){
    DateFormat formatter=new SimpleDateFormat("yyyy-MM-dd HH");
    try {
      Date date1 = formatter.parse(date);
      return cityAirDAO.getByDate(date1);
    }catch (ParseException e){
      e.printStackTrace();
      return new ArrayList<>();
    }

  }
}
