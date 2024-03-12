import java.util.Scanner;

public class StringSplitFunction {

	public static void main(String[] args) {
		//scnner();
		System.out.println(factorial(5));
		
		String str = "this is my country";

		String[] arr = str.split(" ");

		for (int i = 0; i < arr.length; i++) 
			
		{

			String word = arr[i];
			
			String rev = "";

					for (int j = word.length() - 1; j >= 0; j--) 
			
						{
							rev  = rev + word.charAt(j);
		
						}
					
			rev =	rev.toUpperCase();
			
			System.out.print(rev + " ");
		}
	}
	
	public void stingBuilderExample () 
	
	{
		
		StringBuilder sb = new StringBuilder();
		
		
	    	sb.append("Hello");
	    	sb.append("World");
	    	
	    	StringBuilder sb1 = sb;
	    	
	    	System.out.println(sb1);
	    	
	}
	
	
	private static void scnner() {

		Scanner sc = new Scanner(System.in);
		
		sc.next();
	String s = 	sc.nextLine();
	
	System.out.println(s);
		

	}
	
	
	private static int factorial(int n) 
	{
		
		if ( n ==0 ) 
		{
			return 1;
		}
		else
		
		return n * factorial(n -1);
	
	}
	
	private static  boolean  primeCheck(int n) {
		
			if ( n <=1 ) 
			{
				
			 return false;
			}
			
			for(  int i =2 ; i <= i/2 ; i++)
				
			{	if ( n % i == 0 )
				{
					
					return false;
				}
			}
		return true;



	}
	
	public static void Jk()
	
	{
	
			
			
			
		
		
	}
	
}
