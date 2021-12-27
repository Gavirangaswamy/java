package com.grs.has_A.dtos;

public class TraineeDetails {
	private String name;
	private long contactno;
	private String email;
	private AdressDTO adress;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getContactno() {
		return contactno;
	}

	public void setContactno(long contactno) {
		this.contactno = contactno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public AdressDTO getAdress() {
		return adress;
	}

	public void setAdress(AdressDTO adress) {
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "TraineeDetails [name=" + name + ", contactno=" + contactno + ", email=" + email + ", adress=" + adress
				+ "]";
	}

	

}
