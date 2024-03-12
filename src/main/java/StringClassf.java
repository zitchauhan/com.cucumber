
public class StringClassf {

	
	public static void main(String[] args) {
		
		int i = 10 ;
		
		String str1  = new String ("ABC");
		String str2 = "ABC";
		String str3 = "ABC";
		
		
		boolean status   =   str1 == str2 ;  // cheking ref value ;
		boolean status1  =   str2 == str3 ;
	
		System.out.println(status);
		System.out.println(status1);
		
		System.out.println("--------------------");
		// now check with .equalmethod
		
		boolean stat = str1.equals(str2);
			boolean stat1 =		str2.equals(str3);
		
			System.out.println(stat);
			System.out.println(stat1);
		
		//System.out.println(s);
	}
	
	
	
	
}
