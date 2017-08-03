package com.liliangliang.core.dao;

import java.util.List;

import com.liliangliang.envicloud.entry.EnvicloudDevices;

public interface DeviceDAO {

	int insert(EnvicloudDevices d);

	List<String> geyDevIdByAqicode(int aqicode);

}
