package com.grs.inheritence.metal;

public class Iron extends Metal {

	public String chemicalName;// Fe
	public byte atomicNumber;// 26
	public float density;// 7.86
	public float meltingPoint;// 1536
	public byte electrons;// 1
	public float electronegativity;// 1.86
	public int boilingpoint;// 2861

	public Iron() {
		System.out.println("Iron : Invoking Default Contructor");
	}

	public Iron(int boilingpoint, float electronegativity, byte electrons, float density, String chemicalName,
			float meltingPoint, double weight, String color, boolean isductile, double price, float size,
			byte automicNumber) {
		super(weight, color, isductile, price, size);
		this.boilingpoint = boilingpoint;
		this.electronegativity = electronegativity;
		this.meltingPoint = meltingPoint;
		this.chemicalName = chemicalName;
		this.density = density;
		this.atomicNumber = automicNumber;
		this.electrons = electrons;
		System.out.println("Iron : Invoking Param Contructor");
	}

}
