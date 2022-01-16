package com.grs.mobiles.dto;

import java.util.Objects;

public class MobileDTO {
	private int mobileID;
	private String modelName;
	private int price;
	private byte memory;
	private String brandName;
	private long serialNumber;
	private byte noOfCamera;

	public int getMobileID() {
		return mobileID;
	}

	public void setMobileID(int mobileID) {
		this.mobileID = mobileID;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public byte getMemory() {
		return memory;
	}

	public void setMemory(byte memory) {
		this.memory = memory;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public long getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(long serialNumber) {
		this.serialNumber = serialNumber;
	}

	public byte getNoOfCamera() {
		return noOfCamera;
	}

	public void setNoOfCamera(byte noOfCamera) {
		this.noOfCamera = noOfCamera;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + "[mobileID=" + mobileID + ", modelName=" + modelName + ", price="
				+ price + ", memory=" + memory + ", brandName=" + brandName + ", serialNumber=" + serialNumber
				+ ", noOfCamera=" + noOfCamera + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(brandName, memory, mobileID, modelName, noOfCamera, price, serialNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof MobileDTO)) {
			return false;
		}
		MobileDTO other = (MobileDTO) obj;
		return Objects.equals(brandName, other.brandName) && memory == other.memory && mobileID == other.mobileID
				&& Objects.equals(modelName, other.modelName) && noOfCamera == other.noOfCamera && price == other.price
				&& serialNumber == other.serialNumber;
	}
}
