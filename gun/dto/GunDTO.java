package com.grs.armory.gun.dto;

import java.util.Objects;

public class GunDTO {
	
	private int magzineSize;
	private String material;
	private float range;
	private GunTypes types;
	private Bullet bullet;
	private Company cDetails;
	
	
	public int getMagzineSize() {
		return magzineSize;
	}
	public void setMagzineSize(int magzineSize) {
		this.magzineSize = magzineSize;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public float getRange() {
		return range;
	}
	public void setRange(float range) {
		this.range = range;
	}
	public GunTypes getTypes() {
		return types;
	}
	public void setTypes(GunTypes types) {
		this.types = types;
	}
	public Bullet getBullet() {
		return bullet;
	}
	public void setBullet(Bullet bullet) {
		this.bullet = bullet;
	}
	public Company getcDetails() {
		return cDetails;
	}
	public void setcDetails(Company cDetails) {
		this.cDetails = cDetails;
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName()+"[magzineSize=" + magzineSize + ", material=" + material + ", range="
				+ range + ", types=" + types + ", bullet=" + bullet + ", cDetails=" + cDetails + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(bullet, cDetails, magzineSize, material, range, types);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof GunDTO)) {
			return false;
		}
		GunDTO other = (GunDTO) obj;
		return Objects.equals(bullet, other.bullet) && Objects.equals(cDetails, other.cDetails)
				&& magzineSize == other.magzineSize && Objects.equals(material, other.material)
			    && types == other.types;
	}
	
	
	
}
