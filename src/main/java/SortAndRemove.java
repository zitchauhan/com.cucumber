import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class SortAndRemove

{

	public static void main(String[] args)

	{	String str  = "aabcd";
		countofwordUsingMap(str);
		countOfCharacter();
		System.out.println();
		
		
		int[] arr = { 5, 2, -1, 2, 0, 5, 2, 3, 1, 0 };

		int[] sort = SortArray(arr);
		for (int a : sort)

		{
			System.out.println(a);
		}

		int[] uniqearray = RemoveDuplicates(sort);

		for (int b : uniqearray)

		{
			System.out.print(b);
		}
	}

	public static int[] SortArray(int[] arr)

	{
		int temp = 0;

		for (int i = 0; i < arr.length; i++)

		{
			for (int j = 0; j < arr.length - 1; j++)

			{
				if (arr[j] > arr[j + 1])

				{
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}
	public static int[] RemoveDuplicates(int[] arr)
	{
		if (arr.length == 0 || arr.length == 1)
		{
			return arr;
		}
		int[] srctemparr = new int[arr.length];
		int index = 0;
		for (int i = 0; i < arr.length - 1; i++)
		{
					if (arr[i] != arr[i + 1])

					{
						srctemparr[index++] = arr[i];
					}
		}
		srctemparr[index++] = arr[arr.length - 1];
		int[] destresultarr = new int[index];
		System.arraycopy(srctemparr, 0, destresultarr, 0, index);
		return destresultarr;
	}
	public static void countOfCharacter()
	{
		String str = "abbdcdds";
		char [] arr = str.toCharArray();
		int count = 0;
		int  [] newArr = new int[128];
		for( int i = 0 ; i < arr.length ; i++)
			
		{		char c = arr[i];
				if( c != ' ' )
				{  count++;
					newArr[c]++;
				}
		}
		System.out.println(count);
		
		for (int i = 0; i < newArr.length; i++)
		{
			if (newArr[i] > 0)
			{
				System.out.print((char)i +""+ newArr[i]);
			}
		}
	}
	
	 private static void countofwordUsingMap(String str)
	 
	 {
		 	char [] arr =	 str.toCharArray();
		 	
		 	Map<Character , Integer> map = new HashMap<>();
		 	
		    
		
		 		for(char ch : arr)
		 			
		 		{
		 			if(map.containsKey(ch))
		 			{
		 				map.put(ch , map.get(ch)+1 );
		 		
		 			}
		 			else
		 				
		 			{
		 				
		 				map.put(ch, 1);
		 			}
		 			
		 		}
		 System.out.println(map);

	}
	
}