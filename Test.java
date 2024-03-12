
public class Test {

	
	

		public static String reverse(String input) {
		    String[] arr = input.split(" ");
		    String rev = "";
		    
		    for (int i = arr.length - 1; i >= 0; i--) {
		        rev = rev + arr[i] + " ";
		    }
		    
		    return rev.trim();
		}

		
		
	
	
	public static void main(String[] args) {
		
		
		String s = reverse("This is Me");
		System.out.println(s);
		

		int a[] = { 1, 2, 2, 3, 3, 4, 5 };

		// 1=1
		// 1!=
		// Remove the duplicates from the integer array. DO NOT USE JAVA SET CONCEPT
		// Output: {1,2,3,4,5}

		int temp = 0;
		// [a.length];

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length - i - 1; j++)

			{

			}
		}

	}

}
