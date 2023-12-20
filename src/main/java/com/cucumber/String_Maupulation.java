package com.cucumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

//import org.apache.commons.collections4.iterators.EntrySetMapIterator;

public class String_Maupulation {

	public static void main(String[] args) {
		String[] arr = { "cat", "dog", "cow", "elephant" };

		array_Reverse_add_into_arrayList();
		System.out.println("-----------------------");
		reverseStringArray();
		// Person p = new Person();
		// System.out.println(p.age);
		arrayRevesse();
		System.out.println("-----------------------");
		String_break();
		System.out.println("-----------------------");
		reverse_word();
		System.out.println("-----------------------");
		reverse_String();
		System.out.println("-----------------------");
		String_methods_code();
		System.out.println("-----------------------");
		String_Buffer_String_Builder_Methods();
		System.out.println("-----------------------");
		String_Comaparision();
		System.out.println("-----------------------");
		AlfaNumeric_String_String_Manupulation();
		System.out.println("-----------------------");
		swap_withoutThird_variable();
		System.out.println("-----------------------");
		duplicateCharactorCount();
		System.out.println("-----------------------");
		duplicate_from_array();
		System.out.println("-----------------------");
		decompress_string();
		mapExample();
	}

	public static void reverse_String() {

		String str = "Jitendra";
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {

			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
	}

	static void reverse_word() {
		String str = "My Name Is Jitendra";
		String[] words = str.split(" ");
		// String [] a = {"My" ,"Name" ,"Is", "Jitendra"};

		for (int i = 0; i < words.length; i++) {
			String newWord = words[i];
			String reversedWord = "";

			for (int j = newWord.length() - 1; j >= 0; j--) {
				reversedWord = reversedWord + newWord.charAt(j);
			}
			System.out.print(reversedWord + " ");

		}
		System.out.println();

	}

	public static void String_methods_code() {

		// creation of strings using String literals
		String str = "Coding Ninjas Studio";
		String str1 = "Coding";
		String str2 = "Ninjas";

		// print the strings on the screen
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println();

		// conctete string
		String result = str1 + " " + str2;
		System.out.println(result);

		// substing String substring(int StartIndex, int LastIndex)

		str.substring(1, 5);
		System.out.println(str.substring(1, 5)); // index start from 0
		System.out.println(str.toLowerCase()); // loer case
		System.out.println(str.toUpperCase()); // upper case

		System.out.println(str.trim());
	}

	public static void String_Buffer_String_Builder_Methods() {
		System.out.println("String:");
		String s = "Raman";
		System.out.println(s.hashCode());
		s = s.concat(" Bhadauria");
		System.out.println(s.hashCode());

		System.out.println("StringBuffer:");
		StringBuffer stringBuffer = new StringBuffer("Raman");
		System.out.println(stringBuffer.hashCode());
		stringBuffer.append(" Bhadauria");
		System.out.println(stringBuffer.hashCode());

		System.out.println("StringBuilder:");
		StringBuilder stringBuilder = new StringBuilder("Raman");
		System.out.println(stringBuilder.hashCode());
		stringBuilder.append(" Bhadauria");
		System.out.println(stringBuilder.hashCode());

		StringBuilder sb = new StringBuilder("Jitendra");
		System.out.println();
		System.out.println(sb.reverse());
	}

	public static void String_Comaparision() {

		{

			// creation of strings using new keyword
			String str = new String("Coding Ninjas Studio");
			String str1 = new String("Coding");
			String str2 = new String("Ninjas");
			// print the strings on the screen
			System.out.println(str);
			System.out.println(str1);
			System.out.println(str2);
		}
	}

	public static void AlfaNumeric_String_String_Manupulation() {

		String input = "a2b3c4";
		String outputs = "aabbbcccc";

		System.out.println(input.length() * outputs.length());

		char[] inputChars = input.toCharArray();
		char[] outputChars = new char[input.length() * outputs.length()]; // Assuming maximum length

		int outputIndex = 0;
		for (int i = 0; i < inputChars.length; i = i + 2) {
			char ch = inputChars[i];
			int count = inputChars[i + 1] - '0';

			for (int j = 0; j < count; j++) {
				outputChars[outputIndex++] = ch;
			}
		}

		String output = new String(outputChars, 0, outputIndex);

		System.out.println("Input: " + input);
		System.out.println("Output: " + output);
	}

	public static void swap_withoutThird_variable() {

		String str1 = "Good ", str2 = "morning ";
		// System.out.println("Strings before swapping: " + str1 + " " + str2);
		// Concatenate both the string str1 and str2 and store it in str1
		str1 = str1 + str2;
		// Extract str2 from updated str1
		// System.out.println(str1);
		// System.out.println(str1.length());
		// System.out.println(str2.length());

		str2 = str1.substring(0, (str1.length() - str2.length()));
		// System.out.println(str2);
		// Extract str1 from updated str1
		str1 = str1.substring(str2.length());
		System.out.println(str1);

		System.out.println("Strings after swapping: " + str1 + " " + str2);

	}

	public static void duplicateCharactorCount() {

		String str = "goodmorning";
		char[] ch = str.toCharArray();
		Map<Character, Integer> charCount = new HashMap<>();

		for (char c : ch) {
			if (c != ' ') {
				if (charCount.containsKey(c)) {
					charCount.put(c, charCount.get(c) + 1);
				} else {
					charCount.put(c, 1);
				}
			}
		}

		for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
			/// System.out.println("'" + entry.getKey() + "': " + entry.getValue());

			if (entry.getValue() > 1) {

				System.out.println("'" + entry.getKey() + "': " + entry.getValue());
			}
		}
	}

	public static void String_break() {

		String str = "JitendrakumarChauhan j";
		// Output : Jitendra Kuamr Chauhan;

		System.out.println(str.substring(0, 8));

		System.out.println(str.split(" "));

		char[] charr = str.toCharArray();

		for (char i = 0; i < charr.length; i++) {
			char eachchar = charr[i];
			System.out.println(charr[i]);

			// if ( charr[i] > )
		}

		char[] ch = str.toCharArray();
		Map<Character, Integer> charCount = new HashMap<>();

		for (char c : ch) {
			if (c != ' ') {
				if (charCount.containsKey(c)) {
					charCount.put(c, charCount.get(c) + 1);
				} else {
					charCount.put(c, 1);
				}
			}
		}

		for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
			/// System.out.println("'" + entry.getKey() + "': " + entry.getValue());

			if (entry.getValue() > 1) {

				System.out.println("'" + entry.getKey() + "': " + entry.getValue());
			}
		}
	}

	public static void duplicate_from_array() {
		int[] arr = { 1, 2, 3, 5, 5, 6, 7 };
		int largest = 0;
		int secondLargest = 0;

		for (int i = 0; i < arr.length; i++) {
			// System.out.print(arr[i] + " ");
			/// arr[i] -- get the the elements
			for (int j = i + 1; j < arr.length; j++) {
				// System.out.println("=");

				// System.out.print(arr[i] + " ----");

				if (arr[i] == arr[j]) {

					System.out.println("Duplicate from Array is :  " + arr[j]);
				}
			}

		}

	}

	public static void reverseStringArray() {

		String[] arr = { "cat", "dog", "cow", "elephant" };
		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			// Swap elements at start and end indices
			String temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;

			start++;
			end--;
			System.out.println(start + "" + end);
		}
	}

	static void array_Reverse_add_into_arrayList() {

		int[] arr = { 1, 2, 3, 4, 5, 6, 6, 7, 7 };
		for (int i = 0; i < arr.length; i++) {
			ArrayList<Integer> duplicates = new ArrayList<Integer>();
			// System.out.println(arr[i]);
			for (int j = i + 1; j < arr.length; j++) {

				// System.out.println(arr[j]);
				if (arr[i] == arr[j]) {
					System.out.println(arr[j] + " "); // duplicate array
					if (!duplicates.contains(arr[j])) {
						duplicates.add(arr[j]); // Add the duplicate to the ArrayList
					}
				}
			}
		}

		System.out.println();
		System.out.println("Hello, World!");
	}

	static void arrayRevesse() {

		String[] arr = { "cat", "dog", "cow" };

		for (String word : arr) {
			String reversedWord = "";
			for (int i = word.length() - 1; i >= 0; i--) {
				reversedWord += word.charAt(i);
			}
			System.out.print(reversedWord + " ");
		}
	}

	public static void decompress_string() {
		String input = "a2b3c4";
		String output = "";
		for (int i = 0; i < input.length(); i++) {
			if (Character.isDigit(input.charAt(i))) {
				int count = Integer.parseInt(input.substring(i, i + 1));
				for (int j = 0; j < count; j++) {
					output += input.charAt(i - 1);
				}
			} else {
				output += input.charAt(i);
			}
		}
		System.out.println(output);
	}

	public static void mapExample() {
		Map<String, Integer> map = new HashMap<>();
		map.put("india", 101);
		map.put("srilanka", 102);
		map.put("china", 103);

		// System.out.println((map));

		for (Map.Entry<String, Integer> entry : map.entrySet()) {

			entry.getKey();
			entry.getValue();
			// System.out.println(entry.getKey() + " " + entry.getValue());
		}

		List<String> al = new ArrayList<String>(map.keySet());
		for (String str : al) {
			System.out.print(str + " ");

		}
		List<Integer> al_Value = new ArrayList<Integer>(map.values());
		for (Integer str : al_Value) {
			System.out.println(str + " ");

		}
	}

	public static void removeDuplicateElements_from_Array() {

		int[] arr = { 3, 2, 1, 1, 2, 2, 3, 2, 1, 3 };

		Map<Integer, Integer> map = new HashMap<>();

		for (int key : arr) {

			if (map.containsKey(map)) {

				map.put(key, map.get(key) + 1);
			} else {

				map.put(key, 1);
			}

		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {

				System.out.print(entry.getKey() + " " + entry.getValue());
			}
		}
	}
}
