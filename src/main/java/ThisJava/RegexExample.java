package ThisJava;
import java.util.regex.*;

public class RegexExample {
    public static void main(String[] args) {
        String text = "The quick brown fox jumps over the lazy dog";
        String pattern = "quick.*dog";

        boolean isMatch = Pattern.matches(pattern, text);
        System.out.println("Pattern matches: " + isMatch);
    }
}
