package Array_Java;

public class Str {
	public static void main(String[] args) {
		String str = "0120";
		int count = 0;

		for (int i = 0; i < str.length(); i++) {

			int countZero = 0, countOne = 0, countTwo = 0;

			for (int j = i; j < str.length(); j++) {
				if (str.charAt(j) == '0') {
					countZero++;
				} else if (str.charAt(j) == '1') {
					countOne++;
				} else if (str.charAt(j) == '2') {
					countTwo++;
				}

				System.out.println(countOne);
				if (countZero == countOne && countOne == countTwo) {
					count++;
				}
			}
		}

		System.out.println("Number "
				+ "of substrings with equal counts of 0s, 1s, and 2s: " + count);
	}
}
