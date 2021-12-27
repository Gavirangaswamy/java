package com.grs.inheritence.metal;

public class Copper extends Metal {

	public String chemicalName;// Cu
	public byte atomicNumber;// 29
	public float density;// 8.9
	public float meltingPoint;// 1083
	public byte electrons;// 1

	public Copper() {
		System.out.println("Copper : Invoking Default Contructor");
	}

	public Copper(byte electrons, float density, String chemicalName, float meltingPoint, double weight, String color,
			boolean isductile, double price, float size, byte automicNumber) {
		super(weight, color, isductile, price, size);
		this.meltingPoint = meltingPoint;
		this.chemicalName = chemicalName;
		this.density = density;
		this.atomicNumber = automicNumber;
		this.electrons = electrons;
		System.out.println("Copper : Invoking Param Contructor");
	}

}
