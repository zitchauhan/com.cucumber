import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class length_and {

	public static void main(String[] args) {
		String s = new String();
		
	WebDriver driver = null;
	WebElement webElement = null  ; 
	//webElement.getScreenshotAs(OutputType.FILE));
	Actions actions = new Actions(driver);
	
			actions.click();
			actions.clickAndHold();
			actions.contextClick();
			actions.doubleClick();
			actions.dragAndDrop(webElement, webElement);
			actions.keyDown(s);
			actions.keyUp(s);
			actions.moveToElement(webElement);
			actions.pause(null);
			actions.perform();
			actions.release();
			actions.scrollToElement(webElement);
			actions.sendKeys(webElement, args);
			
			
			
	
	String ssff = driver.getPageSource();
	driver.manage().deleteAllCookies();
	driver.findElements(By.id(s));
String sq = 	driver.getWindowHandle();
Set<String>	ssd =driver.getWindowHandles();



		
		for(int i = 0 ; i < s.length() ;i++)
		
		{
			
			
			
		}
		
		for (int i = 0; i < args.length; i++) 
		{
			
		}
	}
}
