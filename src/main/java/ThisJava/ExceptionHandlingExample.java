package ThisJava;
public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    // Method that may throw an exception
    public static int divide(int a, int b) {
        return a / b;
    }
}
