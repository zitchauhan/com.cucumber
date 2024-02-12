package Selenium4;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandle {

	@Test
	private void handle() {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");
		
		WebElement ele = driver.findElement(By.xpath("//div[contains(text() ,'Services' )]"));
		ele.click();

		String parent = driver.getWindowHandle();
		System.out.println(parent);
		System.out.println("---------------- this is current window");//

		Set<String> childs = driver.getWindowHandles();
		System.out.println(childs);
		System.out.println("---------------- set of Windows as part of childs");

		Iterator<String> itr = childs.iterator();

		while (itr.hasNext()) {

			String childwindows = itr.next();

			System.out.println(childwindows + "\n"+"These are list of childs  -----------");

			if (!parent.equals(childwindows)) {

				String titile = driver.switchTo().window(childwindows).getTitle();

				System.out.println(titile);
				System.out.println("----------------child window title");

				driver.close();
				System.out.println("child window  closed ");

			}
			
			System.out.println("switchdd to paratnt");
			String titileParent=  	driver.switchTo().window(parent).getTitle();
			System.out.println(titileParent);
			//System.out.println("---------------- switched to parent");
		}

	}

}
