
public class AddNumbers {
	/*
	 * Method to add an array of integers
	 */
	public static int addNumbers(int[] numbers) {
		int sum = 0;
		for (int num : numbers) {
			sum += num;
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] nums = { 5, 10, 15, 20, 25 };
		// Calling the addNumbers method and printing the result

		int total = addNumbers(nums);

		System.out.println("The sum of the numbers is: " + total);
	}

}
