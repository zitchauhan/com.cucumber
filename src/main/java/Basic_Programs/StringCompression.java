package Basic_Programs;

import java.util.*;

public class StringCompression {
	public static void main(String[] args) {
		String input = "faabbbcccddddd";

		Map<Character, Integer> map = new LinkedHashMap<>(); // LinkedHashMap to maintain insertion order
		
		StringBuilder compressed = new StringBuilder();

		for (char c : input.toCharArray()) {

			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());

		// Sorting the list based on values (frequencies)
		list.sort(Map.Entry.comparingByValue());

		for (Map.Entry<Character, Integer> entry : list) {

			compressed.append(entry.getKey()).append(entry.getValue());
		}

		String compressedString = compressed.toString();

		System.out.println("Compressed String: " + compressedString);
	}
}
