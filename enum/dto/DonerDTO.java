package com.grs.enums.dto;

public class DonerDTO {

	private String name;
	private byte age;
	private float weight;
	private BloodGroup bloodgroup;
	private Gender gender;
	private ContactDetails conatctDetails;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public byte getAge() {
		return age;
	}
	public void setAge(byte age) {
		this.age = age;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public BloodGroup getBloodgroup() {
		return bloodgroup;
	}
	public void setBloodgroup(BloodGroup bloodgroup) {
		this.bloodgroup = bloodgroup;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public ContactDetails getConatctDetails() {
		return conatctDetails;
	}
	public void setConatctDetails(ContactDetails conatctDetails) {
		this.conatctDetails = conatctDetails;
	}
	
	@Override
	public String toString() {
		return "DonerDTO [name=" + name + ", age=" + age + ", weight=" + weight + ", bloodgroup=" + bloodgroup
				+ ", gender=" + gender + ", conatctDetails=" + conatctDetails + "]";
	}
	
}
