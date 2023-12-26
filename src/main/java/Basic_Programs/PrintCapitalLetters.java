package Basic_Programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PrintCapitalLetters {

	
	public static void main(String[] args) {
	
		String str = "This is Jitendra";
		
		String[] words = str.split("\\s");

		for (String word : words) {
			
			
			 
			//System.out.print(word + " ");
			  if (word.matches("[A-Z]+")) {
				  System.out.println(word);
			  }
		}

	}

}
