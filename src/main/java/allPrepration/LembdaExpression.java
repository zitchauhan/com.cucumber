package allPrepration;

public class LembdaExpression {
	
	public static void main ( String [] args ) 
	{
		// to find the dulicate 0= 0+1 
		
		StringBuilder sb  = new StringBuilder() ;
	
		
		String[] str_arr = {"bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"};
		
		sb.append(str_arr);
		
		for ( int i = 0 ; i < str_arr.length ; i++)
		{
		
			for ( int j = 0 ; j < str_arr.length -1 ; j++) 
			{
			
				if ( str_arr[j] == str_arr[j+1] ) 
					
					{
						
						System.out.println(str_arr[j]);
					}
			
			}
		}
		
	}

}
