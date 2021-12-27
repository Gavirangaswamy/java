package com.grs.exception;

public class NullpointerException {

	String[] names = new String[5];

	int index = 0;

	public void save(String name) {

		if (index < names.length) {
			names[index] = name;
			index++;
		}
	}

	public void printAll() {
		for (int index = 0; index < names.length; index++) {
			System.out.println(names[index].toString());
		}
	}

}
