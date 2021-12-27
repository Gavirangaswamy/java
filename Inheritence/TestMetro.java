package com.grs.learnInheritence;

import com.grs.learnInheritence.dto.Metro;

public class TestMetro {
	public static void main(String[] args) {

		Metro passenger = new Metro();
		System.out.println(passenger.voltage);
		System.out.println(passenger.noofCompartment);
		System.out.println(passenger.peopleCapacity);
		System.out.println(passenger.color);
		System.out.println(passenger.sensor);
		System.out.println(passenger.name);
		System.out.println(passenger.runBy);
		System.out.println(passenger.lengthinKM);
		System.out.println(passenger.purpose);

		String metro1 = passenger.name("Namma-Metro");
		System.out.println("name of the metro" + "\t" + metro1);

		String metro2 = passenger.carry("CarryPassengers");
		System.out.println("metro will " + metro2);

		long metro3 = passenger.price(6000000000l);
		System.out.println("price of metro" + "\t" + metro3);

		boolean metro4 = passenger.sound(false);
		System.out.println("metro make sound" + metro4);

		boolean metro5 = passenger.pollution(false);
		System.out.println("metro makes pollution" + metro5);

		String train1 = passenger.run("move");
		System.out.println("behavior of train" + train1);

		String train2 = passenger.carrying("Passenger&Goods");
		System.out.println("train is cheapest source to carry" + train2);

		String train3 = passenger.makingSound("Sound");
		System.out.println("train while running makes" + train3);

		String train4 = passenger.pullingBogies("pullBogies");
		System.out.println("mechanism of train" + "\t" + train4);

		String train5 = passenger.catering("FoodCatering");
		System.out.println("in train we can see" + "\t" + train5);

	}

}
