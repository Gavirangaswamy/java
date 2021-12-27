package com.grs.inheritence.metal;

public class Silver extends Metal {

	public String chemicalName;//Ag
	public float meltingPoint; //961.8
	public String catalyst;//palladium
	public byte automicNumber; //47
	public byte electrons;//1

	public Silver() {
		System.out.println("Silver : Invoking Default Contructor");
	}

	public Silver(byte electrons,String chemicalName,float meltingPoint,double weight, String color, boolean isductile, double price, float size, String catalyst, byte automicNumber) {
		super(weight, color, isductile, price, size);
		this.meltingPoint = meltingPoint;
		this.chemicalName = chemicalName;
		this.catalyst = catalyst;
		this.automicNumber = automicNumber;
		this.electrons = electrons;
		System.out.println("Silver : Invoking Param Contructor");
	}

}
