package Array_Java;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringPatternSorted {
    public static void main(String[] args) {
        String str = "aabbcccd";
        StringBuilder output = new StringBuilder();

        char[] newStr = str.toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char c : newStr) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        // Sort the map by keys
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(entry -> output.append(entry.getKey()).append(entry.getValue()));

        System.out.println(output.toString());
    }
}
