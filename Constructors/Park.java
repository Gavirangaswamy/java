
public class Park {
	
	static String parkName = "GRS PARK";
	String treeName;
	byte treeAge;
	byte treeId;
	String group;
	short treeHeight;
	
	public Park(String treeName, byte treeAge, byte treeId, String group, short treeHeight) {
		
		this.treeName = treeName;
		this.treeAge = treeAge;
		this.treeId = treeId;
		this.group = group;
		this.treeHeight = treeHeight;
		
		System.out.println("Tree ID for Reference :"+treeId);
		System.out.println("Tree Name  :"+treeName);
		System.out.println("Tree age  :"+treeAge+"yrs");
		System.out.println("Tree group  :"+group);
		System.out.println("Tree Height  :"+treeHeight+"mts");
	}
	
}
