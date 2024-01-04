import java.util.*;

public class sortt {

	public static void main(String[] args) {
		String s1 = "abbcccdddd";
		// output d1a2c3b4
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

		List<Map.Entry<Character, Integer>> entryList = new ArrayList<>(map.entrySet());

		// Sort the list based on the value (frequency) using Comparator
		entryList.sort(Comparator.comparing(Map.Entry::getValue));

		// Display the sorted characters with their frequencies concatenated
		for (Map.Entry<Character, Integer> entry : entryList) {
			System.out.print(entry.getKey() + "" + entry.getValue());
		}
	}
}
