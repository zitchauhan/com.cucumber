
public class SecondLargest {

	private static void printTaungle() {
		// TODO Auto-generated method stub

		for (int i = 1; i < 5; i++) {

			for (int k = 4; k > i; k--) {

				System.out.print(" ");
			}

			for (int j = 1; j < i; j++) {

				System.out.print(j + " ");
			}

			System.out.println();
		}
	}

	private static void printultalStar2() {
		// TODO Auto-generated method stub

		for (int i = 1; i < 5; i++) {

			for (int k = 4; k > i; k--) {

				System.out.print("");
			}

			for (int j = 1; j < i; j++) {

				System.out.print(j);
			}

			System.out.println();
		}
	}

	private static void printStar() {
		// TODO Auto-generated method stub

		for (int i = 1; i < 5; i++) {

			for (int j = 1; j < i; j++) {

				System.out.print(j);
			}

			System.out.println();
		}
	}

	public static void main(String[] args) {
		printStar();

		printultalStar2();
		
		printTaungle();
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

		int largest = 0;
		int secondlargest = 0;

		for (int i = 0; i < arr.length; i++) {

			for (int j = i; j < arr.length; j++) {

				if (arr[i] > largest) {

					secondlargest = largest;
					largest = arr[i];

				}

				else if (arr[i] > secondlargest)

				{
					secondlargest = arr[i];

				}
			}
		}

		System.out.println(secondlargest);

	}

}
