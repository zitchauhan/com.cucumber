
public class reverse_with_Recusrive {

	public static void main(String[] args) {

		System.out.println(rev("Jitendra"));

	}

	static String rev(String str) {

		if (str.length() == 1) {
			return str;
			
		} else {

			return rev(str.substring(1)) + str.charAt(0);
		}

	}

}
