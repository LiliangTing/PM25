package com.liliangliang.PM25.dao;

import java.util.List;

import com.liliangliang.PM25.entry.Aqi;

public interface AqiDAO {
	
	int insertList(List<Aqi> list);
	
	int insert(Aqi aqi);
	
	List<Aqi> getNow();
	

}
