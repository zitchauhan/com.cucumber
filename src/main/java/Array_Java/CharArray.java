package Array_Java;

public class CharArray {

	public static void main(String[] args) {
		char[] arr = { 'j', 'i', 't', 'e', 'n', 'd', 'r', 'a' };
		char[] arr1 = { 'j', '1', 't', 'e', 'n', '$', 'r', 'a' };
		iterate_Char_Array(arr);
		System.out.println();

		char chara = iterate_till_length_Array(arr);
		System.out.println(chara);

		checkIfCharacterDigitOrLetter(arr1);

		convert_to_Upperand_lower(arr);
		
		 int x = 1;       	
		 System.out.println(x++);  // Post-increment    --  5
		 System.out.println(++x);  // Pre-increment     -- 6 
		 System.out.println(x--);  // Post-decrement    -- 5 
		 System.out.println(--x);  // Pre-decrement   -- 4

		 int y = 1; 
		 System.out.println(y++);
		// System.out.println(++y);  // Post-increment    --  5
		// System.out.println(y++);  // Pre-increment     -- 6 
		// System.out.println(--y);  // Post-decrement    -- 5 
		// System.out.println(y--);  // Pre-decrement   -- 4
		 
	}

	private static void iterate_Char_Array(char[] arr) {
		for (char ch : arr) {
			System.out.print(ch);
		}
	}

	private static char iterate_till_length_Array(char[] arr) {
		char character = ' ';
		for (char i = 0; i < arr.length; i++) {
			character = arr[i];
			return character;
		}
		return character;
	}

	private static void checkIfCharacterDigitOrLetter(char[] arr1) {
		for (char ch : arr1) {
			if (Character.isDigit(ch)) {
				System.out.println(" is digit : " + ch);
			} else if (Character.isLetter(ch)) {
				System.out.println(" is charater :" + ch);
			} else {

				System.out.println(" no char no digit ");
			}
		}
	}

	private static void convert_to_Upperand_lower(char[] arr) {

		for (int i = 0; i < arr.length; i++) {

			arr[i] = Character.isUpperCase(arr[i]) ?
					Character.toLowerCase(arr[i]) : Character.toUpperCase(arr[i]);

		}
	}

	public static void converinto_upperLatter(char[] arr) {

		for (int i = 0; i < arr.length; i++) {
			
			if (Character.isUpperCase(arr[i])) 
			{
				arr[i] = Character.toLowerCase(arr[i]);
			}
			else 
			{
				arr[i] = Character.toUpperCase(arr[i]);
			}
		}
	}

}
