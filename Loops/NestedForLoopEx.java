public class NestedForLoopEx {

	public static void main(String[] grs) {

		int number = 5;

		for (int i = 1; i <= number; i++) {
			for (int j = i; j <= number; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			for (int j = 1; j <= i - 1; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}
}
