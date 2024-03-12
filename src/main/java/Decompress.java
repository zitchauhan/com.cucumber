public class Decompress {
	public static void main(String[] args) 
	{
		String str = "a2b3c4";
		StringBuilder output = new StringBuilder();

		for (int i = 0; i < str.length(); i++) 
		{
			char ch = str.charAt(i);

			if (Character.isLetter(ch)) 
			{
				char nextChar = str.charAt(i + 1);

				if (Character.isDigit(nextChar)) 
				{
					int count = Character.getNumericValue(nextChar);

					for (int j = 0; j < count; j++) 
					{
						output.append(ch);
					}

					i++; // Move i to skip the count
				}
			}
		}

		System.out.println("Decompressed output: " + output.toString()); // Output: aabbbcccc
	}
}
