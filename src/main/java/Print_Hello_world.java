import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Print_Hello_world {
	public static void main(String[] args) {
		primeCal();
		multiply();
		sumofNumber();
		System.out.println("--------------");
		forLop();

		sumNumber();
		System.out.println("--------------");
		divedNumer();
		System.out.println("--------------");
		factorial();
		System.out.println("--------------");
		Fibonacci();
		System.out.println("Hello\nAlexandra Abramov!");
		duplicatecount();
	}

	static void sumNumber() {
		int sum = 24 + 26;
		System.out.println(sum);

	}

	static void divedNumer() {

		int num = 50 / 3;
		System.out.println(num);

	}

	static void factorial() {

		int num = 10;
		int factorial = 1;
		for (int i = 1; i <= num; i++) {
			factorial = factorial * i;

		}
		System.out.println("factorial Num  " + num + " =  " + factorial);

	}

	public static void Fibonacci() {
		int n = 10, firstTerm = 0, secondTerm = 1;
		System.out.println("Fibonacci Series up to " + n + " terms:");
		for (int i = 1; i <= n; i++) {
			System.out.print(firstTerm + " ");
			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
	}

	static void forLop() {
		for (int i = 1; i <= 5; i = i + 1) {
			int val = 5 * i;
			System.out.println("5 * " + i + " = " + val);
			// System.out.println("AA");
			// break;

		}
	}

	static void sumofNumber() {

		int num = 12345, sum = 0;
		while (num != 0) {
			sum = sum + num % 10;
			num = num / 10;
		}
		System.out.println("Sum of digits = " + sum);
	}

	static void multiply() {

		int num = 12345;
		int multi = 1;

		while (num != 0) {
			multi = multi * (num % 10);
			num = num / 10;
			// System.out.println(multi);

		}
		System.out.println(multi);

	}

	static void duplicatecount() {
		String str = "aabbbcccc";
		// System.out.println(str.length());
		// System.out.println(str.charAt(0));
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			// System.out.print(charArray[i]);
		}
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : charArray) {
			System.out.print(c);
			if (c != ' ') {
				if (map.containsKey(c)) {
					map.put(c, map.get(c) + 1);

				} else {
					map.put(c, 1);
				}

			}

		}
		System.out.println("duplicate charactor + == ");

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + ":" + entry.getValue());

			}
		}

	}

	static void prime_number() {

	}

	static void primeCal() {
		int num = 5;
		int count = 0;
		for (int i = 1; i <= num; i++) {
			//System.out.println(num % 5 );
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 2)
			System.out.println("prime number ");
		else
			System.out.println("Not a prime number ");
	}
}
