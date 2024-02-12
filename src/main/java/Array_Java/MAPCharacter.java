package Array_Java;

import java.util.HashMap;
import java.util.Map;

public class MAPCharacter {
	public static void main(String[] args) {
		String str = "jitendra a hhh";
		char[] arr = str.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char ch : arr) {
			if (map.containsKey(ch) && ch != ' ') {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + "=" + entry.getValue());
			}

		}

	}
}