package com.grs.armory.gun.dao;

import com.grs.armory.gun.dto.Company;
import com.grs.armory.gun.dto.GunDTO;
import com.grs.armory.gun.dto.GunTypes;

public class GunDAO {

	GunDTO[] guns = new GunDTO[3];
	GunDTO[] guns1 = new GunDTO[3];

	int index = 0;

	public String insert(GunDTO dto) {
		if (index < guns.length) {
			guns[index] = dto;
			index++;
			return "Inserted";
		}
		return "Not Inserted";
	}

	public String insertAll(GunDTO[] dto) {
		if (dto.length == guns1.length) {
			guns1 = dto;
			return "AO.Inserted";
		}
		return "AO.Not Inserted";
	}
	
	public GunDTO[] getByType(GunTypes type) {
		int j = 0;
		GunDTO[] dto = new GunDTO[guns.length];
		for (int i = 0; i < guns.length; i++) {
			if (guns[i]!= null && type.equals(guns[i].getTypes())) {
				dto[j] = guns[i];
				j++;
			}
		}
		return dto;
	}

	public GunDTO[] getAllByCompany(Company company) {
		int j = 0;
		GunDTO[] dto = new GunDTO[guns.length];
		for (int i = 0; i < guns.length; i++) {
			if (guns[i]!= null && company.equals(guns[i].getcDetails())) {
				dto[j] = guns[i];
				j++;
			}
		}
		return dto;
	}

	public GunDTO updateRangeByType(float range, GunTypes type) {
		GunDTO dto1 = null;
		for (int i = 0; i < guns.length; i++) {
			if (guns[i]!= null && type.equals(guns[i].getTypes())) {
				guns[i].setRange(range);;
				dto1 = guns[i];
				return dto1;
			}
		}
		return dto1;
	}
	
	public String deleteByMagzinesize(int msize) {
		for (int i = 0; i < guns.length; i++) {
			if (guns[i]!= null && msize == (guns[i].getMagzineSize())) {
				 guns[i] = null;
				return "deleted";
			}
		}
		return "Not Deleted";
	}
	
	public String deleteByMaterial(String material) {
		for (int i = 0; i < guns.length; i++) {
			if (guns[i]!= null && material.equals(guns[i].getMaterial())) {
				 guns[i] = null;
				return "deleted";
			}
		}
		return "Not Deleted";
	}

	public void printAll() {
		for (int i = 0; i < guns.length; i++) {
			System.out.println(guns[i]);
		}
	}

}
