import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Frequncy {

	public static void main(String[] args) {
		String s1 = "aabbbccd";
		// output d1 a2 c2 b3
		char[] arr = s1.toCharArray();

		Map<Character, Integer> map = new HashMap<>();

		for (char ch : arr) {

			if (ch != ' ') {

				if (map.containsKey(ch)) {
					map.put(ch, map.get(ch) + 1);

				} else
					map.put(ch, 1);
			}
			List<Integer> sort = new ArrayList<Integer>();
			Collections.sort(sort);
			
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {

			// System.out.print(entry.getKey() + "" + entry.getValue() + " ");
			// System.out.print(entry.getKey() + "" + entry.getValue() + " ");

			// System.out.print(entry.getKey() + "" + entry.getValue() + " ");

		}

	}
}