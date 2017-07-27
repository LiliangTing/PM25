package com.liliangliang.PM25.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liliangliang.PM25.dao.JsonsDAO;
import com.liliangliang.PM25.entry.Jsons;
import com.liliangliang.PM25.service.JsonsService;

@Service
public class JsonsServiceImpl implements JsonsService {
	@Autowired
	private JsonsDAO jsonsDAO;

	@Override
	public int insert(String json, int status) {
		Jsons jsons=new Jsons();
		jsons.setJsontext(json);
		jsons.setStatus(status);
		return this.jsonsDAO.insert(jsons);
	}

}
