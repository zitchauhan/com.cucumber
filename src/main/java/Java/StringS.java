package Java;

public class StringS {
	public static void main(String[] args) {
		String str = "Im m from india";
		duplicatesInString(str);
	}

	public static void duplicatesInString(String str) {
		char[] arr = str.toCharArray();

		// Iterate through each character in the array
		for (int i = 0; i < arr.length; i++) {
			// Check if the current character is not already processed
			if (arr[i] != '\0') {
				// Iterate through the rest of the array to find duplicates
				for (int j = i + 1; j < arr.length; j++) {
					// Check if characters are the same
					if (arr[i] == arr[j]) {
						// Print the duplicate character
						System.out.print(arr[j] + "");

						
						
						// Mark the duplicate character as processed
					//	arr[j] = '\0';
						
					}
				}
			}
		}
	}
}
