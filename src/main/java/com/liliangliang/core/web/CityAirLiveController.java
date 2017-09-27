package com.liliangliang.core.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.liliangliang.core.entry.CityAir;
import com.liliangliang.core.entry.MapData;
import com.liliangliang.core.service.CityAirService;

/**
 * 空气质量相关
 * 
 * @author Administrator
 * 
 */
@RequestMapping("/live")
@RestController
public class CityAirLiveController {

	@Autowired
	private CityAirService cityAirService;

	/**
	 * 获取最新的一组城市数据
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/cityAirlive")
	public List<CityAir> cityAir(Model model) {
		List<CityAir> list = this.cityAirService.getByNew();
		return list;
	}

	@GetMapping("/getMapdata")
	public List<MapData> getMapdata() {
		return this.cityAirService.getMapByNew();
	}

}
