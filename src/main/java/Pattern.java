import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pattern

{
	public static void main(String[] args) {
		System.out.println("Pttern10");
		samplePattern10();
		System.out.println("Pttern9");
		samplePattern9();
		System.out.println("Pttern8");
		samplePattern8();
		System.out.println("Pttern7");
		samplePattern7();
		System.out.println("Pttern6");
		samplePattern6();
		System.out.println("Pttern5");
		samplePattern5();
		System.out.println("Pttern4");
		samplePattern4();
		System.out.println("Pttern3");
		samplePattern3();
		System.out.println("Pttern2");
		samplePattern2();
		System.out.println("Pttern1");
		samplePattern1();
		System.out.println("Pttern0");

	}
	
	public static void samplePattern10() {

		List<Character> char_list  = new ArrayList<Character>() ;
		List<Integer> int_list  = new ArrayList<Integer>() ;
		List<String> str_list  = new ArrayList<String>() ;
		
		WebDriver driver ; 
		WebDriverManager.chromedriver().setup();
		
			
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.print("*");
			}
			
			 
			System.out.println();
		}

	}
	
	public static void samplePattern9() {

		for (int i = 1; i < 5; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.print("*");
			}
			
			 
			System.out.println();
		}

	}
	
	public static void samplePattern8() {

		for (int i = 1; i < 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			
			  for (int j = 5 - 1; j >= i; j--)
			  
			  { System.out.print("*"); }
			 
			System.out.println();
		}

	}

////

	public static void samplePattern7() {

		for (int i = 1; i < 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 5 - 1; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

//----------------------------------------------------
	public static void samplePattern6() {

		for (int i = 1; i < 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}

			
			  for (int j = 5-1; j >=i ; j--)
			  {
			  
			  System.out.print("*");
			  
			  }
			 

			System.out.println();
		}

	}

////
	public static void samplePattern5() {

		for (int i = 1; i < 5; i++)

		{
			for (int j = 5 - 1; j >= i; j--) {
				System.out.print(" ");

			}

			for (int k = 1; k <= i; k++)

			{

				System.out.print("* ");
			}
			System.out.println();

		}

	}

///------------------------

	public static void samplePattern4() {

		for (int i = 1; i < 5; i++)

		{
			for (int j = 5 - 1; j >= i; j--) {
				System.out.print(" ");

			}

			for (int k = 1; k <= i; k++)

			{

				System.out.print("*");
			}
			System.out.println();

		}

	}

//------------------

	public static void samplePattern3() {
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}

		for (int i = 1; i < 4; i++) {

			for (int j = 4 - 1; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	/*
	 * 
	 * |*| |*|*| | | |*|*|*| | |*|*|*|*| |*|*|*| | |*|*| | | |*| | | |
	 * 
	 */
//----------------------------------------------------
	public static void samplePattern2() {
		for (int i = 1; i < 5; i++) {
			for (int j = 5 - 1; j >= i; j--) {

				System.out.print("*");
			}
			System.out.println();
		}

	}

	/*
	 * 
	 * |*|*|*|*| |*|*|*| | |*|*| | | |*| | | |
	 * 
	 * 
	 */

///-------------------------
	public static void samplePattern1() {

		for (int i = 1; i < 5; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print("*");
			}
			System.out.println();
		}

	}

	public Matcher matcher(String text) {
		// TODO Auto-generated method stub
		return null;
	}

	public static Pattern compile(String pattern) {
		// TODO Auto-generated method stub
		return null;
	}

}