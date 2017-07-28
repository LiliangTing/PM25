package com.liliangliang.PM25.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.liliangliang.PM25.entry.Aqi;
import com.liliangliang.PM25.service.AqiService;

@Controller
@RequestMapping("/aqi")
public class AqiController {
	@Autowired
	private AqiService sqiService;

	@GetMapping("/ranking")
	public String ranking(Model model) {
		List<Aqi> data = this.sqiService.getNow();
		model.addAttribute("list", data);
		return "index";
	}
}
