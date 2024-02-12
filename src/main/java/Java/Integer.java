package Java;

public class Integer extends StringSA {

	public static void main(String[] args) {

		char c = 'a';
		char d = 'd';
		String str1 = String.valueOf(c);
		
		System.out.println(str1);
	
		@SuppressWarnings({ "unused", "removal" })
		Character charra= new Character(c);
		
		Character.valueOf(c);
		
		String str  = String.valueOf(c);
	 
	//	char cc =   str.charAt(c);
		 
		  // integer method 
		Integer i = new Integer();
		StringSA.countCharacters(str);
		i.toString();
		
		String s  = new String();
	
		
		
		s.charAt(c) ;  //Returns the char value at the specified index. An index ranges from 0 to length() - 1. The first char value of the sequenceis at index 0, the next at index 1,and so on, as for array indexing.  
		s.compareTo(str);
		s.concat(str);  /// "cares".concat("s") returns "caress" "to".concat("get").concat("her") returns "together"
		s.contains(s);
		s.contentEquals(str);
		s.endsWith(str);
		s.indexOf(c);
		s.lastIndexOf(c);
		s.matches(str);
		s.replace(c, d);
		s.replaceAll(str, s);
		s.split(str);
		s.splitWithDelimiters(s, c);
		s.startsWith(s);
		s.substring(c);
		s.substring(c, c);
	    s.toCharArray();
	    s.toLowerCase();
	    s.toString();
	    s.toUpperCase();
	    s.trim();
	    
	    
		s.chars();
		s.codePointAt(c);
		s.indent(c);
		s.intern();
	    
	    // String Static method
	    s.valueOf(c);
	    s.join(s, args);
	    String.copyValueOf(null);
	    String.valueOf(false);
	    String.format(s, args);
	    String.join(s, args);
	   
		
	
	}
	
}

class StringSA {
	public static void main(String[] args) {
		String str = "Im m from india";
		countCharacters(str);
		// c ;
	}

	public static void countCharacters(String str) {
		char[] arr = str.toCharArray();

		// Create an array to store the count of each character
		int[] charCount = new int[256]; // Assuming ASCII characters

		// Count the occurrences of each character
		for (int i = 0; i < arr.length; i++) {
			charCount[arr[i]]++;
		}

		// Print the count of each character
		for (int i = 0; i < charCount.length; i++) {
			if (charCount[i] > 0) {
				System.out.println("Character '" + (char) i + "' occurs " + charCount[i] + " times.");
			}
		}
	}
}
