import java.util.regex.*;

public class RegexExample {
    public static void main(String[] args) {
        String text = "The quick brown fox jumps over the lazy dog";
        String pattern = "\\b\\w{5}\\b";

        Pattern p = Pattern.compile(pattern);
        Matcher matcher = p.matcher(text);

        while (matcher.find()) {
            System.out.println("Match: " + matcher.group());
        }
    }
}
