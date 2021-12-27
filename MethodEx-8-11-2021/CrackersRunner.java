
public class CrackersRunner {

	public static void main(String[] args) {
		
		Crackers cracker = new Crackers();
		
		Crackers.color();
		System.out.println(cracker.noOfCrackers(1589));
		
		String[] arr = cracker.types(args);
		for(int i = 0 ; i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
