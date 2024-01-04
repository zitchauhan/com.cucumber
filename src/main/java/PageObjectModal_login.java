import java.util.Arrays;

import org.openqa.selenium.WebDriver;

public class PageObjectModal_login {

	WebDriver driver;

	PageObjectModal_login(WebDriver Idriver) {

		this.driver = Idriver;
	}

	public static void main(String[] args) {
		Arr();
		star();
	}

	public static void Arr() {

		int[] arr = { 1, 2, 8, 5, 9 };
		Arrays.sort(arr);

		int larget = 0;
		int secondlargest = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > larget) {

				secondlargest = larget;
				larget = arr[i];

			} else if (arr[i] > secondlargest) {

				secondlargest = larget;

			}

		}
		System.out.println(larget);

	}

	public static void star() {
		// outer loop to handle number of rows
		// n in this case
		for (int i = 0; i < 5; i++) {

			// inner loop to handle number spaces
			// values changing acc. to requirement
			for (int j = 5 - i; j > 1; j--) {
				// printing spaces
				System.out.print(" ");
			}

			// inner loop to handle number of columns
			// values changing acc. to outer loop
			for (int j = 0; j <= i; j++) {
				// printing stars
				System.out.print("* ");
			}

			// ending line after each row
			System.out.println();
		}

	}

	// TODO Auto-generated method stub
	public static void moveZeros(int[] arr) {
		int count = 0; // Count of non-zero elements

		// Traverse the array and move non-zero elements forward
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) 
			    
			
			 {
				
				arr[count] = arr[i];
				
				if (i != count)
				{
					arr[i] = 0;
				}
				count++;
			}
		}
	}
}
