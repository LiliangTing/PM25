package com.liliangliang.core.entry;

import java.io.Serializable;

/**
 * 为地图显示制作的类
 * 
 * @author Administrator
 * 
 */
public class MapData implements Serializable{

	private String name;
	private int value;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
