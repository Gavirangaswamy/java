package com.grs.learnInheritence;

import com.grs.learnInheritence.dto.Nagarhole;

public class TestNagarhole {
	public static void main(String[] args) {

		Nagarhole nagarhole = new Nagarhole();

		System.out.println(nagarhole.name);
		System.out.println(nagarhole.place);
		System.out.println(nagarhole.soil);
		System.out.println(nagarhole.climate);
		System.out.println(nagarhole.noofanimals);

		String for1 = nagarhole.causesRain("causes rain");
		System.out.println("forest " + for1);

		String for2 = nagarhole.holdingSoil("holding soil");
		System.out.println("forest helps in" + for2);

		String for3 = nagarhole.provideOxygen("provide oxygen");
		System.out.println("mainly forest " + for3);

		String for4 = nagarhole.provideShelter("shelter for flora&fauna");
		System.out.println("forest provide" + for4);

		String for5 = nagarhole.provideGreenery("greenery");
		System.out.println("forest always in" + for5);

		System.out.println(nagarhole.location);
		System.out.println(nagarhole.area);
		System.out.println(nagarhole.elevation);
		System.out.println(nagarhole.established);
		System.out.println(nagarhole.coordinate);

		byte nag1 = nagarhole.declaration((byte) 37);
		System.out.println("declared as tiger reservoir of " + nag1);

		String nag2 = nagarhole.cover("rich cover");
		System.out.println("nagarhole provides" + nag2);

		String nag3 = nagarhole.flora("teak rosewood sandalwood");
		System.out.println("important trees like" + nag3);

		String nag4 = nagarhole.fauna("bengaltiger indian_lepord");
		System.out.println("main fauna found" + nag4);

		String nag5 = nagarhole.bird("malbar_trozon nilgiri_wood-pegion");
		System.out.println("main birds likely" + nag5);
	}

}
