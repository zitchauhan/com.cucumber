package com.common;

public class Swapping {
	public static void main(String[] args) {
		String str = "0001111000011";
		char[] arr = str.toCharArray();

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == '0' && arr[j] != '0') {
					char temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
					break; 

				}
			}
		}

		System.out.println(new String(arr));
	}
}
