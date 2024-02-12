
public class StringArray {

	public static void main(String[] args) {
		String[] arr = { "Apple", "Banana", "Orange", "Orange" };
		searchAnElementInStringArray(arr);
	}

	private static void iterateArray() {
		String[] arr = { "Apple", "Banana", "Orange" };

		for (String item : arr) {
			System.out.println(item);
		}

	}

	public static void iterateStringArray(String[] arr) {

		for (String items : arr) {

			System.out.println(items);
		}

	}

	public static void concatetNetStringArray(String[] arr) {
		for (String item : arr) {
			String result = item;
			System.out.println(result);
		}
	}

	private static void lenghtofArray(String[] arr) {
		int length = arr.length;
		System.out.println("Array length: " + length);

	}

	public static void lengthofArrayString(String[] arr) {

		int length = arr.length;
		System.out.println(length);
	}

	private static void assingElementByindex(String[] arr) {
		String firstElement = arr[0];
		String secondElement = arr[1];
		String third = arr[3];

		System.out.println("First Element: " + firstElement);
		System.out.println("Second Element: " + secondElement);
		System.out.println("third Element: " + third);

	}

	private static void modifyAnArrayString(String[] arr) {

		String modified = "mango";
		arr[0] = modified;
		System.out.println(arr[0]);

	}

	static void searchAnElemntinStringArray(String[] arr) {

		String searchItem = "Banana";

		boolean found = false;

		for (String item : arr) {
			if (item.equals(searchItem)) {
				found = true;
				int foundonplace = item.indexOf(searchItem);
				System.out.println(foundonplace);
				break;
			}
		}

		if (found) {
			System.out.println(searchItem + " found in the array.");
		} else {
			System.out.println(searchItem + " not found in the array.");
		}

	}

	public static void searchAnElementInStringArray(String[] arr) {
		String searchItem = "Banana";
		boolean found = false;
		int index = 0;

		for (String item : arr) {
			if (item.equalsIgnoreCase(searchItem)) {
				found = true;
				System.out.println("Found '" + searchItem + "' at index: " + index);
			}
			index++;
		}

		if (!found) {
			System.out.println("'" + searchItem + "' not found in the array.");
		}
	}

}
