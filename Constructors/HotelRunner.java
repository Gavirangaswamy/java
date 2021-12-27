
public class HotelRunner {

	public static void main(String[] args) {
		
		System.out.println(Hotel.Hname);
		System.out.println("==========");
		
		Hotel food1 = new Hotel((short)11, "Biriyani", "NonVeg", (short)350);
		System.out.println();
		Hotel food2 = new Hotel((short)12, "Idlisambar", "Veg", (short)50);
		System.out.println();
		Hotel food3 = new Hotel((short)15, "Fishcurry", "Marinefood", (short)250);
		System.out.println();
		Hotel food4 = new Hotel((short)18, "Chowchowbath", "Veg", (short)60);
		System.out.println();
		Hotel food5 = new Hotel((short)19, "Gobimanchorian", "Fastfood(Veg)", (short)50);
	}

}
