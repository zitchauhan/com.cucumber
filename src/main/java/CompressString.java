public class CompressString

{
	public static void main(String[] args)

	{
		String str = "aabbbcccdddd";

		char[] arr = str.toCharArray();
		int[] newArr = new int[128];
		for (char ch : arr)

		{
			char c = ch;
			if (c != ' ') {
				newArr[c]++;
			}
		}

		for (int i = 0; i < newArr.length; i++) 
		{
			if (newArr[i] > 0)
			{
			
				System.out.print((char) i + "" + newArr[i]);
			}
		}

	}

}