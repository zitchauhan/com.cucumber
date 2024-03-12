import java.util.ArrayList;
import java.util.List;

public class TestingMaster

{
	public static void main(String[] args) {
		listOFList();
	}

	private static void listOFList() {
		List<List<Integer>> list = new ArrayList<List<Integer>>();

		List<Integer> list0 = new ArrayList<Integer>();
		list0.add(0);
		list0.add(1);

		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(0);
		list1.add(1);
		list1.add(2);

		list.add(list0);
		list.add(list1);

		for ( List<Integer> lists : list )
			
		{	System.out.println(list  + " first list");
			break;
					
		}
		
		for (int i = 0; i < list.size(); i++)

		{

			System.out.println(list.get(i));
			
			/*
			 * List<Integer> inte = list.get(i); System.out.println(list.get(i));
			 */ 
		}

	}

	public static void al() {

		List<String> al = new ArrayList<>();
		al.add("abc");
		al.add("bcd");
		al.add("acd");

		System.out.println(al);

		for (String s : al) {

			System.out.println(s);
		}

		for (int i = 0; i < al.size(); i++) {

			String s = al.get(i);
			System.out.println(s);
		}

	}

	void twoDArr()

	{
		// int[][] arr = new int[2][3];

		int[][] arr = {

				{ 1, 2, 3 }, { 4, 5, 6 }

		};

		int[][] newArr = new int[2][4];
		// System.out.println(arr.length);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				// =arr[i][j];
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}
