package com.cucumber;

public class Sorting {
	public static void main(String[] args) {
		bubulesort();
	}
	public static void bubulesort() {

		int[] arr = { 10, 4, 9, 1,3, 5, 2, 7 };

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = 0; j < arr.length - 1; j++) {

				if (arr[j] > arr[j + 1]) {

					int temp = arr[j];

					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

					// System.out.print(temp);
				}

			}
		}

		for (int num : arr) {
			System.out.println(num);
		}

	}
}
