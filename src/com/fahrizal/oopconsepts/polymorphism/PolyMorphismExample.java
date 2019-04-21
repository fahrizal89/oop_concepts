package com.fahrizal.oopconsepts.polymorphism;

import com.fahrizal.oopconsepts.inheritance.Motorcycle;
import com.fahrizal.oopconsepts.inheritance.Suzuka;

public class PolyMorphismExample {
	public static void main(String[] args) {
		Motorcycle motorcycle = new Suzuka();
		System.out.println(motorcycle.brand);
	}
}
