package com.grs.singletonDesignPattern.singleton;


//Using Static block
public class Static {
// public instance
	public static Static instance;

	private Static() {
		// private constructor
	}

	static {
		// static block to initialize instance
		instance = new Static();
	}
}
