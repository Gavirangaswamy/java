package com.grs.armory.gun.dto;

public class Company {

	private String cname;
	private String founder;
	private long contact;
	private String mail;
	private String address;
	
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getFounder() {
		return founder;
	}
	public void setFounder(String founder) {
		this.founder = founder;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName()+"[cname=" + cname + ", founder=" + founder + ", contact=" + contact
				+ ", mail=" + mail + ", address=" + address + "]";
	}
	
	
}
