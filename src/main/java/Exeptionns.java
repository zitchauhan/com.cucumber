import java.io.*;

public class Exeptionns {

	public static void main(String[] args) throws ClassNotFoundException{

		try {
			File file = new File("");
		} finally {

		}
		
		
		try {
		    // Code that may throw InterruptedException
		    Thread.sleep(1000);
		} catch (InterruptedException e) {
		    // Handle the interruption gracefully
		    Thread.currentThread().interrupt(); // Restore the interrupted status
		    // Optionally, perform cleanup or handle the interruption
		    System.out.println("Thread was interrupted while sleeping");
		}

		
	}

	private static void exception() throws IOException {

		int i = 10;

		int j = 0;

		try {

			int result = i / j;

		} catch (StringIndexOutOfBoundsException e)

		{
			e.printStackTrace();

		} catch (ArrayIndexOutOfBoundsException e)

		{
			e.printStackTrace();

		} catch (IndexOutOfBoundsException e)

		{
			e.printStackTrace();

		} catch (ArithmeticException e)

		{
			e.printStackTrace();

		} catch (NullPointerException e)

		{
			e.printStackTrace();

		} catch (IllegalArgumentException e)

		{
			e.printStackTrace();

		}

		catch (RuntimeException e)

		{
			e.printStackTrace();

		} finally {

			System.out.println(" completed excution");
		}

	}

}
