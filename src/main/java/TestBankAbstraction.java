import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

abstract class Bank {

	abstract int getRateOfInterest();

	public static void main(String[] args) throws AWTException {


		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(null);
		driver.navigate().to("");
		driver.findElement(null); // find the first maching element and retuner ( WebElement)
		driver.findElements(null); // lsit all the maiching ele the List<WebElemnet> list = driver.fin

		driver.close();
		driver.quit();
		
		Actions actions  = new Actions(driver);
		actions.scrollToElement(null);
		actions.sendKeys("");
		actions.doubleClick();
		actions.click();
		actions.clickAndHold();
		actions.keyDown(null);
		actions.dragAndDrop( null, null);  //( WebLement souce , destination);
		
		Robot robot = new Robot();
		
		Action ac ;
		
		WebElement ele = driver.findElement(By.xpath(""));
		JavascriptExecutor js  = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true);" , ele);
		
		
		// frram code 
		
		driver.switchTo().frame(0);  // by index 
		driver.switchTo().frame(" "); // fram name
	//	driver.switchTo().frame(WebElement eled);
		
		// alter 
		
		driver.switchTo().alert().dismiss();
		
		driver.switchTo().alert().sendKeys(null);
		
		driver.switchTo().alert().dismiss();
		
	//
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));
	WebDriverWait wait  = new WebDriverWait( driver , Duration.ofSeconds(6));
	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(null)));

// quiit every assoiate browser with driver session
	
	File f  = new File(" ");
	f.getAbsolutePath();
	}

}

class SBI extends Bank {

	int getRateOfInterest() {

		return 7;
	}
}

class PNB extends Bank {
	int getRateOfInterest() {
		return 8;
	}
}

public class TestBankAbstraction {

	public static void main(String args[]) {

		Bank b; // taken reference of abstract class as Bank b;

		b = new SBI(); // Instantiating class SBI with the reference of abstract class

		System.out.println("Rate of Interest is: " + b.getRateOfInterest() + " %");

		b = new PNB(); // Instantiating class PNB with the reference of abstract Bank class

		System.out.println("Rate of Interest is: " + b.getRateOfInterest() + " %");
	}
}