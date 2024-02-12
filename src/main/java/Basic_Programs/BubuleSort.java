package Basic_Programs;

public class BubuleSort {
	
public static void main(String[] args) {
	
	int[] arr = { 3, 2, 4, 1, 5, 0, 4, 5 };
	int temp = 0;

	for (int i = 0; i < arr.length; i++) {
		for (int j = i; j < arr.length - 1 - i; j++) {
			if (arr[j] > arr[j + 1]) {
				// Swap arr[j] and arr[j+1]
				temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
			}
		}
	}

	// Print the sorted array
	for (int array : arr) {
		System.out.println(array);
	}
	
}

}
