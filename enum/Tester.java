package com.grs.enums;

import com.grs.enums.dao.DonerDAO;
import com.grs.enums.dto.BloodGroup;
import com.grs.enums.dto.ContactDetails;
import com.grs.enums.dto.DonerDTO;
import com.grs.enums.dto.Gender;

public class Tester {

	public static void main(String[] args) {
		DonerDAO dao = new DonerDAO();

		DonerDTO doner1 = new DonerDTO();
		doner1.setName("Arun");
		doner1.setAge((byte) 24);
		doner1.setWeight(75.6f);
		doner1.setBloodgroup(BloodGroup.O_POSITIVE);
		doner1.setGender(Gender.MALE);
		ContactDetails cDetails = new ContactDetails();
		cDetails.setAddress("Bangalore");
		cDetails.setContactNumber(3698784125l);
		cDetails.setEmail("arun@gmail.com");
		doner1.setConatctDetails(cDetails);

		DonerDTO doner2 = new DonerDTO();
		doner2.setName("Nagesh");
		doner2.setAge((byte) 26);
		doner2.setWeight(70.6f);
		doner2.setBloodgroup(BloodGroup.A_POSITIVE);
		doner2.setGender(Gender.MALE);
		ContactDetails cDetails1 = new ContactDetails();
		cDetails1.setAddress("Tumkur");
		cDetails1.setContactNumber(9856784125l);
		cDetails1.setEmail("nagesh@gmail.com");
		doner2.setConatctDetails(cDetails1);

		DonerDTO doner3 = new DonerDTO();
		doner3.setName("Anusha");
		doner3.setAge((byte) 23);
		doner3.setWeight(65.6f);
		doner3.setBloodgroup(BloodGroup.B_POSITIVE);
		doner3.setGender(Gender.FEMALE);
		ContactDetails cDetails2 = new ContactDetails();
		cDetails2.setAddress("Raichur");
		cDetails2.setContactNumber(98569884125l);
		cDetails2.setEmail("anusha@gmail.com");
		doner3.setConatctDetails(cDetails2);

		System.out.println(dao.insert(doner1));
		System.out.println(dao.insert(doner3));
		System.out.println(dao.insert(doner2));
		dao.printAll();
		DonerDTO[] doners = {doner1,doner2,doner3};
		System.out.println();
		System.out.println(dao.insertAll(doners));
		System.out.println();
		System.out.println("GET METHOD 👇");
		System.out.println();
		DonerDTO[] donerdetail = dao.getAllByGender(Gender.MALE);
		for(DonerDTO donerdetail1 : donerdetail) {
			System.out.println(donerdetail1);
		}
		System.out.println();
		DonerDTO[] donerdetails = dao.getAllByBloodGroup(BloodGroup.B_POSITIVE);
		for(DonerDTO donerdetail2 : donerdetails) {
			System.out.println(donerdetail2);
		}
		System.out.println();
		System.out.println("UPDATE METHOD 👇");
		System.out.println();
		System.out.println(dao.updateContactByName("Arun", 98564713345l));
		System.out.println();
	}

}
