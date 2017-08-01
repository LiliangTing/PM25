package com.liliangliang.core.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.liliangliang.core.entry.CityAir;
import com.liliangliang.core.entry.MapData;
import com.liliangliang.core.service.CityAirService;

@Controller
@RequestMapping("/aqi")
public class AqiController {
	@Autowired
	private CityAirService cityAirService;

	@GetMapping("/ranking")
	public String ranking(Model model) {
		List<CityAir> data = this.cityAirService.getNow();
		model.addAttribute("list", data);
		return "index";
	}

	@RequestMapping("/map")
	public String map() {
		return "map";
	}

	@RequestMapping("/getMapdata")
	@ResponseBody
	public List<MapData> getMapData() {
		return this.cityAirService.getMapData();

	}
}
