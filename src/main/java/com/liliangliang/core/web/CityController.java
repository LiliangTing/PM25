package com.liliangliang.core.web;

import java.util.List;

import com.liliangliang.core.entry.DeviceAir;
import com.liliangliang.core.service.CityAirService;
import com.liliangliang.core.service.DeviceAirService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.liliangliang.core.dto.MapData;

import com.liliangliang.core.entry.CityAir;

/**
 * 空气质量相关
 *
 * @author Administrator
 */
@RequestMapping("/")
@Controller
public class CityController {

  @Autowired
  private CityAirService cityAirService;
  @Autowired
  private DeviceAirService deviceAirService;

  /**
   * 获取最新的一组城市数据
   *
   * @param model
   * @return
   */
  @RequestMapping("/index")
  public String cityAir(Model model) {
    List<CityAir> list = this.cityAirService.getByNew();
    model.addAttribute("list", list);
    return "index";
  }


  /**
   * 获取最新的一组城市数据
   *
   * @param model
   * @return
   */
  @GetMapping("/detail/{cityName}")
  public String getCityDetail(Model model, @PathVariable("cityName") String cityName) {
    List<DeviceAir> list = deviceAirService.getByNew(cityName);
    model.addAttribute("list", list);
    return "detail";
  }

  /**
   * 获取最新的一组城市数据
   *
   * @param model
   * @return
   */
  @GetMapping("/{date}")
  public String getCityByDate(Model model, @PathVariable("date") String date) {
    List<CityAir> list = cityAirService.getByDate(date);
    model.addAttribute("list", list);
    return "history";
  }

  @GetMapping("/history")
  public String getCityNew(Model model) {
    List<CityAir> list = cityAirService.getByNew();
    model.addAttribute("list", list);
    return "history";
  }

  /**
   * 获取最新的一组城市数据
   *
   * @param model
   * @return
   */
  @GetMapping("/detail/{cityName}/{date}")
  public String getCityDetail(Model model, @PathVariable("cityName") String cityName,
                              @PathVariable("date")String date) {
    List<DeviceAir> list = deviceAirService.getByNew(cityName);
    model.addAttribute("list", list);
    return "detail";
  }

  /**
   * 前往地图显示页面
   *
   * @return
   */
  @RequestMapping("/map")
  public String tomap() {
    return "map";
  }

  @RequestMapping("/mapdata")
  @ResponseBody
  public List<MapData> getMapdata() {
    return this.cityAirService.getMapByNew();
  }

}
