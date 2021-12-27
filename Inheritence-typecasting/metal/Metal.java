package com.grs.inheritence.metal;

public class Metal {
	
	public double weight;
	public String color;
	public boolean isductile;
	public double price;
	public float size;
	
	public Metal() {
		System.out.println("Metal : Invoking Default Contructor");
	}

	public Metal(double weight, String color, boolean isductile, double price, float size) {
		this.weight = weight;
		this.color = color;
		this.isductile = isductile;
		this.price = price;
		this.size = size;
		System.out.println("Metal : Invoking Parameter Contructor");
	}
	
}
