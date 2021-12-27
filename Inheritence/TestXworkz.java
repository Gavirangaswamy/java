package com.grs.learnInheritence;

import com.grs.learnInheritence.dto.Xworkz;

public class TestXworkz {
	public static void main(String[] args) {

		Xworkz xworkz = new Xworkz();
		System.out.println(xworkz.name);
		System.out.println(xworkz.location);
		System.out.println(xworkz.branches);
		System.out.println(xworkz.vision);
		System.out.println(xworkz.mission);

		String ins1 = xworkz.coaching("coaching");
		System.out.println("institute mainly gives" + ins1);

		String ins2 = xworkz.placement("placements");
		System.out.println("in institute we can see" + ins2);

		String ins3 = xworkz.curicularActivity("curicular activity");
		System.out.println("in institute there will be" + ins3);

		String ins4 = xworkz.assaignments("assaignments");
		System.out.println("in institute they give us" + ins4);

		String ins5 = xworkz.instituteTrip("trip");
		System.out.println("in institute we can go for" + ins5);

		System.out.println(xworkz.founder);
		System.out.println(xworkz.noOfBranches);
		System.out.println(xworkz.hr);
		System.out.println(xworkz.fees);
		System.out.println(xworkz.durationofCourse);

		String xwork1 = xworkz.developers("skilled developers");
		System.out.println("xworkz provides" + xwork1);

		String xwork2 = xworkz.firstCourse("core java");
		System.out.println("first course is" + xwork2);

		String xwork3 = xworkz.secondCourse("html css");
		System.out.println("second course is" + xwork3);

		String xwork4 = xworkz.tasks("provide tasks");
		System.out.println("xworkz " + xwork4);

		String xwork5 = xworkz.goodChoice("good choice");
		System.out.println("joining xworkz is" + xwork5);
	}

}
