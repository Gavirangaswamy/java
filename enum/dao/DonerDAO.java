package com.grs.enums.dao;

import com.grs.enums.dto.BloodGroup;
import com.grs.enums.dto.DonerDTO;
import com.grs.enums.dto.Gender;

public class DonerDAO {

	DonerDTO[] donerdto = new DonerDTO[3];

	int index = 0;

	public String insert(DonerDTO dto) {
		if (index < donerdto.length) {
			donerdto[index] = dto;
			index++;
			return "Inserted";
		}
		return "Not Inserted";
	}

	public String insertAll(DonerDTO[] dto) {
		if (dto.length == donerdto.length) {
			donerdto = dto;
			return "AO.Inserted";
		}
		return "AO.Not Inserted";
	}

	public DonerDTO[] getAllByGender(Gender gender) {
		int j = 0;
		DonerDTO[] dto = new DonerDTO[donerdto.length];
		for (int i = 0; i < donerdto.length; i++) {
			if (donerdto[i]!= null && gender.equals(donerdto[i].getGender())) {
				dto[j] = donerdto[i];
				j++;
			}
		}
		return dto;
	}

	public DonerDTO[] getAllByBloodGroup(BloodGroup bloodGroup) {
		int j = 0;
		DonerDTO[] dto = new DonerDTO[donerdto.length];
		for (int i = 0; i < donerdto.length; i++) {
			if (donerdto[i]!= null && bloodGroup.equals(donerdto[i].getBloodgroup())) {
				dto[j] = donerdto[i];
				j++;
			}
		}
		return dto;
	}

	public DonerDTO updateContactByName(String name, long contact) {
		DonerDTO dto1 = null;
		for (int i = 0; i < donerdto.length; i++) {
			if (donerdto[i]!= null && name.equals(donerdto[i].getName())) {
				donerdto[i].getConatctDetails().setContactNumber(contact);
				dto1 = donerdto[i];
				return dto1;
			}
		}
		return dto1;
	}

	public void printAll() {
		for (int i = 0; i < donerdto.length; i++) {
			System.out.println(donerdto[i]);
		}
	}

}
