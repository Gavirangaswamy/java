
public class ZooRunner {

	public static void main(String[] args) {
		
		System.out.println(Zoo.zooName);
		System.out.println();
		Zoo animal1 = new Zoo("Elephant", "Black", 500, (short)4000, true);
		System.out.println();
		Zoo animal2 = new Zoo("Lion", "Brown", 150, (short)400, true);
		System.out.println();
		Zoo animal3 = new Zoo("Tiger", "Brown with black patches", 180, (short)400, true);
	}

}
