package com.grs.has_A.dtos;

public class AdressDTO {
	private String buildingName;
	private AreaDTO area;

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public AreaDTO getArea() {
		return area;
	}

	public void setArea(AreaDTO area) {
		this.area = area;
	}

	public String toString() {
		return "AdressDTO [buildingName=" + buildingName + ", area=" + area + "]";
	}

}
