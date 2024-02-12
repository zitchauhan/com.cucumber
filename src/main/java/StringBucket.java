public class StringBucket {

    public static void main(String[] args) {
        String[] str = {"automation", "abc"};
        int smallBucketSize = 3;
        int mediumBucketSize = 7;

        String smallBucket = "small";
        String mediumBucket = "medium";
        String largeBucket = "large";

        String result = bucket(str, smallBucketSize, mediumBucketSize, smallBucket, mediumBucket, largeBucket);
        System.out.println(result);
    }

    static String bucket(String[] words, int smallSize, int mediumSize, String small, String medium, String large) {
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            int length = word.length();

            if (length <= smallSize) {
                result.append(small).append(": ").append(word).append("\n");
            } else if (length > smallSize && length <= mediumSize) {
                result.append(medium).append(": ").append(word).append("\n");
            } else {
                result.append(large).append(": ").append(word).append("\n");
            }
        }

        return result.toString();
    }
}
