package com.grs.learnInheritence;

import com.grs.learnInheritence.dto.Banana;

public class TestBanana {
	public static void main(String[] args) {

		Banana banana = new Banana();
		System.out.println(banana.name);
		System.out.println(banana.diet);
		System.out.println(banana.health_boosting);
		System.out.println(banana.percentageOfwater);
		System.out.println(banana.balance);

		String fru1 = banana.Obesity("obesity");
		System.out.println("fruites helps to control" + fru1);

		String fru2 = banana.Constipation("constupation");
		System.out.println("fruites helps in reduction of" + fru2);

		String fru3 = banana.HeartAttack("heartAttack");
		System.out.println("fruites helps to overcome from" + fru3);

		String fru4 = banana.Hypertension("hypertension");
		System.out.println("fruites are helpful to overcome" + fru4);

		String fru5 = banana.Fibre("fibre");
		System.out.println("fruites having rich of" + fru5);

		System.out.println(banana.type);
		System.out.println(banana.vitamin);
		System.out.println(banana.color);
		System.out.println(banana.fibre);
		System.out.println(banana.water);

		byte bana1 = banana.calories((byte) 89);
		System.out.println("calories in 100g banana" + bana1);

		float bana2 = banana.proteins(1.21f);
		System.out.println("proteins in 100g " + bana2);

		double bana3 = banana.carbs(22.85);
		System.out.println("carbs in 100g" + bana3);

		float bana4 = banana.sugar(12.22f);
		System.out.println("sugar in 100g" + bana4);

		float bana5 = banana.fat(0.33f);
		System.out.println("fat in 100g" + bana5);

	}
}
