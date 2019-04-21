package com.fahrizal.oopconsepts.abstraction;

public abstract class Tower {
	private String name;
	private int height;
	
	public Tower(String name,int height){
		this.setName(name);
		this.setHeight(height);
	}
	
	public abstract int calculateVolume();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
}
