public class PrimeNumbersFromArray {

	// Function to check if a number is prime
	static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true; 
	} 

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		// Count prime numbers to create a new array of the correct size
		int count = 0;
		for (int i : arr) {
			if (isPrime(i)) {
				count++;
			}
		}

		// Create an array to store prime numbers
		int[] primeArr = new int[count];
		int index = 0;

		// Fill the primeArr with prime numbers
		for (int i : arr) {
			if (isPrime(i)) {
				primeArr[index++] = i;
			}
		}

		// Print the prime number array
		System.out.print("Prime numbers in the array: [");
		for (int i = 0; i < primeArr.length; i++) {
			System.out.print(primeArr[i]);
			if (i < primeArr.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}
}
