package Array_Java;

import java.util.HashSet;
import java.util.Set;

public class DuplicateFromStringss {

	public static void main(String[] args) {

		String str = "this is alf alf jitendra is";
		String[] arr = str.split(" ");
		duplicateinString(str);

	}

	
	public static void stringLoop(String str) 
	
	{
		
	
		
	}
	private static void duplicateinString(String str) {
		
		char [] arr  = str.toCharArray();
		
		 int [] countOfChar = new int [128];
		 
		 for( int i = 0 ; i < arr.length; i++ ) {
			 
			 char ch = arr[i];
			 
			 if ( ch != ' ') {
				 countOfChar[ch]++;
				 
			 }
		 }
		 
		 for (int i = 0 ; i < countOfChar.length ; i++ ) {
			 
			 if ( countOfChar[i] > 0 ) {
				 
				 System.out.println((char) i + " "+  countOfChar[i]);
				 
			 }
			 
		 }
	}

	private static void evenodd(String[] arr) {
		int count = 0;

		for (String eachWord : arr) {
			if (eachWord.length() % 2 == 1) {
				System.out.print(eachWord + " ");
				count++;
			}
		}

		System.out.println(" and count is = " + count);
	}

	private static void duplicatefind(String[] arr) {

		int count = 0;
		Set<String> words = new HashSet<String>();
		for (String word : arr) {

			if (!words.add(word)) {
				System.out.println(word);
				count++;
			}
		}
		System.out.println(count);

	}

}
