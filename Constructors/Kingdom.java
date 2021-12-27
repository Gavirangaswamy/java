
public class Kingdom {
	
	String kingdomName;
	String kingName;
	float kingdomArea;
	int militarySize;
	public Kingdom(String kingdomName, String kingName, float kingdomArea, int militarySize) {
		
		this.kingdomName = kingdomName;
		this.kingName = kingName;
		this.kingdomArea = kingdomArea;
		this.militarySize = militarySize;
		
		System.out.println("Kingdom Name : "+kingdomName);
		System.out.println("King Name : "+kingName);
		System.out.println("Kingdom area : "+kingdomArea+"Sqkm");
		System.out.println("Kingdom Military Size : "+militarySize);
	}
	
	

}
