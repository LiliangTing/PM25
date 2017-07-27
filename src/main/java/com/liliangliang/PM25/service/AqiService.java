package com.liliangliang.PM25.service;

import java.util.List;

import com.liliangliang.PM25.entry.Aqi;

public interface AqiService {
	
	int insert(List<Aqi> list);
	
	int insert(Aqi aqi);

}
