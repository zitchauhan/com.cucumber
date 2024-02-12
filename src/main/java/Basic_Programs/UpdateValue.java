package Basic_Programs;

public class UpdateValue {

	public static void main(String[] args) {

		bubulesort();

		String str = "Hello World";

		char[] arr = str.toCharArray();
		int count = 1;
		for (char i = 0; i < arr.length; i++)

		{
			if ('l' == arr[i]) {

				arr[i] = Character.forDigit(count, 10);
				count++;
			}

			System.out.print(arr[i]);
		}

	}

	public static void bubulesort() {
		

	}

}
