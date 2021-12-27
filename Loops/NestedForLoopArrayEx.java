public class NestedForLoopArrayEx {

	public static void main(String[] grs) {

		int [] number = {2,5,8,9,6,3};

		for (int i = 0; i < number.length; i++) {
			for (int j = i; j < number.length; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(number[j] + " ");
			}
			
			System.out.println();
		}

	}
}
