package com.grs.singletonDesignPattern.singleton;


//Eager Initialization
public class Eager {
	

	private static final Eager instance = new Eager();

	private Eager() {
		// private constructor
	}

	public static Eager getInstance() {
		return instance;
	}
}
