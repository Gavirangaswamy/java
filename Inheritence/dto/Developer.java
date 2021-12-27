package com.grs.learnInheritence.dto;

public class Developer extends Employee {
	public String type = "lazy";
	public String work = "Never Get Tired";
	public String worktype = "Machines";
	public String seekingProperties = "seekingthings";
	public int minsalary = 28000;
	
	public Developer() {
		this("invoking developer class constructor");
	}
	public Developer(String msg) {
		super("invoking employee class constructor");
		System.out.println("Developer :"+ msg);
	}
	

	public String coding(String coding) {
		return coding;
	}

	public String crazy(String crazy) {
		return crazy;
	}

	public String doinginovations(String innovations) {
		return innovations;
	}

	public int maxsalary(int maxsalary) {
		return maxsalary;
	}

	public boolean jobtype(boolean jobtype) {
		return jobtype;
	}

}
