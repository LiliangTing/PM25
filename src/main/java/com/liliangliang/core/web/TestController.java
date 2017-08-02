package com.liliangliang.core.web;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.liliangliang.core.dao.CityDAO;
import com.liliangliang.core.dao.DeviceDAO;
import com.liliangliang.core.entry.City;
import com.liliangliang.envicloud.entry.EnvicloudCities;
import com.liliangliang.envicloud.entry.EnvicloudCity;
import com.liliangliang.envicloud.entry.EnvicloudDevices;
import com.liliangliang.envicloud.util.EnvicloudInfo;
import com.liliangliang.envicloud.util.HttpUtil;
import com.liliangliang.envicloud.util.JsonUtil;

@Controller
public class TestController {
	@Autowired
	private DeviceDAO device;
	@Autowired
	private CityDAO cityDAO;

	@RequestMapping("/device")
	@ResponseBody
	public String device() {
		List<City> citys = this.cityDAO.getByType(1);
		for (City city : citys) {
			String jsons = HttpUtil.HttpGetJson(EnvicloudInfo.BASISURL,
					EnvicloudInfo.VERSION, EnvicloudInfo.AIR_DIVICES,
					EnvicloudInfo.ACCESSKEY, "/", city.getCitycode());
			EnvicloudDevices e = JsonUtil.jsonConver(jsons,
					EnvicloudDevices.class, null);
			this.device.insert(e);
		}
		return "成功";
	}

	@RequestMapping("/city")
	@ResponseBody
	public String city() {
		String jsons = HttpUtil.HttpGetJson(EnvicloudInfo.BASISURL,
				EnvicloudInfo.VERSION, EnvicloudInfo.AIR_CITIES,
				EnvicloudInfo.ACCESSKEY);
		System.out.println(jsons);
		EnvicloudCities c = JsonUtil.jsonConver(jsons, EnvicloudCities.class,
				null);
		Date start = new Date();
		for (EnvicloudCity city : c.getCities()) {
			this.cityDAO.setAqiCode(city.getCitycode());
		}
		System.out.println(start.getTime() - (new Date().getTime()));
		return "成功";
	}
}
