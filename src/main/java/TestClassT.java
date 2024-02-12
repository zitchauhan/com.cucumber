import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class TestClassT {

	public static void main(String[] args) {

		vvoel();

	}

	public static void vvoel() {

		String str = "Jitendra";

		String vovel = "aeiouAEIOU";

		String newStr = " ";

		char[] ch = str.toCharArray();

		for (char c : ch) {

			if (vovel.indexOf(c) == -1) {

				newStr = newStr + c;
			}

		}

		System.out.println(newStr);

	}

	public static void method2() {

		String str = "wwwppgbbbbttt";

		char arr[] = str.toCharArray();

		int[] count = new int[128];

		for (int i = 0; i < arr.length; i++) {

			char ch = arr[i];

			if (ch != ' ') {

				count[ch]++;
			}

		}

		for (int i = 0; i < count.length; i++) {

			if (count[i] > 0) {

				System.out.print((char) i + "" + count[i]);
			}

		}
	}

	public static void method1() {

		String str = "wwwppgbbbbttt";
		// + op= w3p2g1b4t3 "

		char arr[] = str.toCharArray();

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (char ch : arr) {

			if (map.containsKey(ch)) {

				map.put(ch, map.get(ch) + 1);

			} else

			{
				map.put(ch, 1);

			}
		}

		List<Map.Entry<Character, Integer>> entryList = new ArrayList<>(map.entrySet());

		// Sort the list based on values (counts)
		entryList.sort(Map.Entry.comparingByValue());

		for (Entry<Character, Integer> ls : entryList) {

			// System.out.print(ls);

			Iterator<Entry<Character, Integer>> itr = entryList.iterator();

			while (itr.hasNext()) {

				// System.out.println(itr.next());
			}
		}

		for (Map.Entry<Character, Integer> entrylist : map.entrySet()) {

			// System.out.print(entrylist.getKey() + "" + entrylist.getValue());
		}
	}

}
