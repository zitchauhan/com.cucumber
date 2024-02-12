
public class Char_Char {

	public static void main(String[] args) {

		checkEqaulity();
	}

	private static void checkChar() {

		char myChar = 'A';
		if (Character.isDigit(myChar)) {
			System.out.println(myChar + " is a digit.");
		} else if (Character.isLetter(myChar)) {
			System.out.println(myChar + " is a letter.");
		} else {
			System.out.println(myChar + " is neither a digit nor a letter.");
		}
	}

	private static void convert() {
		char lowercaseChar = Character.toLowerCase('A');
		char uppercaseChar = Character.toUpperCase('a');

		System.out.println("Lowercase: " + lowercaseChar);
		System.out.println("Uppercase: " + uppercaseChar);

	}

	private static void checkWhileSpace() {
		char spaceChar = ' ';

		if (Character.isWhitespace(spaceChar)) {
		    System.out.println(spaceChar + " is a whitespace character.");
		} else {
		    System.out.println(spaceChar + " is not a whitespace character.");
		}

	}
	
	
	private static void convertASSCI() {
		char myChar = 'A';
		
		int asciiValue = (int) myChar;

		System.out.println("ASCII value of " + myChar + " is " + asciiValue);

		int asciiValue2 = 65;
		char charFromAscii = (char) asciiValue2;

		System.out.println("Character from ASCII value 65 is " + charFromAscii);


	}
	
	 private static void checkEqaulity() {
		 char char1 = 'A';
		 char char2 = 'a';

		 if (Character.toLowerCase(char1) == Character.toLowerCase(char2)) {
		     System.out.println(char1 + " and " + char2 + " are equal.");
		 } else {
		     System.out.println(char1 + " and " + char2 + " are not equal.");
		 }


	}
	 
	 
	 
}
