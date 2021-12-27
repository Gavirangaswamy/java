package com.grs.inheritence.metal;

public class Gold extends Metal {
	
	public String chemicalName;//au
	public float meltingPoint; //1063
	public String catalyst;//copper
	public byte automicNumber; //79
	public byte electrons;//1

	public Gold() {
		System.out.println("Gold : Invoking Default Contructor");
	}

	public Gold(byte electrons,String chemicalName,float meltingPoint,double weight, String color, boolean isductile, double price, float size, String catalyst, byte automicNumber) {
		super(weight, color, isductile, price, size);
		this.meltingPoint = meltingPoint;
		this.chemicalName = chemicalName;
		this.catalyst = catalyst;
		this.automicNumber = automicNumber;
		this.electrons = electrons;
		System.out.println("Gold : Invoking Param Contructor");
	}

}
