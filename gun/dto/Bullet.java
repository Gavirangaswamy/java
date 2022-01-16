package com.grs.armory.gun.dto;

public class Bullet {

	private String caliber;
	private String material;
	private String shapes;
	private String explosive;

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getShapes() {
		return shapes;
	}

	public void setShapes(String shapes) {
		this.shapes = shapes;
	}

	public String getExplosive() {
		return explosive;
	}

	public void setExplosive(String explosive) {
		this.explosive = explosive;
	}

	public String getCaliber() {
		return caliber;
	}

	public void setCaliber(String caliber) {
		this.caliber = caliber;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName()+"[material=" + material + ", shapes=" + shapes + ", explosive="
				+ explosive + "]";
	}

}
