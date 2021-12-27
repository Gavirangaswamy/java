

public class Organism {
	
	String organismName;
	String organismGroup;
	float organismAvgAge;
	
	public Organism(String organismName, String organismGroup, float organismAvgAge) {
		
		this.organismName = organismName;
		this.organismGroup = organismGroup;
		this.organismAvgAge = organismAvgAge;
		
		System.out.println("Organism Name :"+organismName);
		System.out.println("Organism group :"+organismGroup);
		System.out.println("Organism Average age :"+organismAvgAge);
	}
	

}
