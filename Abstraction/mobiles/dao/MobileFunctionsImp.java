package com.grs.mobiles.dao;

import com.grs.mobiles.dto.MobileDTO;
import com.grs.mobiles.dto.MobileFunctions;

public class MobileFunctionsImp implements MobileFunctions {
	MobileDTO[] dtos = new MobileDTO[3];

	int index = 0;

	@Override
	public boolean add(MobileDTO dto) {
		if (index < dtos.length) {
			dtos[index] = dto;
			index++;
			return true;
		}
		return false;
	}

	@Override
	public void getAll() {
		for (int i = 0; i < dtos.length; i++) {
			System.out.println(dtos[i]);
		}

	}

	@Override
	public MobileDTO deleteByMobileID(int mobileID) {
		MobileDTO mobile = null;
		for (int i = 0; i < dtos.length; i++) {
			if (mobileID == dtos[i].getMobileID()) {
				dtos[i] = null;
				return mobile = dtos[i];
			}
		}
		return mobile;
	}

	@Override
	public MobileDTO updatePriceBySerialNumber(long serialNumber, int price) {
		MobileDTO mobile = null;
		for (int i = 0; i < dtos.length; i++) {
			if (serialNumber == dtos[i].getSerialNumber()) {
				dtos[i].setPrice(price);
				return mobile = dtos[i];
			}
		}
		return mobile;
	}

	@Override
	public void getAllByBrandName(String brandName) {
		for (int i = 0; i < dtos.length; i++) {
			if (dtos[i] != null && brandName == dtos[i].getBrandName()) {
				System.out.println(dtos[i]);
			}
		}

	}
}
