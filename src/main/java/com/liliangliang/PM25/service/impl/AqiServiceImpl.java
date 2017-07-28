package com.liliangliang.PM25.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liliangliang.PM25.dao.AqiDAO;
import com.liliangliang.PM25.entry.Aqi;
import com.liliangliang.PM25.service.AqiService;

@Service("aqiService")
public class AqiServiceImpl implements AqiService {

	@Autowired
	private AqiDAO aqiDAO;

	@Override
	public int insert(List<Aqi> list) {
		return this.aqiDAO.insertList(list);
	}

	@Override
	public int insert(Aqi aqi) {
		return this.aqiDAO.insert(aqi);
	}

}
