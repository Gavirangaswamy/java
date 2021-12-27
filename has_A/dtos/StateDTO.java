package com.grs.has_A.dtos;

public class StateDTO {

	private String name;
	private String country;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String toString() {
		return "StateDTO [name=" + name + ", country=" + country + "]";
	}

}
