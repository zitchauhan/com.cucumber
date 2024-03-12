package ThisJava;
import java.util.*;
import java.util.stream.*;

public class StreamExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Filter names starting with 'A' and convert to uppercase
        List<String> filteredNames = names.stream()
                                          .filter(name -> name.startsWith("A"))
                                          .map(String::toUpperCase)
                                          .collect(Collectors.toList());

        System.out.println(filteredNames);
    }
}
