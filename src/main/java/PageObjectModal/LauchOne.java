package PageObjectModal;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.List;
public class LauchOne 

{	
	private static final Logger logger = LogManager.getLogger(LauchOne.class);

	
	@Test
		public static void LauchMyDriver()
		{
		//logger.debug("Debug message");
     //   logger.info("Info message");
       // logger.warn("Warning message");
       // logger.error("Error message");
      //  logger.fatal("Fatal message");
		
			WebDriver driver = new ChromeDriver();
		    logger.info("lauunch browser");
			driver.manage().window().maximize();
			driver.get("https://www.google.com");
			String str1 = driver.getCurrentUrl();
			//String str = driver.getPageSource();
			System.out.println(str1);
			
			WebElement ele = driver.findElement(By.xpath("//textarea[@name='q']"));
			//ele.clear();
			ele.sendKeys("Testing");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			List<WebElement> list = driver.findElements(By.xpath("//div[@class='wM6W7d']/span[contains(text(),'test')]"));
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			for ( WebElement el : list)
			{
				String text = el.getText();
				System.out.println(text);
				
			}
			
			
			/*
			 * String element = ""; for(int i = 0 ; i <list.size() ; i++)
			 * 
			 * { element = list.get(i).getText();
			 * 
			 * 
			 * } System.out.println(element);
			 */
			
			
			
			
		}
}