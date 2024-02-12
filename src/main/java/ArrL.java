import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrL {
	public static void main(String[] arg)

	{
		// StrArray();
		listPrint();
	}

	public static void StrArray()

	{

		String[] arr = { "apple", "banana", "orange", "grape" };

		for (int i = 0; i < arr.length; i++)

		{
			System.out.print(i + " ");
			System.out.println(arr[i]);
		}

	}

	public static void listPrint() {

		List list = new ArrayList();

		list.add("Apple");
		list.add(2);

		System.out.println(list);

	}
	
	private void iterator() {

		List <Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		System.out.println(list);

		  Iterator itr  =   list.iterator() ; 

		while ( itr.hasNext()) 
		{
			itr.next();
			
			System.out.println( itr.next());
		}

	}
	
	
}
