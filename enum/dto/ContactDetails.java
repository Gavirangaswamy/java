package com.grs.enums.dto;

public class ContactDetails {
	
	String address;
	String email;
	long contactNumber;
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	@Override
	public String toString() {
		return "ContactDetails [address=" + address + ", email=" + email + ", contactNumber=" + contactNumber + "]";
	}
}
