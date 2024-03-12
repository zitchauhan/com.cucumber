import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Modified {

	@Test
	private void testing() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nyse.com/ipo-center/recent-ipo");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Header h = new Header(driver);
		h.acceptCookies();
		h.scrolltill();
		String s = h.getHeaders();
		String [] arr = s.split(" ");
		  for ( int i = 0 ; i < arr.length ; i++)
		  {
			  Assert.assertEquals(arr[i], s.split(" ")[i]);
		  }
		//Assert.assertEquals(arr.equals("Price Date"), s);
		System.out.println(s);

	}

}

class Header

{
	String str = "table[@class ='table-data w-full table-border-rows']/following::tr";

	WebDriver driver;

	public Header(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//table[@class ='table-data w-full table-border-rows']/following::tr/child::th")
	private List<WebElement> headerAttibutes; 

	public String getHeaders() {

		String strr = " ";

		for( int i = 0 ; i< headerAttibutes.size() ; i++ ) 
			{
			
				 headerAttibutes.get(i).getText();
			}
		
		
		for (WebElement ele : headerAttibutes) {
			 strr =  ele.getText();

				
			System.out.println(strr);
			// strbuilder.append(ele.getText()).append(" ");

		}
		return strr.trim();

	}
	
	//-------

	@FindBy(xpath = "//button[contains(text() ,'Accept All Cookies')]")
	private WebElement acceptCookies;

	public void acceptCookies() {
		acceptCookies.click();
	}
	//// button[contains(text() ,'Accept All Cookies')]

	
	
	//========
	@FindBy(xpath = "//*[text()='Largest 10 IPOs in the Last']")
	private WebElement scroll;

	public void scrolltill() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", scroll);
		// js.executeScript("arguments[0].scrollIntoView(true);", element);
		//Thread.sleep(500);
		String text = scroll.getText();
		System.out.println(text);
	}

}
