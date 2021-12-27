package com.grs.learnInheritence.dto;

public class VIVO extends Phone {

	public String series = "vivoY31";
	public int price = 16490;
	public byte noofCamera = 03;
	public byte ram = 06;
	public short storage = 128;
	public String color = "black";

	public float Display(float display) {
		return display;
	}

	public String opertatingSystem(String OS) {
		return OS;
	}

	public String snapDragon(String SD) {
		return SD;
	}

	public int batteryCapacity(int battery) {
		return battery;
	}

	public byte cameraFeature(byte camera) {
		return camera;
	}

}
