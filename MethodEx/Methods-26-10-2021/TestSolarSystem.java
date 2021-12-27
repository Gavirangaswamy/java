
class TestSolarSystem{
	
	public static void main(String[]grs){
		String [] planets = SolarSystem.printPlanetsName();
		
    	 for (String planet:planets){
		 System.out.println(planet);
		 
		 }  
		 System.out.println("Number of planets in solarsystem :"+SolarSystem.getNoPlanets());
		 System.out.println("Age of solarsystem :"+SolarSystem.aboutSolarSystem(4751000000L)+"years");
		 System.out.println("Orbital Speed of solarsystem :"+SolarSystem.aboutSolarSystem(136)+"mps");
	}
}