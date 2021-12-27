package com.grs.inheritence;

import com.grs.inheritence.metal.Metal;
import com.grs.inheritence.metal.Iron;

public class IronRunner {

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

		Iron iron = new Iron(2861, 1.86f, (byte) 1, 7.86f, "Fe", 1536.2f, 1000, "Silvery grey", false, 75.50, 12,
				(byte) 29);
		System.out.println("Color :" + iron.color);
		System.out.println();
		System.out.println("isDuctile :" + iron.isductile);
		System.out.println();
		System.out.println("Price :" + iron.price);
		System.out.println();
		System.out.println("Size :" + iron.size);
		System.out.println();
		System.out.println("Weight :" + iron.weight);
		System.out.println();
		System.out.println("Catalyst :" + iron.density);
		System.out.println();
		System.out.println("Chemical Name :" + iron.chemicalName);
		System.out.println();
		System.out.println("Melting Point :" + iron.meltingPoint);
		System.out.println();
		System.out.println("Automic Number :" + iron.atomicNumber);
		System.out.println();
		System.out.println("Number of Electrons :" + iron.electrons);
		System.out.println();
		System.out.println("Boilingpoint :" + iron.boilingpoint);
		System.out.println();
		System.out.println("ElectroNegetivity :" + iron.electronegativity);
		System.out.println();

		Metal metal8 = new Iron(2861, 1.86f, (byte) 1, 7.86f, "Fe", 1536.2f, 1000, "Silvery grey", false, 75.50, 12,
				(byte) 29);
		System.out.println("Down_Casting Values");
		System.out.println("-------------------");
		System.out.println("Color :" + metal8.color);
		System.out.println();
		System.out.println("isDuctile :" + metal8.isductile);
		System.out.println();
		System.out.println("Price :" + metal8.price);
		System.out.println();
		System.out.println("Size :" + metal8.size);
		System.out.println();
		System.out.println("Weight :" + metal8.weight);
		System.out.println();

		Iron iron6 = (Iron) metal8;
		System.out.println("Up_Casting Values");
		System.out.println("-------------------");
		System.out.println("Color :" + iron6.color);
		System.out.println();
		System.out.println("isDuctile :" + iron6.isductile);
		System.out.println();
		System.out.println("Price :" + iron6.price);
		System.out.println();
		System.out.println("Size :" + iron6.size);
		System.out.println();
		System.out.println("Weight :" + iron6.weight);
		System.out.println();
		System.out.println("Density :" + iron6.density);
		System.out.println();
		System.out.println("Chemical Name :" + iron6.chemicalName);
		System.out.println();
		System.out.println("Melting Point :" + iron6.meltingPoint);
		System.out.println();
		System.out.println("Number of Electrons :" + iron6.electrons);
		System.out.println();
		System.out.println("Boilingpoint :" + iron6.boilingpoint);
		System.out.println();
		System.out.println("ElectroNegetivity :" + iron6.electronegativity);
		System.out.println();

	}

}
