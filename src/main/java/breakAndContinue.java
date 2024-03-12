import static org.testng.Assert.fail;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class breakAndContinue {

	public static void main(String[] args) {

		 whilss();

	}

	private static void whilss() {
		
		
		int a1 = 10 ;
		int b1 = a1;
System.out.println(a1 + b1++ );
System.out.println(b1);
		
		int five = 5 ;
		int two = 2;

		int outpur =five + (five>6 ? ++two : --two);
		
		int a = 10;
		int b = 20;

		do {
			a++;
		} while (a >= b);

		//System.out.println(a);
		
		while ( a < b) 

		{
			b--;
		//System.out.println(b);
		
		}
		

	}

	public static void whiles()

	{

		int a = 10;
		int b = 20;
		System.out.println("inceasing a");
		while (a <= b) {

			a++;

			System.out.println(a);

		}

		List<Integer> list = new ArrayList<Integer>();

		Iterator itr = list.iterator();
		while (itr.hasNext()) {

			Integer type = (Integer) itr.next();

		}

		/*
		 * while (en.hasMoreElements()) { type type = (type) en.nextElement();
		 * 
		 * }
		 */

		try {

		} catch (Exception e) {
			// TODO: handle exception
		}

		try {

		} finally {
			// TODO: handle finally clause
		}
		if (a < b) {

		} else if (a > b) {

		}

		fail();

		do {

			a++;
			continue;
		} while (a == b);

	}

	public void alltype()

	{
		int a = 10;
		int b = 20;

		if (a > b) {

			System.out.println(a);
		}

		if (a > b) {
			System.out.println("big");

		} else {
			System.out.println("small");
		}

		String[] strArr = { "abc", "bcd" };

		boolean bs = false;

		if (strArr != null) {

			bs = true;

			System.out.println(" Status  " + bs);

		} else {

			System.out.println(bs);

		}
		/*
		 * if (strArr == null) {
		 * 
		 * System.out.println("print"); }
		 */
		String[] arr = { "abc", "bcd" };

		// for each loop

		for (String str : arr) {

		}

		// iterate over index
		for (int i = 0; i < arr.length; i++) {
			String s = arr[i];

		}

		/*
		 * for (int i = 0; i < args.length; i++) { String string = args[i];
		 * 
		 * }
		 */

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (Map.Entry<String, Integer> entry : map.entrySet()) {

			String key = entry.getKey();

			Integer val = entry.getValue();

		}

		for (int i = 0; i < arr.length; i++) {
			String string = arr[i];

		}

		String[] array = { "ajs", "ahjdf" };

		List<String> list = new ArrayList<>();

		Iterator itr = list.iterator();

		/*
		 * Collection< String> collection = null ;
		 * 
		 * for (Iterator iterator = collection.iterator(); iterator.hasNext();)
		 * 
		 * { Object type = (Object) iterator.next();
		 * 
		 * }
		 */

	}

	public void a()

	{
		int a = 10;
		int b = 20;

		switch (a) {
		case 10:

			break;

		default:
			break;
		}

	}

}
