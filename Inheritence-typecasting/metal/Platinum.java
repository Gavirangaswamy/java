package com.grs.inheritence.metal;

public class Platinum extends Metal {

	public String chemicalName;//Pt
	public float meltingPoint; //1768
	public String catalyst;//platiniumchloride
	public byte automicNumber; //78
	public byte electrons;//4

	public Platinum() {
		System.out.println("Platinum : Invoking Default Contructor");
	}

	public Platinum(byte electrons,String chemicalName,float meltingPoint,double weight, String color, boolean isductile, double price, float size, String catalyst, byte automicNumber) {
		super(weight, color, isductile, price, size);
		this.meltingPoint = meltingPoint;
		this.chemicalName = chemicalName;
		this.catalyst = catalyst;
		this.automicNumber = automicNumber;
		this.electrons = electrons;
		System.out.println("Platinum : Invoking Param Contructor");
	}

}
