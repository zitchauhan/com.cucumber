package Java;

public class OneMoreClass {

	public static void main(String[] args) {

		myStrings();

		char c = 'a';
		char[] arr = { 'a', 'b' };

		String str = String.valueOf(c);

		String str1 = String.valueOf(arr);

		System.out.println(str1);

		char[] arr1 = { 'a', 'b', 'c' };

	}

	static void myStrings() {

		char cc = 'c';
		String s = new String();

		s = s + cc;
		
		if (s.length() > 0) {
			char retrive = s.charAt(0);
			System.out.println(retrive);
		}
		// String strs = s.toString();

	}
}
