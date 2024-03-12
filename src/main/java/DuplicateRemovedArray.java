import java.util.HashSet;

public class DuplicateRemovedArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 5, 5 };
		removeDuplicateUsingHashSet(arr);
	}

	public static void removeDuplicateUsingHashSet(int[] arr) {
		HashSet<Integer> hs = new HashSet<>();
		int count = 0;

		// Add unique elements to HashSet and count them
		for (int num : arr) {
			if (!hs.contains(num)) {
				hs.add(num);
				count++;
			}
		}

		// Create a new array to store unique elements
		int[] newArr = new int[count];
		int index = 0;

		// Populate the new array with unique elements
		for (int aa : arr) {
			if (hs.contains(aa)) {
				newArr[index++] = aa;
				hs.remove(aa); // Remove the element from HashSet to avoid duplicates
			}
		}

		// Print the unique elements
		for (int num : newArr) {
			System.out.println(num);
		}
	}

	private static void removeDuplicate(int[] arr) {
		int countOfUniq = 1;
		for (int i = 1; i < arr.length; i++) {
			int a = arr[i];
			if (arr[i] != arr[i - 1]) {
				countOfUniq++;
			}
			// System.out.println(a);

		}
		// System.out.println(countOfUniq);

		int[] newArr = new int[countOfUniq];
		newArr[0] = arr[0];
		int index = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[i - 1]) {
				newArr[index++] = arr[i];

			}
			/*
			 * newArr[0] = 1; newArr[1] = 2; newArr[2] = 3; newArr[3] = 4; newArr[4] = 5;
			 * 
			 */

		}

		for (int aa : newArr) {
			System.out.println(aa);
		}

	}
}
