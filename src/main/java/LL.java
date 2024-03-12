import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.common.collect.Tables;

import io.cucumber.datatable.DataTable;

public class LL

{
	
	 private void applyDataToTextField(String name, String empno, String salary) {}
	
	public void m1(DataTable table)
	{
		
		Map<String , String > 		map = table.asMap();

		
		List<Map<String, String >> list = table.asMaps();
		
		for (Map<String, String> map21 : list) 
		
		{
			 String ss = map21.get("A");
		}
		
		
			 	
		List<String> listString  = table.asList();		
		List<List<String>> lol 	 = table.asLists();
		
		for (List<String> row : lol) {
			
			String s =   row.get(0);
			String s2  = row.get(1);
			
		}
		
		
		
	}
	
	

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("A");
		list.add("B");
		list.add("C");
		String ss = " ";

		for (int i = 0; i < list.size(); i++) {

			ss = ss + list.get(i) + " ";
		}
		// String s = list.get(1);

		//System.out.println(ss);

		List<Map<String, String>> listMap = new ArrayList<Map<String, String>>();

		Map<String, String> map1 = new HashMap<String, String>();
		map1.put("A", "A");
		map1.put("B", "B");
		map1.put("C", "C");

		listMap.add(map1);

		Map<String, String> map2 = new HashMap<String, String>();
		map1.put("A1", "A1");
		map1.put("B1", "B1");
		map1.put("C1", "C1");

		listMap.add(map2);
		for (int i = 0; i < listMap.size(); i++)

		{
				 Map<String , String > m =  listMap.get(i);
				 
				 System.out.println(m);
		}

	}


}


class LLk

{
	

				

}
