class TestAgriculture{
	
	public static void main(String[]grs){
		
		System.out.println("Irrigated land in india (acre)  :"+Agriculture.areaOfLand(275967291));
		System.out.println("Unirrigated land in india (acre)  :"+Agriculture.areaOfLand(165560600));
		System.out.println(Agriculture.dependency(31.5f)+"%" +" of indian population depends on Agriculture");
	
	}
	
}