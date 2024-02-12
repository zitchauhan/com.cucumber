package Java;

public class occurance

{
	public static void main(String[] args)
	{
		String str = "My Name is Gautam Pandey";
		char[] arr = str.toCharArray();
		int[] charCount = new int[256];
		for (int i = 0; i < arr.length; i++)
		{
			char ch = arr[i];
			if (ch != ' ') {
				charCount[ch]++;
			}

		}

	}
}