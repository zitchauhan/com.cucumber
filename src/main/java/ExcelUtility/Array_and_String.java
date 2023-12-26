package ExcelUtility;

import java.util.Arrays;

public class Array_and_String {

	public static void main(String[] args) {

		// string_to_array();
		// array_to_String();
		// integer_to_String();
		// array_to_string_to_array();
		array_to_string_to_array1();
		//substring_in_sting();
	}

	public static void array_to_String() {
		// Your array declaration and initialization
		int[] array = { 1, 2, 3, 4, 5 };
		String covert = Arrays.toString(array);// Initialize the string variable
		System.out.println(covert); // Print the converted string

	}

	public static void string_to_array() {

		String str = "jitendra";
		char[] arr = str.toCharArray();
		// System.out.println(str.toCharArray());
		System.out.println(arr);

	}

	public static void integer_to_String() {
		int s = 1234;

		int number = 128;
		String str = Integer.toString(number);
		System.out.println(str);

		int number1 = 123;
		String str1 = "" + number1;
		System.out.println(str1);

	}

	public static void array_to_string_to_array() {

		String[] arr = { "jitendra", "kumar", "chauhan" };
		String array_to_str = Arrays.toString(arr);
		System.out.println(array_to_str);

		String[] words = array_to_str.split(" ");
		for (String arr1 : words) {
			System.out.println(words);
		}

	}

	public static void array_to_string_to_array1() {
		String[] arr = { "jitendra", "kumar", "chauhan" , "singh"};
		// Convert array to string
		String array_to_str = Arrays.toString(arr);
		System.out.println("Array as String: " + array_to_str);

		// Split string back to array
		String[] words = array_to_str.substring(1, array_to_str.length() - 1).split(", ");
		System.out.println(array_to_str.substring(1, array_to_str.length() - 1));
		for (String word : words) {
			System.out.println("Word: " + word);
		}

	}
	public static void substring_in_sting(){
		
		String str = "jitendra";
		System.out.println(str.substring(0));
		System.out.println(str.substring(1 ,str.length() -1));
	}
}
