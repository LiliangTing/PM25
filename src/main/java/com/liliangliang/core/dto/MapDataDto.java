package com.liliangliang.core.dto;

import java.io.Serializable;
import java.util.List;

import com.liliangliang.core.entry.MapData;

public class MapDataDto implements Serializable {

	private List<MapData> list;

	public List<MapData> getList() {
		return list;
	}

	public void setList(List<MapData> list) {
		this.list = list;
	}

}
