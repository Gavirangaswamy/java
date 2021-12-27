package com.grs.inheritence;

import com.grs.inheritence.metal.Metal;
import com.grs.inheritence.metal.Platinum;


public class PlatiniumRunner {

	public static void main(String[] args) {

		Metal metal = new Metal();
		System.out.println("Color :" + metal.color);
		System.out.println();
		System.out.println("isDuctile :" + metal.isductile);
		System.out.println();
		System.out.println("Price :" + metal.price);
		System.out.println();
		System.out.println("Size :" + metal.size);
		System.out.println();
		System.out.println("Weight :" + metal.weight);
		System.out.println();

		Platinum platinum = new Platinum((byte) 4, "Pt", 1768.0f, 1000, "Silver", true, 35000, 20, "Platinium chloride", (byte) 78);
		System.out.println("Color :" + platinum.color);
		System.out.println();
		System.out.println("isDuctile :" + platinum.isductile);
		System.out.println();
		System.out.println("Price :" + platinum.price);
		System.out.println();
		System.out.println("Size :" + platinum.size);
		System.out.println();
		System.out.println("Weight :" + platinum.weight);
		System.out.println();
		System.out.println("Catalyst :" + platinum.catalyst);
		System.out.println();
		System.out.println("Chemical Name :" + platinum.chemicalName);
		System.out.println();
		System.out.println("Melting Point :" + platinum.meltingPoint);
		System.out.println();
		System.out.println("Automic Number :" + platinum.automicNumber);
		System.out.println();
		System.out.println("Number of Electrons :" + platinum.electrons);
		System.out.println();

		Metal metal4 = new Platinum((byte) 4, "Pt", 1768.0f, 1000, "Silver", true, 35000, 20, "Platinium chloride", (byte) 78);
		System.out.println("Down_Casting Values");
		System.out.println("-------------------");
		System.out.println("Color :" + metal4.color);
		System.out.println();
		System.out.println("isDuctile :" + metal4.isductile);
		System.out.println();
		System.out.println("Price :" + metal4.price);
		System.out.println();
		System.out.println("Size :" + metal4.size);
		System.out.println();
		System.out.println("Weight :" + metal4.weight);
		System.out.println();

		Platinum platinum5 = (Platinum) metal4;
		System.out.println("Up_Casting Values");
		System.out.println("-------------------");
		System.out.println("Color :" + platinum5.color);
		System.out.println();
		System.out.println("isDuctile :" + platinum5.isductile);
		System.out.println();
		System.out.println("Price :" + platinum5.price);
		System.out.println();
		System.out.println("Size :" + platinum5.size);
		System.out.println();
		System.out.println("Weight :" + platinum5.weight);
		System.out.println();
		System.out.println("Catalyst :" + platinum5.catalyst);
		System.out.println();
		System.out.println("Chemical Name :" + platinum5.chemicalName);
		System.out.println();
		System.out.println("Melting Point :" + platinum5.meltingPoint);
		System.out.println();
		System.out.println("Automic Number :" + platinum5.automicNumber);
		System.out.println();
		System.out.println("Number of Electrons :" + platinum5.electrons);

	}

}
