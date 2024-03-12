package ThisJava;
public class MethodOverloadingExample {
    public static void main(String[] args) {
        System.out.println(add(5, 3));
        System.out.println(add(5.5, 3.3));
    }
    
    // Method overloading
    public static int add(int a, int b) {
        return a + b;
    }
    
    public static double add(double a, double b) {
        return a + b;
    }
}
