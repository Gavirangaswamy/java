
public class ClimateRunner {

	public static void main(String[] args) {

		Climate indianClimate = new Climate();
		
		indianClimate.setAtmosphericPressure(683);
		indianClimate.setTemperature(34);
		indianClimate.setWindDirection("NE");
		indianClimate.setWindSpeed((byte)6);
		indianClimate.setHumidity(94);
		
		System.out.println(indianClimate.getAtmosphericPressure()+"mmHg");
		System.out.println(indianClimate.getHumidity()+"%");
		System.out.println(indianClimate.getTemperature()+"C");
		System.out.println(indianClimate.getWindDirection());
		System.out.println(indianClimate.getWindSpeed()+"kmh");
	}

}
