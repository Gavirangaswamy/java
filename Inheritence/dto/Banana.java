package com.grs.learnInheritence.dto;

public class Banana extends Fruit {

	public String type = "puttabanana";
	public String vitamin = "vitaminB6";
	public String color = "yellow";
	public float fibre = 3.56f;
	public byte water = 75;

	public byte calories(byte calories) {
		return calories;
	}

	public float proteins(float proteins) {
		return proteins;
	}

	public double carbs(double carbs) {
		return carbs;
	}

	public float sugar(float sugar) {
		return sugar;
	}

	public float fat(float fat) {
		return fat;
	}
}
