package com.liliangliang.core.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.liliangliang.core.dao.CityAirDAO;
import com.liliangliang.core.entry.CityAir;
import com.liliangliang.core.entry.MapData;
import com.liliangliang.core.service.CityAirService;
import com.liliangliang.envicloud.entry.EnvicloudCityAirLive;

@Service("cityAirService")
public class CityAirServiceImpl implements CityAirService {

	private static final Logger LOGGER = Logger.getLogger(CityAirServiceImpl.class);
	@Autowired
	private CityAirDAO cityAirDAO;

	public List<CityAir> getByNew() {

		return this.cityAirDAO.getNew();

	}

	@Override
	@Cacheable(cacheNames = "mapdata")
	public List<MapData> getMapByNew() {
		return this.cityAirDAO.getNewMapData();
	}

	@Override
	public void create(EnvicloudCityAirLive e) {
		cityAirDAO.insert(e);

	}

	@Override
	@CacheEvict(value = "mapdata", allEntries = true) // 清空缓存
	public void reload() {
	}
}
