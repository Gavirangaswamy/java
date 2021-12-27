package com.grs.exception;

public class TestNullpointer {
	public static void main(String[] args) {

		NullpointerException exp1 = new NullpointerException();

		exp1.save("ningyakbek adu");

		exp1.save("muchkond hogale");

		exp1.printAll();
	}

}
