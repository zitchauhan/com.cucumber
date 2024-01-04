
public class TestClass {
	
	
	
	
	public static void main(String[] args) {
		int [] arr = { 1, 2, 3 , 4 , 5, 6 , 7 , 8 , 9 , 10 };
		
		// print all the prime number  
		// output is an arrya as of prime nunbe
		

		System.out.println( arr[0]);
	//	System.out.println( arr[1]);
		
		int  num = arr.length;
		int temp = 0 ; 
		// to print the prime number we can take statring from 2 index 
		
		for ( int i = 1 ; i < arr.length -1 ; i ++ ) {
			
			// we can take the value of array and take a riminder for getting nthe array  
			
			if ( num  % 1 == 0  ) {
				
				temp = temp + 1 ; 
			}
			
			if ( temp> 0 ) {
				
				System.out.println(" " );
			}
	}

	} 
	

}