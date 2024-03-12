package Auatomation;


import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class myAuto {

	static WebElement ele;
	static WebDriverWait wait;
	static WebDriverWait wait1;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();


		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		wait = new WebDriverWait(driver, Duration.ofSeconds(50));

		driver.get("https://www.makemytrip.com/");
////span[normalize-space()='25']
		
		////div[@class='fsw ']/child::div[1]/child::div[3]
		ele = driver.findElement(By.xpath("//div[@class='fsw ']/child::div[1]/child::div[3]"));

		wait.until(ExpectedConditions.visibilityOf(ele));

		ele.click();

		Thread.sleep(3000);
		//Timeouts t6 = driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(299));
		//System.out.println(t6);

		List <WebElement> allRang = driver.findElements(By.xpath("//div[@class='DayPicker-Months']/child::div/following-sibling::div/child::div/following-sibling::div[@class='DayPicker-Body']"));
		wait.until(ExpectedConditions.visibilityOf(ele));
		
		for ( WebElement dat : allRang)
		{
			String ss = dat.getText();
			System.out.println(ss);
			
		}
		
		
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));


		Thread.sleep(3000);
		ele = driver.findElement(By.xpath("//a[contains(text() ,'Search')]"));

		wait.until(ExpectedConditions.visibilityOf(ele));

		ele.click();
		
		

		ele = driver.findElement(By.xpath("//button[contains(text(),'OKAY, GOT IT!')]"));
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.click();

		// { //body//div//button[3]}

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
