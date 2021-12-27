package com.grs.inheritence;

import com.grs.inheritence.metal.Gold;
import com.grs.inheritence.metal.Metal;

public class GoldRunner {

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

		Gold gold = new Gold((byte) 1, "Au", 1063.31f, 20, "Gold", true, 49730.50, 10, "Copper", (byte) 79);
		System.out.println("Color :" + gold.color);
		System.out.println();
		System.out.println("isDuctile :" + gold.isductile);
		System.out.println();
		System.out.println("Price :" + gold.price);
		System.out.println();
		System.out.println("Size :" + gold.size);
		System.out.println();
		System.out.println("Weight :" + gold.weight);
		System.out.println();
		System.out.println("Catalyst :" + gold.catalyst);
		System.out.println();
		System.out.println("Chemical Name :" + gold.chemicalName);
		System.out.println();
		System.out.println("Melting Point :" + gold.meltingPoint);
		System.out.println();
		System.out.println("Automic Number :" + gold.automicNumber);
		System.out.println();
		System.out.println("Number of Electrons :" + gold.electrons);
		System.out.println();

		Metal metal1 = new Gold((byte) 1, "Au", 1063.31f, 20, "Gold", true, 49730.50, 10, "Copper", (byte) 79);
		System.out.println("Down_Casting Values");
		System.out.println("-------------------");
		System.out.println("Color :" + metal1.color);
		System.out.println();
		System.out.println("isDuctile :" + metal1.isductile);
		System.out.println();
		System.out.println("Price :" + metal1.price);
		System.out.println();
		System.out.println("Size :" + metal1.size);
		System.out.println();
		System.out.println("Weight :" + metal1.weight);
		System.out.println();

		Gold gold1 = (Gold) metal1;
		System.out.println("Up_Casting Values");
		System.out.println("-------------------");
		System.out.println("Color :" + gold1.color);
		System.out.println();
		System.out.println("isDuctile :" + gold1.isductile);
		System.out.println();
		System.out.println("Price :" + gold1.price);
		System.out.println();
		System.out.println("Size :" + gold1.size);
		System.out.println();
		System.out.println("Weight :" + gold1.weight);
		System.out.println();
		System.out.println("Catalyst :" + gold1.catalyst);
		System.out.println();
		System.out.println("Chemical Name :" + gold1.chemicalName);
		System.out.println();
		System.out.println("Melting Point :" + gold1.meltingPoint);
		System.out.println();
		System.out.println("Automic Number :" + gold1.automicNumber);
		System.out.println();
		System.out.println("Number of Electrons :" + gold1.electrons);

	}

}
