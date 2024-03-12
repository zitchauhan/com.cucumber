
public class TestSort
{
	public static void main(String[] args) {

		int[] arr = { 4, 3, 1, 5, 2 };

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length - 1; j++) {
				
				int temp 	= arr[j];
				arr[j] 		= arr[j + 1];
				arr[j + 1]  = temp;
			}
		}

	}
}
