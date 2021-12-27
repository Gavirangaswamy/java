package com.grs.learnInheritence;

import com.grs.learnInheritence.dto.Developer;

public class TestDeveloper {
	public static void main(String[] args) {
		Developer develop = new Developer();

		System.out.println(develop.name);
		System.out.println(develop.id);
		System.out.println(develop.adress);
		System.out.println(develop.Aadhar);
		System.out.println(develop.insurance);

		String emp1 = develop.work("working");
		System.out.println("duty of employee is" + emp1);

		String emp2 = develop.monthlyTrip("monthly trip");
		System.out.println("for employee there will " + emp2);

		String emp3 = develop.weekend("holidays");
		System.out.println("employee have weekend" + emp3);

		String emp4 = develop.irregular("irregular");
		System.out.println("employee are" + emp4 + "in their work");

		String emp5 = develop.firstForSalary(" salary");
		System.out.println("employee are first for" + emp5);

		System.out.println(develop.type);
		System.out.println(develop.work);
		System.out.println(develop.worktype);
		System.out.println(develop.seekingProperties);
		System.out.println(develop.minsalary);

		String deve1 = develop.coding("writing code");
		System.out.println("main work of developers is" + deve1);

		String deve2 = develop.crazy("crazy");
		System.out.println("developers are very" + deve2);

		String deve3 = develop.doinginovations("innovations");
		System.out.println("developers always do" + deve3);

		int deve4 = develop.maxsalary(2400000);
		System.out.println("maximum salary of developer" + deve4);

		boolean deve5 = develop.jobtype(false);
		System.out.println("developer job is secure" + deve5);
	}

}
