package Array_Java;



public class StringPattern {
	
	public static void main(String[] args) {

		String s = "abbcccdddd";
		
		int count = 1;
		int i; 
		for (i = 0; i < s.length() - 1; i++) {

			if (s.charAt(i) != s.charAt(i + 1) && count == 1) {
				
				System.out.print(s.charAt(i));
				
				System.out.print(count);
			} else if (s.charAt(i) == s.charAt(i + 1)) {
				count++;
			} else if (s.charAt(i) != s.charAt(i + 1) && count >= 2) {

				System.out.print(s.charAt(i));

				System.out.print(count);

				count = 1;
			}
		}
		System.out.print(s.charAt(i));

		System.out.println(count);

	}

}