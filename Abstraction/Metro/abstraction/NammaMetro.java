package com.grs.Metro.abstraction;

public class NammaMetro extends Metro{
	
	public NammaMetro() {
		// TODO Auto-generated constructor stub
	}

	public NammaMetro(int distance) {
		super(distance);
	}

	@Override
	public void greenline() {
		System.out.println("Nagasandra to Yelechanahalli");
		
	}

	@Override
	public void yellowline() {
		System.out.println("RV Road to Bommasandra");
		
	}

	@Override
	public void blueline() {
		System.out.println("KR Puram to SilkBoard");
		
	}
	
	@Override
	public void purpleline() {
		System.out.println("Kengeri to Whitefield");
		
	}
	

}
