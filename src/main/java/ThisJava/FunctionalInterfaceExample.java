package ThisJava;
import java.util.function.*;

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        // Predicate example
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println("Is 5 even? " + isEven.test(5));

        // Function example
        Function<Integer, Integer> square = n -> n * n;
        System.out.println("Square of 4: " + square.apply(4));

        // Consumer example
        Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());
        printUpperCase.accept("hello");
    }
}
