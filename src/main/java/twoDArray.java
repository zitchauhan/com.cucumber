import java.util.Arrays;

public class twoDArray {

	public static void main(String[] args) {

		charCout();

		System.out.println("-----");
		char[][] twoDArray3 = new char[2][3];

		twoDArray3[0][0] = 'a';
		twoDArray3[0][1] = 'b';
		twoDArray3[0][2] = 'c';

		twoDArray3[1][0] = 'd';
		twoDArray3[1][1] = 'e';
		twoDArray3[1][2] = 'f';

		System.out.println(twoDArray3[0][0]);
		System.out.println(twoDArray3[0][1]);
		System.out.println(twoDArray3[0][2]);

		System.out.println(twoDArray3[1][0]);
		System.out.println(twoDArray3[1][1]);
		System.out.println(twoDArray3[1][2]);

		System.out.println("-----------------");

		System.out.println(twoDArray3.length);

		for (int i = 0; i <= twoDArray3.length; i++) {
			for (int j = i; j <= twoDArray3.length; j++) {
				System.out.println(i + "_" + j);
			}
		}
		System.out.println("-----------------");

		for (int i = 1; i <= 3; i++) {
			for (int j = i; j <= 2; j++) {
				System.out.println(i + " " + j);
			}
		}

		System.out.println("-----------------");
		int[][] matrix = new int[2][3];

		// Assign values to the matrix elements
		matrix[0][0] = 1;
		matrix[0][1] = 2;
		matrix[0][2] = 3;

		matrix[1][0] = 4;
		matrix[1][1] = 5;
		matrix[1][2] = 6;

		// Print the matrix
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}

			System.out.println(); // Move to the next line after each row
		}

	}

	private static void charCout() {

		String str = "aabbbccccd";

		char[] arr = str.toCharArray();

		int[] countChar = new int[256];

		for (int i = 0; i < arr.length; i++) {

			char ch = arr[i];

			if (ch != ' ') {

				countChar[ch]++;

			}

		}

		// Create a StringBuilder to build the final result
	

		for (int i = 0; i < countChar.length; i++)

		{

			if (countChar[i] > 0) {

				System.out.print((char) i + "" + countChar[i]);

			}

		}

	}

}
