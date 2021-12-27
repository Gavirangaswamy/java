package com.grs.learnInheritence;

import com.grs.learnInheritence.dto.VIVO;

public class TestVivo {
	public static void main(String[] args) {

		VIVO vivo = new VIVO();
		System.out.println(vivo.brandName);
		System.out.println(vivo.type);
		System.out.println(vivo.ram);
		System.out.println(vivo.snapdragon);
		System.out.println(vivo.Camera);

		String mob1 = vivo.call("make call");
		System.out.println("mobiles are used for" + mob1);

		String mob2 = vivo.browsing("net Browsing");
		System.out.println("phones are mainly for" + mob2);

		String mob3 = vivo.Storage("Storage");
		System.out.println("phone has a" + mob3);

		String mob4 = vivo.Sharing("Share Data");
		System.out.println("phone used for" + mob4);

		String mob5 = vivo.DateTime("Data&Time");
		System.out.println("phone can show" + mob5);

		System.out.println(vivo.series);
		System.out.println(vivo.price);
		System.out.println(vivo.noofCamera);
		System.out.println(vivo.storage);
		System.out.println(vivo.color);
		float vivo1 = vivo.Display(6.58f);
		System.out.println("display of vivo" + vivo1);

		String vivo2 = vivo.opertatingSystem("OS11");
		System.out.println("operating system" + vivo2);

		String vivo3 = vivo.snapDragon("SDM662");
		System.out.println("snapdragon is" + vivo3);

		int vivo4 = vivo.batteryCapacity(5000);
		System.out.println("battery capacity" + vivo4);

		byte vivo5 = vivo.cameraFeature((byte) 48);
		System.out.println("camara feature" + vivo5);

	}

}
