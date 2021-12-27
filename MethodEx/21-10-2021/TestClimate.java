class TestClimate{
	
	public static void main(String[]grs){
		
		System.out.println(Climate.aboutClimate());
		System.out.println("Temperature  :"+Climate.weather(25.6)+"C");
		System.out.println("Humidity :"+Climate.weather(25.6,80f)+"%");
	
	}
	
}