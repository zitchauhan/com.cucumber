import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Result {
	public static String solve(String S, int K) {
		StringBuilder newStr = new StringBuilder();

		// Step 1: Repeat the given string K times
		for (int i = 0; i < K; i++) {
			newStr.append(S);
		}

		// Step 2: Append the reverse of the given string (excluding the first
		// character) only once
		for (int i = S.length() - 2; i >= 0; i--) {
			newStr.append(S.charAt(i));
		}

		return newStr.toString();
	}
}

public class Source {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		String S = bufferedReader.readLine();

		int K = Integer.parseInt(bufferedReader.readLine());
		String result = Result.solve(S, K);

		System.out.println(result);
		bufferedReader.close();

	}
}
