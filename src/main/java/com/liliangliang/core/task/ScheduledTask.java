package com.liliangliang.core.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.liliangliang.core.service.CityAirService;
import com.liliangliang.core.service.JsonsService;

@Component
public class ScheduledTask {
	@Autowired
	private CityAirService aqiService;
	@Autowired
	private JsonsService jsonsService;

	@Scheduled(cron = "0 53 * * * ?")
	public void reportCurrentTimeCron() throws InterruptedException {

	}

}
