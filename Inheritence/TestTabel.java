package com.grs.learnInheritence;

import com.grs.learnInheritence.dto.Tabel;

public class TestTabel {
	public static void main(String[] args) {

		Tabel tabel = new Tabel();
		System.out.println(tabel.noOfLegs);
		System.out.println(tabel.length);
		System.out.println(tabel.width);
		System.out.println(tabel.price);
		System.out.println(tabel.color);

		String tab1 = tabel.toSit("sitting");
		System.out.println("tabel is used for" + tab1);

		String tab2 = tabel.asDainingTable("daining tabel");
		System.out.println("tabel is used as" + tab2);

		String tab3 = tabel.readORwrite("for read or write");
		System.out.println("tabel can be used" + tab3);

		String tab4 = tabel.toKeepThings("keeping things");
		System.out.println("tabel is used to" + tab4);

		byte tab5 = tabel.noofdraws((byte) 4);
		System.out.println("noofdraws in tabel" + tab5);

		System.out.println(tabel.nameOfWood);
		System.out.println(tabel.habitat);
		System.out.println(tabel.heightinmeter);
		System.out.println(tabel.circumference);
		System.out.println(tabel.weight);

		String wood1 = tabel.breeze("breezing");
		System.out.println("wood helps in" + wood1);

		String wood2 = tabel.shelter("shelter");
		System.out.println("wood can be used for" + wood2);

		String wood3 = tabel.charwood("charwood");
		System.out.println("wood used to made" + wood3);

		float wood4 = tabel.grow(12.56f);
		System.out.println("wood can grow upto" + wood4);

		String wood5 = tabel.causesRain("rain");
		System.out.println("wood causes " + wood5);
	}

}
