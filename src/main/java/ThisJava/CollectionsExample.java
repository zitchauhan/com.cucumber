package ThisJava;
import java.util.*;

public class CollectionsExample {
    public static void main(String[] args) {
        // List Example
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        System.out.println("List: " + list);

        // Set Example
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println("Set: " + set);

        // Map Example
        Map<String, Integer> map = new HashMap<>();
        map.put("Java", 1);
        map.put("Python", 2);
        map.put("C++", 3);
        System.out.println("Map: " + map);
    }
}
