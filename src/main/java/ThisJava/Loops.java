package ThisJava;
public class Loops {
    public static void main(String[] args) {
        // For Loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
        }

        // While Loop
        int j = 1;
        while (j <= 5) {
            System.out.println("Number: " + j);
            j++;
        }

        // Do-While Loop
        int k = 1;
        do {
            System.out.println("Number: " + k);
            k++;
        } while (k <= 5);
    }
}
