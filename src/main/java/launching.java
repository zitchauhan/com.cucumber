import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class launching {

	@Test
	void launchAnOption()

	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		System.out.println(driver.getTitle());

		WebElement services = driver.findElement(By.xpath("//div[text()='Services']"));
		services.click();

		String expted = "Resume Writing Services - CV - Bio data - Naukri.com";

		String parent = driver.getWindowHandle();
		Set<String> childs = driver.getWindowHandles();
		Iterator<String> itr = childs.iterator();
		while (itr.hasNext()) {
			String child_Window = itr.next();
			if (!parent.equals(child_Window)) {
				driver.switchTo().window(child_Window);
				// System.out.println(driver.getTitle());
				String childTitile = driver.getTitle();

				
			//	SoftAssert 
				Assert.assertEquals(childTitile, expted);
				
				driver.close();

				driver.switchTo().window(parent);
				System.out.println(driver.getTitle());
				// driver.close();
			}

		}
		WebElement txtUsername = driver.findElement(By.xpath("//div[text()='Services']"));
		
		Actions builder = new Actions(driver);
		Action seriesOfActions = builder
		        .moveToElement(txtUsername)
		        .click()
		        .keyDown(txtUsername, Keys.SHIFT)
		        .sendKeys(txtUsername, "hello") // Corrected the syntax error here
		        .keyUp(txtUsername, Keys.SHIFT)
		        .doubleClick(txtUsername)
		        .contextClick()
		        .build();

		seriesOfActions.perform();
	
	}
}
