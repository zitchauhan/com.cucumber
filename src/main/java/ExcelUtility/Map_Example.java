package ExcelUtility;

import java.util.HashMap;
import java.util.Map;

public class Map_Example {
	public static void main(String[] args) {
		duplicate_charactor();
	}

	public static void duplicate_charactor() {
// output should h2n2
		String str = "aabbbccccd";
		char[] arr = str.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char ch : arr) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
			
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {

			System.out.print(entry.getKey() + "" + entry.getValue());
		}
	}
}
