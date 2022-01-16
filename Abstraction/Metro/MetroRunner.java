package com.grs.Metro;

import com.grs.Metro.abstraction.Metro;
import com.grs.Metro.abstraction.NammaMetro;

public class MetroRunner {

	public static void main(String[] args) {
		
		Metro metro = new NammaMetro();
		
		metro.purpleline();
		metro.purpleline(34.2);
		Metro.NoOfLanes(2);
		
		NammaMetro bmrcl = new NammaMetro();
		bmrcl.blueline();
		bmrcl.greenline();
		bmrcl.yellowline();
		bmrcl.distance = 132;
		System.out.println("Distance : "+bmrcl.distance);
		
		NammaMetro bmrcl1 = new NammaMetro(131);
		System.out.println("Distance : "+bmrcl1.distance);
		System.out.println("City Name : "+Metro.cityName);
		

	}

}
