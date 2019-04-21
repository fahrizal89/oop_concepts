package com.fahrizal.oopconsepts.abstraction;

public class TowerA extends Tower{

	public TowerA(String name, int height) {
		super(name, height);
	}

	@Override
	public int calculateVolume() {
		return getHeight() * 30;
	}

}
