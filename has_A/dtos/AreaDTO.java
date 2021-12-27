package com.grs.has_A.dtos;

public class AreaDTO {
	private String areaName;
	private DistrictDTO district;

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public DistrictDTO getDistrict() {
		return district;
	}

	public void setDistrict(DistrictDTO district) {
		this.district = district;
	}

	public String toString() {
		return "AreaDTO [areaName=" + areaName + ", district=" + district + "]";
	}

}
