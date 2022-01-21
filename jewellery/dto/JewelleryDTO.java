package com.grs.exception.jewellery.dto;

import java.util.Objects;

public class JewelleryDTO {
	
	private String typeOfMetal;
	private double weight;
	private int designNumber;
	private int price;
	private String type;
	private String color;
	private byte carat;
	private String alloy;
	
	public String getTypeOfMetal() {
		return typeOfMetal;
	}
	public void setTypeOfMetal(String typeOfMetal) {
		this.typeOfMetal = typeOfMetal;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getDesignNumber() {
		return designNumber;
	}
	public void setDesignNumber(int designNumber) {
		this.designNumber = designNumber;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public byte getCarat() {
		return carat;
	}
	public void setCarat(byte carat) {
		this.carat = carat;
	}
	public String getAlloy() {
		return alloy;
	}
	public void setAlloy(String alloy) {
		this.alloy = alloy;
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName()+"[typeOfMetal=" + typeOfMetal + ", weight=" + weight + ", designNumber="
				+ designNumber + ", price=" + price + ", type=" + type + ", color=" + color + ", carat=" + carat
				+ ", alloy=" + alloy + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(alloy, carat, color, designNumber, price, type, typeOfMetal, weight);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof JewelleryDTO)) {
			return false;
		}
		JewelleryDTO other = (JewelleryDTO) obj;
		return Objects.equals(alloy, other.alloy) && carat == other.carat && Objects.equals(color, other.color)
				&& designNumber == other.designNumber && price == other.price && Objects.equals(type, other.type)
				&& Objects.equals(typeOfMetal, other.typeOfMetal)
				&& Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight);
	}
}
