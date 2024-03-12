package Auatomation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AS {

	static WebElement ele;
	static WebDriverWait wait;

	@Test(enabled = true)
	// @Test
	public static void main() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		wait = new WebDriverWait(driver, Duration.ofSeconds(40));

		driver.get("https://iapw-acf-d-qa1-ax360-1000.web.app/en/");

		ele = driver.findElement(By.xpath("//a[contains(text()  ,'Login using email & password')]"));
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		ele = driver.findElement(By.xpath("//input[@id = 'username']"));
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.sendKeys("qtester@mvp.com");

		ele = driver.findElement(By.xpath("//input[@id = 'password']"));
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.sendKeys("qtester");

		ele = driver.findElement(By.xpath("//button[contains(text()  ,'Sign In')]"));
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.click();

		ele = driver.findElement(By.xpath("//p[contains(text()  ,'Notifications')]"));
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.click();

		System.out.println("click on notification");

		ele = driver.findElement(By.xpath("//p[contains(text()  ,'Clients')]"));
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.click();
		System.out.println("click on clients");

		List<WebElement> ele = driver.findElements(By.tagName("iframe"));
		System.out.println("Number of frames in a page :" + ele.size());
		for (WebElement el : ele) {
			// Returns the Id of a frame.
			System.out.println("Frame Id :" + el.getAttribute("id"));
			// Returns the Name of a frame.
			System.out.println("Frame name :" + el.getAttribute("name"));
		}

		/*
		 * int count = 1;
		 * 
		 * WebElement iframeElement = driver.findElement(By.tagName("iframe"));
		 * wait.until(ExpectedConditions.visibilityOf(iframeElement));
		 * driver.switchTo().frame(iframeElement);
		 * 
		 * // Assume driver is initialized properly.
		 * 
		 * 
		 * System.out.println("Switching to Ifram"); String url =
		 * driver.getCurrentUrl(); String str = "(//div[@class='looker-cell']//a)[ "+
		 * count +" ]";
		 * 
		 * 
		 * WebElement allclient = driver.findElement(By.xpath(str));
		 * wait.until(ExpectedConditions.visibilityOf(allclient));
		 * 
		 * allclient.click();
		 * 
		 * count++ ;
		 * 
		 * driver.get(url);
		 * 
		 * WebElement iframeElement11 = driver.findElement(By.tagName("iframe"));
		 * wait.until(ExpectedConditions.visibilityOf(iframeElement11));
		 * driver.switchTo().frame(iframeElement11);
		 * 
		 * 
		 * String str1 = "(//div[@class='looker-cell']//a)[2]"; WebElement allclient1 =
		 * driver.findElement(By.xpath((str1)));
		 * wait.until(ExpectedConditions.visibilityOf(allclient1)); allclient1.click();
		 */
		
		
		 
		
		  List<WebElement> clientElements = driver.findElements(By.xpath("//div[@class='looker-cell']//a")); 
		  
		  for (WebElement wb : clientElements)
		  
		  { 
			  String url =driver.getCurrentUrl(); 
			  WebElement s = wb; 
			  String newele = s.toString(); 
			  System.out.println(s);
			  driver.findElement(By.xpath(newele)).click();
		  
		  }
		 

		/*
		 * List<WebElement> allclient =
		 * driver.findElements(By.xpath("//div[@class='looker-cell']//a"));
		 * wait.until(ExpectedConditions.visibilityOfAllElements(allclient)); for
		 * (WebElement element : allclient)
		 * 
		 * { String url = driver.getCurrentUrl();
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); WebElement
		 * allele = element; wait.until(ExpectedConditions.visibilityOf(allele));
		 * allele.click();
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 * System.out.println("click on back"); driver.get(url);
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); try {
		 * driver.switchTo().frame(iframeElement);
		 * 
		 * }catch(StaleElementReferenceException e) {} //driver.navigate().back();
		 * 
		 * /* JavascriptExecutor js = (JavascriptExecutor) driver;
		 * js.executeScript("history.back()");
		 */

		// System.out.println("swith to defaul");

		/*
		 * Actions actions = new Actions(driver);
		 * actions.sendKeys("Keys.BACK_SPACE").build().perform();
		 */

		/*
		 * new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.
		 * frameToBeAvailableAndSwitchToIt(By.tagName("iframe"))); WebElement
		 * iframeElementa = driver.findElement(By.tagName("iframe"));
		 * wait.until(ExpectedConditions.visibilityOf(iframeElementa));
		 * driver.switchTo().frame(iframeElement);
		 * 
		 * driver.switchTo().defaultContent();
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * String s = element.getAttribute("href");
		 * 
		 * System.out.println(s); // String url = driver.getCurrentUrl();
		 * element.click(); driver.switchTo().defaultContent();
		 * System.out.println("clicked"); ele =
		 * driver.findElement(By.xpath("//p[contains(text()  ,'Clients')]"));
		 * wait.until(ExpectedConditions.visibilityOf(ele)); ele.click();
		 * 
		 * System.out.println("click on client");
		 * 
		 * 
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); for
		 * (int i = 0; i < 3; i++) { try {
		 * wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iframeElement))
		 * ; break; // Exit the loop if switching to the frame is successful } catch
		 * (WebDriverException e) { // Handle the exception or log the error
		 * System.out.println("Failed to switch to frame. Retrying...");
		 * Thread.sleep(1000); // Wait for 1 second before retrying }
		 * 
		 * 
		 */

		// driver.navigate().to(url);

	}

}
