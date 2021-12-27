
public class ParkRunner {

	public static void main(String[] args) {
		
		System.out.println(Park.parkName);
		System.out.println("===========");
		Park tree1 = new Park("Neem tree", (byte)50, (byte)100, "Azadirachta Indica", (short)25);
		System.out.println();
		Park tree2 = new Park("Banyan Tree", (byte)35, (byte)102, "Ficus Benghalensis", (short)28);
		System.out.println();
		Park tree3 = new Park("Pear Tree", (byte)52, (byte)103, "Pyrus Communis", (short)32);

	}

}
