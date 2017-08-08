package com.liliangliang.core.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
@Controller
public class CityAirLiveController {

	@Autowired
	private CityAirService cityAirService;

	/**
	 * 获取最新的一组城市数据
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("/cityAirlive")
	public String cityAir(Model model) {
		List<CityAir> list = this.cityAirService.getByNew();
		model.addAttribute("list", list);
		return "index";
	}

	/**
	 * 前往地图显示页面
	 * 
	 * @return
	 */
	@RequestMapping("/tomap")
	public String tomap() {
		return "map";
	}

	@RequestMapping("/getMapdata")
	@ResponseBody
	public List<MapData> getMapdata() {
		return this.cityAirService.getMapByNew();
	}

}