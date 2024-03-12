import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class Filess {

	public static void main(String[] args) {
		
		
			File file  = new File("");
			
			
			
			try 
			{
				FileInputStream fis  = new FileInputStream(file);
			
			} 
				catch (FileNotFoundException e) 
			{
				
				e.printStackTrace();
			}
			System.out.println("jj");

	}
}
