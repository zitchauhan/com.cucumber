public class ReverseNumber {
	public static void main(String[] args) {
		int num = 123;
		int reversed = 0;
		boolean b = num == 0; // false
		boolean b1 = num >= 0; // true
		boolean b2 = num <= 0; // false
		boolean b3 = num < 0; // false
		boolean b4 = num > 0; // ture
		boolean b5 = num != 0; // true
		boolean  b6 = 0 != 0;
		System.out.println(b);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);

		System.out.println(b6);

		while (num != 0) 
		{
			int digit = num % 10;
			reversed = reversed * 10 + digit;
			num = num / 10;
		}

		System.out.println(reversed);
	}
}
