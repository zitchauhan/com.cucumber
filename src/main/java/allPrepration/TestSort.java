package allPrepration;

public class TestSort
{
	public static void main(String[] args) 
	{
				sor();
				System.out.println("h");
			}
	
	private static void sor() {
		int[] arr = { 4, 3, 1, 5, 2 };

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length - 1; j++) {
				
				if (arr[j]>arr[j+1]) {
				int temp 	= arr[j];
				arr[j] 		= arr[j + 1];
				arr[j + 1]  = temp;
				
				}
			}
		}



	}
}
