package ExcelUtility;

public class Palildrom {

	public static void main(String[] args) {

		String str = "ABBA";
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			rev = rev + str.charAt(i);

		}
		System.out.println(rev);
		
		if (rev.equals(str)) {

			System.out.println("String is palildrom");

		} else {
			System.out.println("Strng is not palildrom");
		}
	}

}
