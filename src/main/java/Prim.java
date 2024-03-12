public class Prim
{
	public static void main(String[] args) 
	{
		int num = 4 ; 
		int temp = 0 ; 
		for ( int i = 2 ; i <= num/2 ; i++)
		{
			if (num%i == 0)
				{
					temp++;
					break;
				}
		}
		if (temp==0 && num!=0)
				{
					System.out.println(num + "  prime");
				}
		else 
			{
				System.out.println(num  + "  is not prime");
			}
	}	
}
