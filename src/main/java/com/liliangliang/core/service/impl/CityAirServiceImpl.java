package com.liliangliang.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liliangliang.core.dao.CityAirDAO;
import com.liliangliang.core.entry.CityAir;
import com.liliangliang.core.service.CityAirService;

@Service("cityAirService")
public class CityAirServiceImpl implements CityAirService {
	@Autowired
	private CityAirDAO cityAirDAO;

	public List<CityAir> getByNew() {
		return this.cityAirDAO.getNew();
	}

}
