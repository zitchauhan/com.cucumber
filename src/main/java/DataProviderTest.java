import java.beans.Visibility;
import java.sql.Time;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderTest {
// this will take data from dataprovider which we created
	@Test(dataProvider = "testdata")
	public void TestChrome(String uname, String password) {
		// System.setProperty("webdriver.chrome.driver", "Path of the driver");
		// WebDriver driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
// Maximize browser
		driver.manage().window().maximize();
// Load application
		driver.get("https://twitter.com/i/flow/login");
// clear email field
		/*
		 * long start = System.currentTimeMillis(); System.out.println(start);
		 * 
		 * //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 * 
		 * long end = System.currentTimeMillis(); System.out.println(end);
		 * 
		 * System.out.println(end - start);
		 */
		long start = System.currentTimeMillis();
		long inSec_Strat = TimeUnit.MICROSECONDS.toSeconds(start);
		System.out.println(inSec_Strat);
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		long end = System.currentTimeMillis();
		long inSec_end = TimeUnit.MICROSECONDS.toSeconds(end);
		System.out.println(inSec_end);
		
		System.out.println(inSec_end - inSec_Strat);
		
		

		driver.findElement(By.xpath("//input[@name='text']")).clear();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='text']"))).clear();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='text']"))).sendKeys(uname);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Next')]"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='text']")))
				.sendKeys("8103105017");

		// span[contains(text(),'Next')]
// Enter username
		// driver.findElement(By.xpath("//input[@name='text']")).sendKeys(uname);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Next')]"))).click();

		// long start3 = System.currentTimeMillis();
		// long start_inSec = TimeUnit.MICROSECONDS.toSeconds(start3);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']"))).clear();

		// long end3 = System.currentTimeMillis();

		// long end3_inSec = TimeUnit.MICROSECONDS.toSeconds(end3);

		// System.out.println(end1_inSec - start_inSec);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")))
				.sendKeys(password);
		// driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		//
// Clear password field
		// driver.findElement(By.xpath("//input[@name='password']")).clear();
// Enter password
		// driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);

		driver.quit();
	}

	@DataProvider(name = "testdata")

	public Object[][] TestDataFeed() {

// Create object array with 2 rows and 2 column- first parameter is row and second is //column
		Object[][] twitterdata = new Object[2][2];

// Enter data to row 0 column 0
		twitterdata[0][0] = "zitchauhan@gmail.com";
// Enter data to row 0 column 1
		twitterdata[0][1] = "Password36";
// Enter data to row 1 column 0
		twitterdata[1][0] = "zitchauhan@gmail.com";
// Enter data to row 1 column 0
		twitterdata[1][1] = "Password46";
// return arrayobject to testscript
		return twitterdata;
	}
}