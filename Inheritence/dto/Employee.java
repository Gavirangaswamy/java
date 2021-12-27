package com.grs.learnInheritence.dto;

public class Employee {
	public String name = "employee name";
	public int id = 16005;
	public String adress = "employee adress";
	public long Aadhar = 962362282676l;
	public String insurance = "employee insurance";
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String msg) {
		System.out.println("Employee :"+msg);
	}

	public String work(String doingWork) {
		return doingWork;
	}

	public String monthlyTrip(String trip) {
		return trip;
	}

	public String weekend(String weekend) {
		return weekend;
	}

	public String irregular(String irregular) {
		return irregular;
	}

	public String firstForSalary(String salary) {
		return salary;
	}

}
