package com.grs.singletonDesignPattern.singleton;


//With Lazy initialization
public class Lazy {
// private instance, so that it can be
// accessed by only by getInstance() method
	private static Lazy instance;

	private Lazy() {
		// private constructor
	}

//method to return instance of class
	public static Lazy getInstance() {
		if (instance == null) {
			// if instance is null, initialize
			instance = new Lazy();
		}
		return instance;
	}
}
