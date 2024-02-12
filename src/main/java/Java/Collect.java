package Java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class Collect {
	 private static final Logger LOGGER = Logger.getLogger(Collect.class);
	 
	 
	public static void main(String[] args) throws Exception

	{
		testName();
		

	}

	public static void listOfList(List<List<String>> list)

	{

	}

	public static void ListofMap(List<Map<String, String>> map)

	{

	}

	public static void MapofString(Map<String, String> mapofStr)

	{

	}

	public static void MapOfStrig_ListofString(Map<String, List<String>> mapOfStringKeyandListasValue)

	{

	}
	
     @Test(threadPoolSize = 100 )
	public  static void testName() throws Exception {
    	 
    	 Map<String , String > map  = new HashMap<String, String>();
    	 map.put("UserName", "Password");
    	String s =  map.get(map);
    	System.out.println(s);
		
    	
    	List<Map<String , String>> listmap= new ArrayList<Map<String,String>>();
    	  for (Map<String, String> form : listmap) {
    		  
    		  
    		 form.get(listmap);
    	  }

    		  
    	
     
     }
     
}
