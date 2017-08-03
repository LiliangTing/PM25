package com.liliangliang.core.web;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.liliangliang.core.dao.CityAirDAO;
import com.liliangliang.core.dao.CityDAO;
import com.liliangliang.core.dao.DeviceAirDAO;
import com.liliangliang.core.dao.DeviceDAO;
import com.liliangliang.core.dao.JsonsDAO;
import com.liliangliang.core.entry.City;
import com.liliangliang.envicloud.entry.EnvicloudCities;
import com.liliangliang.envicloud.entry.EnvicloudCity;
import com.liliangliang.envicloud.entry.EnvicloudCityAirLive;
import com.liliangliang.envicloud.entry.EnvicloudCityAllDevice;
import com.liliangliang.envicloud.entry.EnvicloudDevices;
import com.liliangliang.envicloud.entry.EnvicloudJsons;
import com.liliangliang.envicloud.util.EnvicloudInfo;
import com.liliangliang.envicloud.util.HttpUtil;
import com.liliangliang.envicloud.util.JsonUtil;

@Controller
public class TestController {
	@Autowired
	private DeviceDAO device;
	@Autowired
	private CityDAO cityDAO;
	@Autowired
	private JsonsDAO jsonsDAO;
	@Autowired
	private CityAirDAO cityAirDAO;
	@Autowired
	private DeviceAirDAO deviceAirDAO;
	@Autowired
	private DeviceDAO deviceDAO;

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

	@RequestMapping("/cityairlive")
	@ResponseBody
	public String cityairlive() {

		List<City> list = this.cityDAO.getByType(1);
		for (City c : list) {
			String jsons = HttpUtil.HttpGetJson(EnvicloudInfo.BASISURL,
					EnvicloudInfo.VERSION, EnvicloudInfo.CITYAIRLIVE,
					EnvicloudInfo.ACCESSKEY, "/", c.getCitycode());
			this.jsonsDAO.insert(new EnvicloudJsons(jsons,
					EnvicloudInfo.CITYAIRLIVE));
			EnvicloudCityAirLive e = JsonUtil.jsonConver(jsons,
					EnvicloudCityAirLive.class, null);
			this.cityAirDAO.insert(e);
		}
		return "成功";
	}

	@RequestMapping("/deviceAir")
	@ResponseBody
	public String deviceAir() {
		List<City> list = this.cityDAO.getByType(1);
		for (City c : list) {
			String jsons = HttpUtil.HttpGetJson(EnvicloudInfo.BASISURL,
					EnvicloudInfo.VERSION, EnvicloudInfo.AIR_LIVE_CIRT,
					EnvicloudInfo.ACCESSKEY, "/", c.getCitycode());
			this.jsonsDAO.insert(new EnvicloudJsons(jsons,
					EnvicloudInfo.CITYAIRLIVE));
			EnvicloudCityAllDevice e = JsonUtil.jsonConver(jsons,
					EnvicloudCityAllDevice.class, null);
			try {
				this.deviceAirDAO.insert(e);
				System.out.println(e.getCitycode() + "  " + e.getRcode());
				Thread.sleep(1000);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		return "成功";
	}
}
