import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Sort_Map {

	public static void main(String[] args) {
		String s1 = "aaaabbbccd";
		// output d1 a2 c2 b3
		char[] arr = s1.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for (char ch : arr) {
			if (ch != ' ') {
				if (map.containsKey(ch)) {
					map.put(ch, map.get(ch) + 1);
				} else {
					map.put(ch, 1);
				}
			}
		}
		// Create a list from the values in the map
		List<Entry<Character, Integer>> entryList = new ArrayList<>(map.entrySet());
		// Sort the list basm, .ed on the frequency (value)
	
		// Display the sorted characters with their frequencies
		for (Entry<Character, Integer> entry : entryList) {
		System.out.print(entry.getKey() + "" + entry.getValue() + " ");
		}
	}
}
