package dataStructure;

public class LinearSearch {

	public static void main(String[] args) {
		// 0 1 2 3 4 5 6 // index

		int[] arr = { 21, 70, 15, 30, 56, 78, 80 };
		// 1 2 3 4 5 6 7 // length

		// System.out.println(arr.length);
		int search = 310;

		// 0 i<7 increase i by one
		boolean bool = false;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == search)

			{

				System.out.println("element fount on index " + i); // index

				bool = true;
				break;

			}

		}
		if (!bool ) {

			System.out.println("element not found");
		}

	}

}
