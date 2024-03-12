import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ABX {

	static WebElement ele;
	static WebDriverWait wait;
	static WebDriverWait wait1;

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		//driver.


		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		wait = new WebDriverWait(driver, Duration.ofSeconds(50));

		driver.get("https://iapw-acf-d-qa1-ax360-1000.web.app/en/");

		ele = driver.findElement(By.xpath("//a[contains(text()  ,'Login using email & password')]"));

		wait.until(ExpectedConditions.visibilityOf(ele));

		ele.click();

		Thread.sleep(3000);
		Timeouts t6 = driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(299));
		System.out.println(t6);

		ele = driver.findElement(By.xpath("//input[@id = 'username']"));
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.sendKeys("qtester@mvp.com");

		Thread.sleep(3000);
		ele = driver.findElement(By.xpath("//input[@id = 'password']"));

		wait.until(ExpectedConditions.visibilityOf(ele));

		ele.sendKeys("qtester");

		Thread.sleep(3000);
		ele = driver.findElement(By.xpath("//button[contains(text()  ,'Sign In')]"));

		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.click();

		// { //body//div//button[3]}

		Timeouts t = driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(299));
		System.out.println(t);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		String s = driver.findElement(By.xpath("//h1[contains(text(),'My Client List')]")).getText();
		System.out.println(s);

		String actual = "Clients";
		String expected = driver.getTitle();
		Assert.assertEquals(expected, actual);
		// Assert.assertEquals(false, null)

		wait1 = new WebDriverWait(driver, Duration.ofSeconds(100));

		ele = driver.findElement(By.xpath("//*[@id='__next']/main/aside/nav/ul/button[5]"));
		wait1.until(ExpectedConditions.elementToBeClickable(ele));

		ele.click();
		System.out.println("click on list ");
		Timeouts t1 = driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(299));
		System.out.println(t1);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		ele = driver.findElement(By.xpath(("//div[@class='flex gap-4 flex-wrap']/child::div[3]/child::div[2]")));
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		ele = driver.findElement(By.xpath("//div[@class='flex flex-col sm:flex-row overflow-auto h-full scrollbar']/child::div[2]/child::div/child::div[1]/child::button"));
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.click();
		System.out.println("click on drop down");
		

		// --- //div[@class='MuiYearCalendar-root css-1flha1h']
		
		List<WebElement> allYears = driver.findElements(By.xpath("//div[@class='MuiYearCalendar-root css-1flha1h']"));
		wait.until(ExpectedConditions.visibilityOfAllElements(allYears));
		
		for (WebElement el : allYears)
			
		{
			String yr = el.getText();
			System.out.println(yr);
		}
		
		WebElement ele  = driver.findElement(By.xpath(""));
		
		Select select  = new Select (ele) ;
			    select.selectByIndex(0);
				select.selectByValue(expected);
				select.selectByVisibleText(actual);
				
				
		
		Actions actions = new Actions(driver);
		
				actions.click()
				.doubleClick()
				.contextClick()
				.moveToElement(ele)
				.moveToElement(ele, 0, 0)
				.clickAndHold()
				.release()
				.keyDown(expected)
				.keyUp(expected)
				.sendKeys(args)
				.scrollToElement(ele)
				.build()
				.perform();
				
			driver.get(expected);	
			driver.getPageSource();
			driver.getCurrentUrl();
			driver.getWindowHandle();
			driver.getWindowHandles();
			driver.getTitle();
			driver.close();
			driver.quit();
			driver.findElement(null);
			driver.findElements(null);
			driver.switchTo();
			driver.navigate();
			driver.manage();
		
		WebElement scree = driver.findElement(By.xpath(""));
		
		// take screen shot
		File destFile = new File(expected);
		TakesScreenshot source = (TakesScreenshot)driver;
		File srcFile = source.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile ,destFile);
		
		// upload file 
		
		WebElement  element = driver.findElement(By.xpath(""));
		
		File 		file   = new File ("c://abc.img") ;
		
					element.sendKeys(file.getAbsolutePath());
					
		// 
					
		WebElement  elementss = driver.findElement(By.xpath(""));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));  // implicitylyWait 
		WebDriverWait wait  = new WebDriverWait(driver , Duration.ofSeconds(30));   // explicit wait
					  wait.until(ExpectedConditions.visibilityOf(elementss));
		
					  
					  
		// alert 
					  
					  
		 WebElement ment = driver.findElement(By.xpath(""));
		 
		 driver.switchTo().alert().accept();
		 driver.switchTo().alert().dismiss();
		 driver.switchTo().alert().sendKeys("");

		 driver.switchTo().alert().getText();

		 ///  Naviagtion
					  
		String A = "Https://www.google.com" ; 
		 
		 driver.navigate().refresh();
		 driver.navigate().to(A);
		 driver.navigate().to("");
		 driver.navigate().back();
		 
		
	
		
		
		
		
		/*
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50)); try {
		 * 
		 * ele = driver.findElement(By.
		 * xpath("(//div[@class='MuiPickersCalendarHeader-root css-1dozdou'])[2]"));
		 * 
		 * wait.until(ExpectedConditions.visibilityOf(ele));
		 * 
		 * } catch (StaleElementReferenceException e)
		 * 
		 * { e.printStackTrace(); } ele.click();
		 */

		// (//div[@class='MuiPickersCalendarHeader-root css-1dozdou'])[2]

		// //input[@id = 'password']

		// password

		// Sign In

		// //button[contains(text() ,'Sign In')]

		// p[contains(text() ,'Lists')]
		// Within 90 days

		// type="button"

	}

}
