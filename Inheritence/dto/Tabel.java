package com.grs.learnInheritence.dto;

public class Tabel extends Wood {

	public byte noOfLegs = 04;
	public float length = 4.56f;
	public float width = 2.68f;
	public short price = 3000;
	public String color = "grey";

	public String toSit(String sit) {
		return sit;
	}

	public String asDainingTable(String daining) {
		return daining;
	}

	public String readORwrite(String readORwrite) {
		return readORwrite;
	}

	public String toKeepThings(String tokeep) {
		return tokeep;
	}

	public byte noofdraws(byte noofdraws) {
		return noofdraws;
	}

}
