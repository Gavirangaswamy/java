package com.grs.learnInheritence;

import com.grs.learnInheritence.dto.Peacock;

public class TestBirdpeacock {
	public static void main(String[] args) {

		Peacock peacock = new Peacock();

		System.out.println(peacock.color);
		System.out.println(peacock.weight);
		System.out.println(peacock.height);
		System.out.println(peacock.nooflegs);
		System.out.println(peacock.length);
		System.out.println(peacock.species);
		System.out.println(peacock.flyingDistance);
		System.out.println(peacock.layingEgg);
		System.out.println(peacock.swim);

		System.out.println();
		String res = peacock.dance("peacock-dance");
		System.out.println("peacock can dance" + "\t" + res);

		String res1 = peacock.speerch("peacock-screep");
		System.out.println("peacock will screep" + "\t" + res1);

		String res2 = peacock.fly("peacock fly");
		System.out.println("peacock can fly upto" + "\t" + res2);

		boolean res3 = peacock.layingEgg(true);
		System.out.println("peacock is laying eggs" + "\t" + res3);

		String res4 = peacock.fly("birdsFly");
		System.out.println("all birds will fly" + "\t" + res4);

		float res5 = peacock.flyingDistance(18.92f);
		System.out.println("heighest fly of bird" + "\t" + res5);

		String res6 = peacock.color("differentColor");
		System.out.println("deiifernt bird has" + res6);

		boolean res7 = peacock.swim(true);
		System.out.println("some birds can swim" + "\t" + res7);

		boolean res8 = peacock.layingEgg(true);
		System.out.println("all birds are laying egg" + "\t" + res8);
	}

}
