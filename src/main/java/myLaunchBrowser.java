import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class myLaunchBrowser

{
@Test
	public static void main( ) 

	{
	
		WebDriverManager.chromedriver().setup();
		
			WebDriver driver = new ChromeDriver();
		
			driver.manage().window().maximize();
			//driver.manage().window().fullscreen();
			driver.manage().window().getSize();
			driver.get("https://www.google.com");
			driver.getTitle();
			String expected = driver.getTitle();
			String actual = "Google";
			Assert.assertEquals(actual , expected);
			
			
			
	
	}
}