import java.util.HashMap;
import java.util.Map;

public class LKL

{

	private static void met() {
		Map<Character , Integer> map = new HashMap<> ();
			
			map.put('c',1 );
			
			map.containsKey('c');

			map.get('c');
			System.out.println(map.get('c'));
			
			System.out.println(map.containsKey('c'));
	}
	
	
	public static void main(String[] args)

	{

		
		met();
		String str = "this is jitendra chauhan";

		String[] arr = str.split(" ");

		// String [] arr = {"this" , "is" ,"jitendra" ,"chauhan"};

		for (int i = 0; i < arr.length; i++)

		{
			String words = arr[i];

		}

		for (String eatchWord : arr)

		{
			String wordRev = " ";

			// String eatchWord = words ;

			for (int i = eatchWord.length() - 1; i >= 0; i--)

			{
				wordRev = wordRev + eatchWord.charAt(i);
			}

			System.out.println(wordRev);

		}

		int[] arra = { 1, 2, 4, 5, 0 };

		for (int alfa : arra)

		{

			System.out.println(alfa);

		}

	}
}