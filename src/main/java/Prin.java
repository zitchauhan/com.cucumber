import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Prin {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.get("https://www.google.com");
		driver.navigate().to("https://www.google.com");

		driver.findElement(By.xpath("//a[contains(text() ," + " 'Gmail') ]")).click();
		String s = driver.getCurrentUrl();

		driver.navigate().to(s);

		try {
			driver.switchTo().alert().accept();
			driver.switchTo().alert().dismiss();
			driver.switchTo().alert().sendKeys("value");
		}

		catch (NoAlertPresentException e)

		{
			System.out.println("Handles exception");
		}

		driver.navigate().to("https://www.google.co.in/");

		WebElement search = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));

		WebElement button = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));

		Actions actions = new Actions(driver);

		actions.moveToElement(search)
		.click()
		.sendKeys("apple")
		.keyDown(Keys.SHIFT)
		.sendKeys("android").keyUp(Keys.SHIFT).perform();
		
		
		/*
		 * actions.moveToElement(button).build().perform();
		 * //actions.scrollByAmount(120, 400); actions.doubleClick();
		 * 
		 * 
		 * boolean b = button.isDisplayed(); String sa =button.getTagName();
		 * System.out.println(b + " " + sa);
		 * 
		 * System.out.println(s);
		 */

		System.out.print("/");
		System.out.print("\\");

		System.out.print("\n");

		System.out.print("\\");
		System.out.print("/");
		// driver.close();
	}
}
