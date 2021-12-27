package com.grs.learnInheritence.dto;

public class Metro extends Train {

	public int voltage = 750;
	public byte noofCompartment = 11;
	public int peopleCapacity = 1200;
	public String color = "green";
	public String sensor = "electricSensor";

	public Metro() {

	}

	public String name(String metroname) {
		return metroname;
	}

	public String carry(String carry) {
		return carry;
	}

	public long price(long price) {
		return price;
	}

	public boolean sound(boolean sound) {
		return sound;
	}

	public boolean pollution(boolean pollution) {
		return pollution;
	}

}
