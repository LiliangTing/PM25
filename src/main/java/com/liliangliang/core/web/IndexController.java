package com.liliangliang.core.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.liliangliang.core.dao.CityAirDAO;
import com.liliangliang.core.dao.CityDAO;
import com.liliangliang.core.dao.JsonsDAO;
import com.liliangliang.core.entry.City;
import com.liliangliang.core.task.ScheduledTask;
import com.liliangliang.envicloud.entry.EnvicloudCities;
import com.liliangliang.envicloud.entry.EnvicloudCity;
import com.liliangliang.envicloud.entry.EnvicloudJsons;
import com.liliangliang.envicloud.util.EnvicloudInfo;
import com.liliangliang.envicloud.util.HttpUtil;
import com.liliangliang.envicloud.util.JsonUtil;

@Controller
public class IndexController {
	@Autowired
	private CityDAO cityDAO;
	@Autowired
	private JsonsDAO jsonsDAO;
	@Autowired
	private CityAirDAO cityAirDAO;
	@Autowired
	private ScheduledTask scheduledTask;

	@GetMapping("getCitys")
	public void getCitys() {
		String jsons = HttpUtil.HttpGetJson(EnvicloudInfo.BASISURL, EnvicloudInfo.VERSION, EnvicloudInfo.AIR_CITIES,
				EnvicloudInfo.ACCESSKEY);
		this.jsonsDAO.insert(new EnvicloudJsons(jsons, EnvicloudInfo.AIR_CITIES));
		EnvicloudCities e = JsonUtil.jsonConver(jsons, EnvicloudCities.class, null);
		for (EnvicloudCity ec : e.getCities()) {
			this.cityDAO.setAqiCode(ec.getCitycode());
		}
	}

	@GetMapping("getAri")
	public String getAir() {
		try {
			scheduledTask.getCityAir();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "正在获取";
	}
	
	@GetMapping("updatecityname")
	public String updatecityname() {
		List<City> list = this.cityDAO.getByType(1);
		for (City c : list) {
			this.cityAirDAO.setCotyname(c.getCityname(), c.getCitycode());
		}
		return "完成";
	}

}