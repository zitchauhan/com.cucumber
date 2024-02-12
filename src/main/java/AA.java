import java.util.Iterator;

public class AA {

	public static void main(String[] args) {
		String str = "This is a Jitendra Kumar";
		int count = 0;
		String[] words = str.split(" ");

		for (String word : words) {
			if (word.length() % 2 == 0) {
				System.out.println(word);
				count++;
			}
		}

		System.out.println("Total words with even length: " + count);

		 ma();
		traaingle();

	}

	static void ma() {

		int height = 5; // Set the height of the equilateral triangle

		// Loop to iterate through each row
		for (int i = 1; i <= height; i++) {
			// Loop to print spaces before the stars
			for (int j = 1; j <= height - i; j++) {
				System.out.print(" ");
			}

			// Loop to print stars in each row
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}

			// Move to the next line after each row
			System.out.println();
		}

	}

	static void traaingle() {

		for (int i = 1; i <= 5; i++) {

			for (int j = 4; j >= i; j--) {

				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*" + " ");
			}

			System.out.println();
		}

	}
}
