package com.grs.learnInheritence;

import com.grs.learnInheritence.dto.Lotus;

public class Testlotus {

	public static void main(String[] args) {
		Lotus lotus = new Lotus();
		System.out.println(lotus.name);
		System.out.println(lotus.species);
		System.out.println(lotus.color);
		System.out.println(lotus.fragrance);
		System.out.println(lotus.habitat);

		String flo1 = lotus.smell("smell");
		System.out.println("flower having properties having" + flo1);

		String flo2 = lotus.worship("worship");
		System.out.println("flower is used to" + flo2);

		String flo3 = lotus.honey("honey extraction");
		System.out.println("flower is used for" + flo3);

		String flo4 = lotus.flowerbloomingtime("blooming");
		System.out.println("property of flower is" + flo4);

		String flo5 = lotus.rotten("rottens");
		System.out.println("flower after its time get" + flo5);

		System.out.println(lotus.color);
		System.out.println(lotus.noofpetals);
		System.out.println(lotus.noofsepals);
		System.out.println(lotus.livingdays);
		System.out.println(lotus.height);

		String lot1 = lotus.reduceSwelling("reduce swelling");
		System.out.println("lotus is used for" + lot1);

		String lot2 = lotus.killCancerCell("kill cancer cell");
		System.out.println("lotus is used to" + lot2);

		String lot3 = lotus.stopbleeding("stop bleeding");
		System.out.println("lotus is used for" + lot3);

		String lot4 = lotus.breaksFat("breaks fat");
		System.out.println("lotus is used to" + lot4);

		String lot5 = lotus.growth("gutter water");
		System.out.println("lotus grow in" + lot5);

	}

}
