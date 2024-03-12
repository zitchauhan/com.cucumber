package ThisJava;
import java.util.function.*;

public class LambdaExample {
    public static void main(String[] args) {
        // Lambda expression with no parameters
        Runnable runnable = () -> System.out.println("Hello from lambda");
        runnable.run();

        // Lambda expression with parameters
        BinaryOperator<Integer> add = (a, b) -> a + b;
        System.out.println("Addition: " + add.apply(5, 3));
    }
}
