package com.grs.mobiles.dto;

public interface MobileFunctions {

	boolean add(MobileDTO dto);

	void getAll();

	MobileDTO deleteByMobileID(int mobileID);

	MobileDTO updatePriceBySerialNumber(long serialNumber,int price);

	void getAllByBrandName(String brandName);
}
