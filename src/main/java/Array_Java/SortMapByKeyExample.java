package Array_Java;
import java.util.*;

public class SortMapByKeyExample {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        // Add entries to the map
        map.put('d', 5);
        map.put('a', 2);
        map.put('b', 3);
        map.put('c', 4);

        // Sort the map by keys
        Map<Character, Integer> sortedMap = new TreeMap<>(map);

        // Displaying the sorted map
        for (Map.Entry<Character, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + "" + entry.getValue());
        }
    }
}
