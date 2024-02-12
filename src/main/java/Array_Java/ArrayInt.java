package Array_Java;

public class ArrayInt {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 2, 8, 4, 0, 5 };
		System.out.println();
	//	int a = sumOfArray(arr);
	//	int maximun = maxElementOfArray(arr);
	//	System.out.println(maximun);
		// valueUpdate();
	
		boolean elee = 	checkifElementExist(arr, 9);
		System.out.println(elee);

	}

	private static void valueUpdate() {

		int max = 0;
		int min = 1;

		int update = min + max;
		int update2 = (update + update) * 2;
		System.out.println(update);
		System.out.println(update2);

	}

	private static void iterateAnIntArray(int[] arr) {
		for (int elements : arr) {
			System.out.println(elements);
		}
	}

	static int sumOfArray(int[] arr) {
		int sum = 0;
		for (int ele : arr) {
			sum = sum + ele;
		}
		// System.out.println(sum);
		return sum;
	}

	static int maxElementOfArray(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {

				max = arr[i];

			}

		}
		return max;

	}

	private static boolean checkifElementExist(int[] arr , int search) {

		//int search = 8;
		boolean exist = false;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == search) {

				//System.out.println(i);
				return true;
			}else {
				return false;
			}
		}
		return exist;

	}

}
