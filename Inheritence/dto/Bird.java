package com.grs.learnInheritence.dto;

public class Bird {
	public String species = "pheasant";
	public float flyingDistance = 12.67f;
	public String color;
	public boolean layingEgg = true;
	public boolean swim = false;

	public Bird() {

	}

	public String fly(String fly) {
		return fly;
	}

	public float flyingDistance(float flyingDistance) {
		return flyingDistance;
	}

	public String color(String color) {
		return color;
	}

	public boolean swim(boolean swim) {
		return swim;
	}

	public boolean layingEgg(boolean layingEgg) {
		return layingEgg;
	}

}
