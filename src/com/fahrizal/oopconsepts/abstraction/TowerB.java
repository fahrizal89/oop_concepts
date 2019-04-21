package com.fahrizal.oopconsepts.abstraction;

public class TowerB extends Tower{

	public TowerB(String name, int height) {
		super(name, height);
	}

	@Override
	public int calculateVolume() {
		return getHeight()*20;
	}

}
