package Array_Java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import org.apache.commons.collections4.Get;

public class DuplicateFormString {
	public static void main(String[] args) {
		String str = "daabbbcccc";
		String output = "d1a2b3c4";
		char[] newStr = str.toCharArray();

		Arrays.sort(newStr);
		
		  for (int i = 0; i < newStr.length; i++) {
		  
		  System.out.println(newStr[i]); }
		 

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (char c : newStr) {

			if (map.containsKey(c))

			{
				map.put(c, map.get(c) + 1);
			} else

			{
				map.put(c, 1);
			}
		}

		
		// Displaying the character frequencies
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {

			System.out.println(entry.getKey() + "" + entry.getValue());
		}
	}
}
