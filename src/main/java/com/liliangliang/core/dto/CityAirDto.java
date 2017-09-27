package com.liliangliang.core.dto;

import java.io.Serializable;
import java.util.List;

import com.liliangliang.core.entry.CityAir;

public class CityAirDto implements Serializable{

	private List<CityAir> list;

	public List<CityAir> getList() {
		return list;
	}

	public void setList(List<CityAir> list) {
		this.list = list;
	}
	

}
