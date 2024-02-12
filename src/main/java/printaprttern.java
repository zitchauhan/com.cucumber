
public class printaprttern {
	public static void main(String[] args) {

		pattern1();
		System.out.println("\n" + "patten1 left traingle ");
		pattern2();
		System.out.println("\n" + "patten2 ulta  traingle ");
		pattern3();
		System.out.println("\n");
		pattern4();
		System.out.println("\n");
		pattern5();
		System.out.println("\n");
		pattern6();
		System.out.println("\n");
		pattern7();
		System.out.println("\n");
	}

	public static void pattern6() {

		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(" ");
			}

			for (int k = 4; k >= i; k--) {

				System.out.print(k);
			}

			System.out.println();
		}

	}

	public static void pattern7() {

		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(" ");
			}

			for (int k = 4; k >= i; k--) {

				System.out.print(k + " ");
			}

			System.out.println();
		}

	}

	public static void pattern1() {

		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

	public static void pattern4() {

		for (int i = 1; i <= 4; i++) { // this is main loop for row print

			for (int j = 4; j >= i; j--) {

				System.out.print(j + " "); // this is for space
			}
			/*
			 * for (int k = 1; k <= i; k++) {
			 * 
			 * System.out.print(k); // this is for value }
			 */
			System.out.println(); // this is for next line
		}
	}

	public static void pattern3() {

		for (int i = 1; i <= 4; i++) { // this is main loop

			for (int j = 3; j >= i; j--) {

				System.out.print(" "); // this is for space
			}

			for (int k = 1; k <= i; k++) {

				System.out.print(k + " "); // this is for value
			}

			System.out.println(); // this is for next line
		}
	}

	public static void pattern5() {

		for (int i = 1; i <= 4; i++) { // this is main loop

			for (int j = 3; j >= i; j--) {

				System.out.print(" "); // this is for space
			}

			for (int k = 1; k <= i; k++) {

				System.out.print(k); // this is for value
			}

			System.out.println(); // this is for next line
		}
	}

	public static void pattern2() {

		for (int i = 1; i <= 4; i++) {

			for (int j = 4; j >= i; j--) {

				System.out.print(j + " ");
			}
			System.out.println();

		}
	}

}
