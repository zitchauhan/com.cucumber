import java.util.Arrays;

public class CharacterCountSortingByValue {
    public static void main(String[] args) {
        String str = "daabbbcccc";
        char[] arr = str.toCharArray();
        int[] charCounts = new int[128];

        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i];
            // Exclude spaces from the character count
            if (ch != ' ') {
                charCounts[ch]++;
            }
        }

        // Sorting based on counts in descending order 
       // Arrays.sort(charCounts);
        for (int j = 0;j < charCounts.length ;  j++) {
            if (charCounts[j] > 0) {
            	
                System.out.print((char) j + "" + charCounts[j]);
            }
        }
    }
}
