package Array_Java;

public class ExceptionHandlingExample {
	public static void main(String[] args) throws Exception {

		throwsCheck();

		// newHandle();

		// Handle();

		// throwExeptionsUses();

	}

	public static void newHandle() {

		int a = 0;
		int b = 10;
		// int c = b/a;
		try {
			int c = b / a;
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println(e);
			System.out.println("I have handle above exception");
		}

	}

	public static void Handle() {
		try {
			// Code that may throw exceptions
			int a = 10;
			int b = 0;
			int result = a / b; // This line will throw ArithmeticException

			int[] arr = new int[5];
			System.out.println(arr[6]); // This line will throw ArrayIndexOutOfBoundsException
		}

		catch (ArithmeticException e)

		{
			// Handling ArithmeticException
			System.out.println("ArithmeticException caught: " + e);
		}

		catch (ArrayIndexOutOfBoundsException e)

		{
			// Handling ArrayIndexOutOfBoundsException
			System.out.println("ArrayIndexOutOfBoundsException caught: " + e);
		}
		System.out.println("After Exception handling");
	}

	public static void throwExeptionsUses() {

		int age = 18;
		// int b = 0 ;
		if (age > 8) {

			throw new ArithmeticException("you are not eligible to vote");
		}

		else if (age == 18) {

			System.out.println("you are  eligible to vote");

		} else {

			System.out.println("you eligible to vote ");
		}

	}

	public static void throwsCheck() throws ArithmeticException {
		int age = 18;
		if (age >= 18) {

			throw new ArithmeticException(" i have added my message to handle exception ");
		} else {
			System.out.println("I dont have any msg");
		}
	}
}
