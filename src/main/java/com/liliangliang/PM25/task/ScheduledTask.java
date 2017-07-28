package com.liliangliang.PM25.task;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.liliangliang.PM25.entry.Aqi;
import com.liliangliang.PM25.service.AqiService;
import com.liliangliang.PM25.service.JsonsService;
import com.liliangliang.PM25.util.AppInfo;
import com.liliangliang.PM25.util.HttpUtil;
import com.liliangliang.PM25.util.JsonUtil;

@Component
public class ScheduledTask {
	@Autowired
	private AqiService aqiService;
	@Autowired
	private JsonsService jsonsService;

	

	@Scheduled(cron = "0 53 * * * ?")
	public void reportCurrentTimeCron() throws InterruptedException {
		String json = HttpUtil.HttpGetJson(AppInfo.url+AppInfo.tocken);
		System.out.println(new Date());
		List<Aqi> list = JsonUtil.jsonConver(json);
		if (list == null) {
			this.jsonsService.insert(json, 0);
			System.out.println("失败！10分钟后重试");
			Thread.sleep(600000);
			reportCurrentTimeCron();
		} else {
			this.aqiService.insert(list);
			this.jsonsService.insert(json, 1);
			System.out.println("完成");
		}
	}

}
