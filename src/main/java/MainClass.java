
class MyExeption extends Exception

{
		
		public MyExeption(String s)
	{
		super(s);
	}

}

public class MainClass

{

	public static void main(String[] args) {

		try 
		{

			throw new MyExeption("custom exeption");
		
		} catch (MyExeption e)

		{
			System.out.println("caught");
		}

	}
}