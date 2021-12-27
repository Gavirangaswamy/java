package com.grs.inheritence;

import com.grs.inheritence.metal.Metal;
import com.grs.inheritence.metal.Copper;

public class CopperRunner {

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

		Copper copper = new Copper((byte) 1, 8.92f, "Cu", 1083.2f, 1000, "Reddish Brown", true, 750.50, 12, (byte) 29);
		System.out.println("Color :" + copper.color);
		System.out.println();
		System.out.println("isDuctile :" + copper.isductile);
		System.out.println();
		System.out.println("Price :" + copper.price);
		System.out.println();
		System.out.println("Size :" + copper.size);
		System.out.println();
		System.out.println("Weight :" + copper.weight);
		System.out.println();
		System.out.println("Catalyst :" + copper.density);
		System.out.println();
		System.out.println("Chemical Name :" + copper.chemicalName);
		System.out.println();
		System.out.println("Melting Point :" + copper.meltingPoint);
		System.out.println();
		System.out.println("Automic Number :" + copper.atomicNumber);
		System.out.println();
		System.out.println("Number of Electrons :" + copper.electrons);
		System.out.println();

		Metal metal3 = new Copper((byte) 1, 8.9f, "Cu", 1083.2f, 1000, "Reddish Brown", true, 750.50, 12, (byte) 29);
		System.out.println("Down_Casting Values");
		System.out.println("-------------------");
		System.out.println("Color :" + metal3.color);
		System.out.println();
		System.out.println("isDuctile :" + metal3.isductile);
		System.out.println();
		System.out.println("Price :" + metal3.price);
		System.out.println();
		System.out.println("Size :" + metal3.size);
		System.out.println();
		System.out.println("Weight :" + metal3.weight);
		System.out.println();

		Copper copper12 = (Copper) metal3;
		System.out.println("Up_Casting Values");
		System.out.println("-------------------");
		System.out.println("Color :" + copper12.color);
		System.out.println();
		System.out.println("isDuctile :" + copper12.isductile);
		System.out.println();
		System.out.println("Price :" + copper12.price);
		System.out.println();
		System.out.println("Size :" + copper12.size);
		System.out.println();
		System.out.println("Weight :" + copper12.weight);
		System.out.println();
		System.out.println("Density :" + copper12.density);
		System.out.println();
		System.out.println("Chemical Name :" + copper12.chemicalName);
		System.out.println();
		System.out.println("Melting Point :" + copper12.meltingPoint);
		System.out.println();
		System.out.println("Number of Electrons :" + copper12.electrons);

	}

}
