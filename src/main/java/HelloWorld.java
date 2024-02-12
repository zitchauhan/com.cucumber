public class HelloWorld {
    public static void main(String[] args) {
  
  //  	occrance(str, input);
        int[] arr = {11, 21,21, 0, 3, 4, 5, 5, 9, 90, 98};

        int count = 0;
        
        int[] newarr = arr.clone();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j]== arr[i]) {
                  count++;
               // newarr= (arr[i]);
                
                }
            }
        }

       // System.out.print(" - "+count);
    // String  str = "this is jitendra is";
    // String input = "is";
            String str = "this is jitendra is";
            String input = "is";
            String result = occurrence(str, input);
            System.out.println("Occurrences: " + result);
        }

        static String occurrence(String str, String input) {
            int count = 0;
            int index = 0;

            while ((index = str.indexOf(input, index)) != -1) {
                count++;
                index += input.length();
            }

            return "The substring '" + input + "' appears " + count + " times.";
        }
    }


