import java.util.HashMap;
import java.util.Map;

public class FindTheSum {

    public static void main(String[] args) 
    		{
    	
    	Class<?> stringClass = String.class;
        System.out.println("Name of the class: " + stringClass.getName());
        System.out.println("Simple name of the class: " + stringClass.getSimpleName());
   
    	
    	String str = "find 20 the 1 2letest";
    	String str2  = "find the first repeted character in string";

    	String str3  = "middle";
    	
    	findsumofnumber(str);
    	manupulation(str2);

           }
    
 public static void middile(String str)
    
    {
	

    }
    
    public static void manupulation(String str)
    
    {
    	char [] arr = str.toCharArray();
    	char c = ' ';
    	Map<Character , Integer > map  = new HashMap<>() ;
    	for (char ch: arr) 
    	{
			if (map.containsKey(ch) && ch != ' ')
				
			{
				
				map.put(ch, map.get(ch)+1);
				
				c = ch;
				break;
			}
			
			else 
			{
				map.put(ch, 1);
				
			}
		}
    	
    	System.out.println(c);
    	
    	
    }
    
    
    private static  void findsumofnumber(String str ) {

    	 
         int sum = 0; // Initialize the sum variable

         char[] arr = str.toCharArray();

         // Loop through each character in the string
         for (char ch : arr) {
             // Check if the character is a digit
             if (ch >= '0' && ch <= '9') {
                 // Convert character to its numerical value and add it to the sum
                 sum = sum + ch - '0' ;
             }
         }

         // Print the sum of the numbers
         System.out.println("Sum of numbers: " + sum);


	}
}
