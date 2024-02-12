public class RemoveSpecialCharacters {
	public static void main(String[] args) {
		String inputString = "{{{[[[%%%%%%$$$###@@#$special characters!!";
		StringBuilder stringBuilder = new StringBuilder();

		for (int i = 0; i < inputString.length(); i++) {
			char currentChar = inputString.charAt(i);
			if ((currentChar >= 'A' && currentChar <= 'Z') || (currentChar >= 'a' && currentChar <= 'z')
					|| (currentChar >= '0' && currentChar <= '9') || currentChar == ' ') {
				stringBuilder.append(currentChar);
			}
		}

		String result = stringBuilder.toString();

		//System.out.println("Original string: " + inputString);
		System.out.println( result);
	}
}
