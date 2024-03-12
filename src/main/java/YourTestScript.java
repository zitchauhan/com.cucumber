public class YourTestScript {
	
	

	
	public static void main(String[] args) {
		rotete();
		String str  = "\\{(*+?^$|Jitendra.[{(*+?^$|";
		replace(str);
		int[] arr = { 5, 4, 3, 1, 2 };
		int[] array = rev(arr);
		for (int a : array) {
			// System.out.print(a);
		}
		int[] sort = sortArray(arr);
		for (int a : sort) {
			// System.out.println(a);
		}
	}
	public static void replace(String str) 
		{
		System.out.println(str.replaceAll("[^a-zA-Z0-9]", ""));
	}
	private static  String[] even(String str)
	{
		String  [] arr = str.split(" ");
		String [] newArr = new String [arr.length];
		String s  = "";
		for ( int i  = 0 ; i < arr.length ; i ++)
				{
			    String ss  = arr[i];
			    
			    if ( ss.length()  % 2 == 0 )
			    	
			    {
			    	
			    	newArr[i] =arr[i];
			    }
			
		}
		
		return newArr;
		
	}

	private static void rotete() {
		
		String str = "This is Jitedra";
		
		   String [] value = even(str);
		   
		   for ( String g : value)
		   {
			   
			   System.out.println(g);
		   }
		   
		int[] arr = { 1, 2, 3, 4, 5 };
		int[] newArr = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			/*
			 * int index = (arr[i+3])%(i+3);
			 * 
			 * newArr[index] =arr[i];
			 */

			int a = arr[i + 3];
			System.out.println(a);
			break;
		}

	}

	

	public static int[] rev(int[] arr)

	{
		int[] newArr = new int[arr.length];
		int index = 0;
		for (int i = arr.length - 1; i >= 0; i--)

		{
			newArr[index] = arr[i];
			index++;
		}
		return newArr;
	}

	public static int[] sortArray(int[] arr)

	{
		int[] newArr = new int[arr.length];
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}

		}

		for (int i = 0; i < arr.length; i++)

		{
			newArr[i] = arr[i];

		}
		return newArr;

	}
}