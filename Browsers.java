import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Browsers {

	public static void main(String[] args) {

//initializeBrowser("safari");

	}

	static WebDriver driver = null;

	public static WebDriver initializeBrowser(String browserName) {

		if (browserName.equals("chrome")) {

			driver = new ChromeDriver();

		} else if (browserName.equals("firefox")) {

			driver = new FirefoxDriver();

		} else if (browserName.equals("edge")) {

			driver = new EdgeDriver();

		} else if (browserName.equals("safari")) {

			driver = new SafariDriver();

		}

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		return driver;

	}

	public static WebDriver getDriver() throws IOException
	{

		TakesScreenshot tss = ((TakesScreenshot) driver);

		File source = tss.getScreenshotAs(OutputType.FILE);
		File destination = new File("Destinati patj");

		FileUtils.copyFile(source, destination);
		
		return driver;

	}
	
	private void upload() {
			File file  = new File(" ");
			WebElement ele  = driver.findElement(By.xpath("c"));
			  ele.sendKeys(file.getAbsolutePath());
			  driver.findElement(By.id("")).click();

	}

}
