package Java;

public class character {

	public static void main(String[] args) {

		String[] arr = { "Jitendra", "kumar", "chauhan" };
		characterMethods(arr);

	}

	private static void characterMethods(String[] arr) {
		String rev = " ";
		// reverse each word from sting array
		for (String str : arr) {

			String s = " ";

			s = s + str;

			for (int i = s.length() - 1; i >= 0; i--) {

				rev = rev + s.charAt(i);

			}

		}
		System.out.println(rev + " -");

	}

}
