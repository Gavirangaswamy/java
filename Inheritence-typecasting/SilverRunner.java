package com.grs.inheritence;

import com.grs.inheritence.metal.Metal;
import com.grs.inheritence.metal.Silver;

public class SilverRunner {

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

		Silver silver = new Silver((byte) 1, "Ag", 961.8f, 1000, "Silver", true, 65000.50, 10, "Palladium", (byte) 47);
		System.out.println("Color :" + silver.color);
		System.out.println();
		System.out.println("isDuctile :" + silver.isductile);
		System.out.println();
		System.out.println("Price :" + silver.price);
		System.out.println();
		System.out.println("Size :" + silver.size);
		System.out.println();
		System.out.println("Weight :" + silver.weight);
		System.out.println();
		System.out.println("Catalyst :" + silver.catalyst);
		System.out.println();
		System.out.println("Chemical Name :" + silver.chemicalName);
		System.out.println();
		System.out.println("Melting Point :" + silver.meltingPoint);
		System.out.println();
		System.out.println("Automic Number :" + silver.automicNumber);
		System.out.println();
		System.out.println("Number of Electrons :" + silver.electrons);
		System.out.println();

		Metal metal2 = new Silver((byte) 1, "Ag", 961.8f, 1000, "Silver", true, 65000.50, 10, "Palladium", (byte) 47);
		System.out.println("Down_Casting Values");
		System.out.println("-------------------");
		System.out.println("Color :" + metal2.color);
		System.out.println();
		System.out.println("isDuctile :" + metal2.isductile);
		System.out.println();
		System.out.println("Price :" + metal2.price);
		System.out.println();
		System.out.println("Size :" + metal2.size);
		System.out.println();
		System.out.println("Weight :" + metal2.weight);
		System.out.println();

		Silver silver1 = (Silver) metal2;
		System.out.println("Up_Casting Values");
		System.out.println("-------------------");
		System.out.println("Color :" + silver1.color);
		System.out.println();
		System.out.println("isDuctile :" + silver1.isductile);
		System.out.println();
		System.out.println("Price :" + silver1.price);
		System.out.println();
		System.out.println("Size :" + silver1.size);
		System.out.println();
		System.out.println("Weight :" + silver1.weight);
		System.out.println();
		System.out.println("Catalyst :" + silver1.catalyst);
		System.out.println();
		System.out.println("Chemical Name :" + silver1.chemicalName);
		System.out.println();
		System.out.println("Melting Point :" + silver1.meltingPoint);
		System.out.println();
		System.out.println("Automic Number :" + silver1.automicNumber);
		System.out.println();
		System.out.println("Number of Electrons :" + silver1.electrons);

	}

}
