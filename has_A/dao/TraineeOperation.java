package com.grs.has_A.dao;

import com.grs.has_A.dtos.TraineeDetails;

public class TraineeOperation {

	TraineeDetails[] details = new TraineeDetails[4];
	int index = 0;

	public void save(TraineeDetails names) {
		if (index < details.length) {
			details[index] = names;
			index++;
		}
	}

	public void printAll() {
		for (int index = 0; index < details.length; index++) {
			if (details[index] != null) {
				System.out.println(details[index].toString());
			}
		}
	}

	public TraineeDetails updateCountryByName(String name, String country) {
		TraineeDetails detail = null;
		for (int index = 0; index < details.length; index++) {
			if (details[index] != null) {
				if (name.equals(details[index].getName())) {
					details[index].getAdress().getArea().getDistrict().getTaluk().getState().setCountry(country);
					return detail = details[index];
				}
			}
		}
		return detail;
	}

	public TraineeDetails getByCountry(String country) {
		TraineeDetails detail = null;
		for (int index = 0; index < details.length; index++) {
			if (details[index] != null && country.equals(details[index].getAdress().getArea().getDistrict().getTaluk().getState().getCountry())) {
				return detail = details[index];
			}
		}
		return detail;
	}

	public TraineeDetails getByDistrict(String name) {
		TraineeDetails detail = null;
		for (int index = 0; index < details.length; index++) {
			if (details[index] != null) {
				if (name.equals(details[index].getAdress().getArea().getDistrict().getName())) {
					return detail = details[index];
				}
			}
		}
		return detail;
	}

}
