package com.grs.Metro.abstraction;

public abstract class Metro {
	
	public static String cityName = "Bangalore";
	public int distance;
	
	public Metro() {
		// TODO Auto-generated constructor stub
	}
	
	public Metro(int distance) {
		this.distance = distance;
	}

	 public void purpleline() {
		System.out.println("Mysore Road to Bayappanahalli");
	}
	
	abstract void greenline();
	
	public abstract void yellowline();
	
	public abstract void blueline();
	
	public void purpleline(double dist) {
		System.out.println("Mysore Road to Bayappanahalli  "+dist);
	}
	
	public static void NoOfLanes(int no) {
		System.out.println("No of Lanes "+no);
	}
	

}
