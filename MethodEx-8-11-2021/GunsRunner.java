
public class GunsRunner {

	public static void main(String[] args) {
		
		Guns gun = new Guns();
		
		Guns.color();
		System.out.println(gun.noOfGuns(8520));
		
		String[] arr = gun.types(args);
		for(int i = 0 ; i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
