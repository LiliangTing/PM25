package com.liliangliang.PM25.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.liliangliang.PM25.entry.Aqi;
import com.liliangliang.PM25.service.AqiService;

@Controller
@RequestMapping("/aqi")
public class AqiController {
	@Autowired
	private AqiService sqiService;

	@RequestMapping("/test")
	public String test() {

		Aqi a = new Aqi();
		a.setAqi(11);
		a.setArea("河南");
		a.setCo(22.3);
		a.setCo_24h(22.2);
		a.setNo2(22);
		a.setNo2_24h(2);
		a.setO3(22);
		a.setO3_24h(2);
		a.setO3_8h(33);
		a.setO3_8h_24h(44);
		a.setPm10(22);
		a.setPm10_24h(33);
		a.setPm2_5(22);
		a.setPm2_5_24h(33);
		a.setPosition_name("监测点");
		a.setPrimary_pollutant("主要污染物");
		a.setQuality("良");
		a.setSo2(22);
		a.setSo2_24h(33);
		a.setTime_point("2017-07-27T09:00:00Z");
		List<Aqi> list = new ArrayList<Aqi>();
		for (int i = 0; i < 3; i++) {
			list.add(a);
		}
		System.out.println(this.sqiService.insert(list));
		return "完成";
	}

}
