package Auatomation;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.logging.Logs;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyAuatomation {

	static WebElement ele;
	static WebDriverWait wait;
	static WebDriverWait wait1;

	private final Color HEX_COLOUR = Color.fromString("#2F7ED8");
	private final Color RGB_COLOUR = Color.fromString("rgb(255, 255, 255)");
	// private final Color RGB_COLOUR = Color.fromString("rgb(40%, 20%, 40%)");
	private final Color RGBA_COLOUR = Color.fromString("rgba(255, 255, 255, 0.5)");
//	private final Color RGBA_COLOUR = Color.fromString("rgba(40%, 20%, 40%, 0.5)");
	private final Color HSL_COLOUR = Color.fromString("hsl(100, 0%, 50%)");
	private final Color HSLA_COLOUR = Color.fromString("hsla(100, 0%, 50%, 0.5)");
	private final Color BLACK = Color.fromString("black");
	private final Color RED = Color.fromString("red");
	private final Color HOTPINK = Color.fromString("hotpink");

	private final Color TRANSPARENT = Color.fromString("transparent");

	public static void verifyUrl(String url) {

		try {
			URL urls = new URL(url);

			/*
			 * here i have taken URLConnection referece to down cast with HttpURLConnection
			 */
			URLConnection con = urls.openConnection();

			HttpURLConnection httpURLConnection = (HttpURLConnection) con;

			// HttpURLConnection httpURLConnection = (HttpURLConnection)
			// urls.openConnection();
			int responce = httpURLConnection.getResponseCode();

			if (responce == 200) {
				System.out.println(url + "  --------!Valid URLs! " + httpURLConnection.getResponseMessage());

			} else {
				System.out.println(url + "  <broken URls > " + httpURLConnection.getResponseCode());

			}
			httpURLConnection.disconnect();

		} catch (MalformedURLException e)

		{
			System.out.println(url + "is broken");
			e.printStackTrace();

		} catch (IOException e) {
			System.out.println(url + "is broken");
			e.printStackTrace();
		}

	}

	@Test(enabled = false)
	public static void brokenLink()

	{

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		wait = new WebDriverWait(driver, Duration.ofSeconds(50));

		driver.get("https://iapw-acf-d-qa1-ax360-1000.web.app/en/");

		ele = driver.findElement(By.xpath("//a[contains(text()  ,'Login using email & password')]"));
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		ele = driver.findElement(By.xpath("//input[@id = 'username']"));
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.sendKeys("qtester@mvp.com");

		ele = driver.findElement(By.xpath("//input[@id = 'password']"));
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.sendKeys("qtester");

		ele = driver.findElement(By.xpath("//button[contains(text()  ,'Sign In')]"));
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.click();

		List<WebElement> link = driver.findElements(By.tagName("a"));
		for (WebElement links : link) {

			String url = links.getAttribute("href");
			verifyUrl(url);
			// System.out.println(url);

		}

		System.out.println("found all the urls");

		ele = driver.findElement(By.xpath("//button//p[contains(text(),'Notifications')]"));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		ele.click();

		ele = driver.findElement(By.xpath("//div[contains(text(),'RR Code')]"));
		wait.until(ExpectedConditions.visibilityOf(ele));
		JavascriptExecutor jss = (JavascriptExecutor) driver;
		jss.executeScript("arguments[0].scrollIntoView(true);", ele);

		WebElement element = driver.findElement(By.xpath("//button[@data-testid='search-field-icon']"));
		wait.until(ExpectedConditions.visibilityOf(element));
		String color = element.getCssValue("background-color");
		System.out.println(color + "rr");
		String cq = Color.fromString(color).asHex();
		System.out.println("Color is :" + cq);
		System.out.println("Hex code for color:" + cq);

		WebElement element1 = driver.findElement(By.cssSelector("img[alt='Flagged Icon(Red)']"));
		// obtain color in rgba
		String s = element1.getCssValue("color");
		// convert rgba to hex
		String c = Color.fromString(s).asHex();
		System.out.println("Color is :" + s);
		System.out.println("Hex code for color:" + c);

		// Color loginButtonColour =
		// Color.fromString(driver.findElement(By.id("login")).getCssValue("color"));

		Color loginButtonBackgroundColour = Color.fromString(
				driver.findElement(By.xpath("//img[@alt='Flagged Icon(Red)']")).getCssValue("background-color"));

		System.out.println(loginButtonBackgroundColour.getColor());

		//
		System.out.println("code fot highligh the element ");

		WebElement highlight = driver.findElement(By.xpath("//input[@data-testid='input-text']"));
		wait.until(ExpectedConditions.visibilityOf(highlight));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].style.border='2px solid red'", highlight);

		// assert loginButtonBackgroundColour.asHex().equals("#ff69b4");
		// assert loginButtonBackgroundColour.asRgba().equals("rgba(255, 105, 180, 1)");
		// assert loginButtonBackgroundColour.asRgb().equals("rgb(255, 105, 180)");

		// gethighlightElement("abc", ele, driver);

		String h1 = "arguments[0].style.border='2px solid red'";

		WebElement flaged = driver.findElement(By.xpath("//div[text() ='is any value']"));
		wait.until(ExpectedConditions.visibilityOf(flaged));
		gethighlightElement(driver, s, flaged);

		//// div[text() ='is any value']

	}

	public static void gethighlightElement(WebDriver driver, String s1, WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(s1, ele);
	}

	public static void locator(By by, String ele)

	{

	}

	public static void byElement(By by) {
		// by.locator(XPath);
	}

	public static WebElement webElement(WebElement ele, WebDriver driver) {
		ele = driver.findElement(By.xpath("//input[@data-testid='input-text']"));
		return ele;
	}

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

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		ele = driver.findElement(By.xpath("//input[@id = 'username']"));
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.sendKeys("qtester@mvp.com");

		ele = driver.findElement(By.xpath("//input[@id = 'password']"));
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.sendKeys("qtester");

		ele = driver.findElement(By.xpath("//button[contains(text()  ,'Sign In')]"));
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.click();

		// { //body//div//button[3]}

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		ele = driver.findElement(By.xpath("//h1[contains(text(),'My Client List')]"));
		wait.until(ExpectedConditions.visibilityOf(ele));
		String s = ele.getText();

		// System.out.println(s);

		String actual = "Clients";
		String expected = driver.getTitle();
		Assert.assertEquals(expected, actual);
		// Assert.assertEquals(false, null)

		wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
		ele = driver.findElement(By.xpath("//p[contains(text(),'Lists')]"));
		wait1.until(ExpectedConditions.elementToBeClickable(ele));
		ele.click();
		System.out.println("click on list ");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		ele = driver.findElement(By.xpath(("//div[@class='flex gap-4 flex-wrap']/child::div[3]/child::div[2]")));
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.click();
		System.out.println("click on kyc date");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		ele = driver.findElement(By.xpath(
				"//div[@class='flex flex-col sm:flex-row overflow-auto h-full scrollbar']/child::div[2]/child::div/child::div[1]/child::button"));
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.click();
		System.out.println("click on drop down");

		List<WebElement> allYears = driver.findElements(By.xpath("//div[@class='MuiPickersYear-root css-k9reix']"));
		wait.until(ExpectedConditions.visibilityOfAllElements(allYears));

		for (WebElement el : allYears) {

			try {
				String yr = el.getText();

				String[] arr = yr.split(" ");

				for (String ar : arr) {
					if (ar.equalsIgnoreCase("2031")) {
						el.click();
						System.out.println("click on 2031");
					}
				}
			} catch (StaleElementReferenceException e) {
				// driver.navigate().refresh();

			}

		}

		List<WebElement> dates = driver.findElements(By.xpath(
				"//div[@data-testid='kyc-duedate']/child::div[2]/child::div[2]/child::div/following-sibling::div/child::div/child::div/child::div/child::div/child::div/child::button"));
		wait.until(ExpectedConditions.visibilityOfAllElements(dates));

		for (WebElement allDate : dates)

		{
			System.out.println(allDate.getText());
			String listOfDate = allDate.getText();
			String[] dataarray = listOfDate.split(" ");

			for (String dat : dataarray) {

				if (dat.equalsIgnoreCase("26")) {

					allDate.click();
					System.out.println("click on 26");
				}
			}

		}

		System.out.println("click on update");

		ele = driver.findElement(By.xpath("//button[contains(text(),'Update')]"));

		wait.until(ExpectedConditions.visibilityOfAllElements(ele));
		ele.click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		try {

			List<WebElement> clientId = driver.findElements(By.xpath("//table/tbody/tr"));
			wait.until(ExpectedConditions.visibilityOfAllElements(clientId));

			int count = clientId.size();

			for (int i = 0; i < count; i++)

			{

				String idis = clientId.get(i).getText();
				System.out.println(idis);

				if (idis.equalsIgnoreCase(
						"23d8d73f8a32cd46e24ef916e15fae6c4d45d26a 474cdfd1358e2b0e386776ce6dfa48bc27484671"))

				{

					ele = clientId.get(i);

					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
					wait.until(ExpectedConditions.visibilityOf(ele));
					wait.until(ExpectedConditions.elementToBeClickable(ele));
					try {
						ele.click();
					} catch (ElementClickInterceptedException e) {
						e.printStackTrace();
					}

				}

			}

		} catch (StaleElementReferenceException e)

		{

			System.out.println("handlees statle refece exceptiom ");
		}

		System.out.println("click on id ");

		Logs l = driver.manage().logs();
		Set<String> set = l.getAvailableLogTypes();

		for (String loging : set) {
			System.out.println(loging);

		}
		WebElement table = driver.findElement(By.xpath(".//table"));

		// Locate all rows of the table
		List<WebElement> rows = table.findElements(By.xpath(".//tr"));

		// Specify the row and column index
		int rowIndex = 2;
		int colIndex = 3;

		// Locate the cell
		WebElement row = rows.get(rowIndex - 1); // Adjusting index to start from 0

		List<WebElement> cells = row.findElements(By.tagName("td"));
		WebElement cell = cells.get(colIndex - 1); // Adjusting index to start from 0

		// Get cell value
		String cellValue = cell.getText();
		System.out.println("Cell value: " + cellValue);

		List<WebElement> eled = driver.findElements(By.xpath("//tr/td/div/div/input[@type='checkbox']"));
		wait.until(ExpectedConditions.visibilityOfAllElements(ele));
		int size = eled.size();

		for (int i = 0; i < size; i++) {

			try {

				eled.get(i).click();

				if (!eled.get(i).isSelected())

				{
//				if ( !eled.get(i).isEnabled())
//					
//				{
//					eled.get(i).click();
//				}
//				
					// eled.get(i).click();

				}
			} catch (StaleElementReferenceException e) {
			}

		}
		System.out.println("check on all the check box");

		ele = driver.findElement(By.xpath("//button//p[contains(text(),'Notifications')]"));
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.click();

		List<WebElement> notification = driver.findElements(By
				.xpath("//img[@alt='Notification Icon']/parent::div/parent::div/parent::div/parent::div/parent::div"));
		wait.until(ExpectedConditions.visibilityOfAllElements(notification));

		for (int i = 0; i < notification.size(); i++)

		{
			String stt = notification.get(i).getText();
			System.out.println(stt);

		}
		System.out.println("thease are the dates in");

		ele = driver.findElement(By.xpath("//p[contains(text() , 'Lists')]"));
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.click();

		/// click on client name

		ele = driver.findElement(By.xpath("//button[@data-testid='client-name-btn']"));
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.click();

		// click on drop down
		ele = driver.findElement(By.xpath("//input[@id='autocomplete-options']"));
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.click();

		// Select select = new Select(ele);
		// select.selectByIndex(2);

		ele = driver.findElement(By.xpath("//button[@data-testid='client-name-btn']"));
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.click();

		System.out.println("scrrool dowun ");

		ele = driver.findElement(By.xpath("//p[contains(text(),'Contact Us')]"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", ele);

		System.out.println("scrrool up ");

		ele = driver.findElement(By.xpath("//h1[contains(text(),'Lists: KYC Review')]"));

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].scrollIntoView(true);", ele);

		System.out.println("scrolled till element argument[0].scrollToView(0,500) , ele");
		/*
		 * Actions action = new Actions(driver); action.moveToElement(ele).perform();
		 */
		/*
		 * WebElement ele =
		 * driver.findElement(By.xpath("//span[contains(text(),'KYC Due Date')]"));
		 * wait.until(ExpectedConditions.visibilityOf(ele)); ele.sendKeys(Keys.DOWN);
		 */
		// click on drop down

		driver.navigate().refresh();

		ele = driver.findElement(By.xpath("//button[@data-testid='client-name-btn']"));
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.click();

		ele = driver.findElement(By.xpath("//input[@id='autocomplete-options']"));
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.click();

		ele = driver.findElement(By.xpath("//input[@id='autocomplete-options']"));
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.clear();

		ele = driver.findElement(By.xpath("//input[@id='autocomplete-options']"));
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.sendKeys("starting with");

		ele = driver.findElement(By.xpath("//input[@id='multiple-limit-tags-clientName']"));
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.click();

		if (ele.isEnabled()) {
			List<WebElement> elle = driver.findElements(By.xpath("//input[@id='multiple-limit-tags-clientName']"));
			int sis = elle.size();
			System.out.println(sis);
			for (int i = 0; i < sis; i++) {
				elle.get(0)
						.sendKeys("5c87ad2ceff9ffe7a282156e1a58c21d9c479364 85e8451d61c611447e555448765548a9e06ccbd8");

			}
		}
		WebElement elles = driver.findElement(By.xpath("//input[@id='multiple-limit-tags-clientName']"));

		Actions actions = new Actions(driver);
		actions.click(elles).sendKeys(Keys.ENTER).build().perform();
		/*
		 * ele =
		 * driver.findElement(By.xpath("//input[@id='multiple-limit-tags-clientName']"))
		 * ; wait.until(ExpectedConditions.visibilityOf(ele)); ele.click() ;
		 */
		actions.sendKeys(Keys.ARROW_DOWN).build();

		// actions.contextClick(elles).build().perform();
		// actions.sendKeys(Keys.ARROW_DOWN).build().perform();

		// actions.sendKeys(Keys.ARROW_DOWN);
		String parent = driver.getWindowHandle();
		System.out.println(parent);

		System.out.println("========");

		ele = driver.findElement(By.xpath("//button//p[contains(text(),'Notifications')]"));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		ele.click();

		List<WebElement> checkbox = driver
				.findElements(By.xpath("//div[@class='w-full flex flex-row']/child::div/child::button"));
		wait.until(ExpectedConditions.visibilityOfAllElements(checkbox));

		for (WebElement check : checkbox) {

			boolean bb = check.isSelected();
			System.out.println(bb);

			if (bb == false)

			{
				check.click();
				System.out.println("checked");

			}
		}

		/*
		 * ele = driver.findElement(By.xpath("//div[contains(text(),'RR Code')]"));
		 * JavascriptExecutor jss = (JavascriptExecutor) driver;
		 * jss.executeScript("arguments[0].scrollIntoView(true);", ele);
		 */

		/*
		 * 
		 * WebElement element =
		 * driver.findElement(By.cssSelector("img[alt='Flagged Icon(Red)']")); String
		 * color = element.getCssValue("background-color"); System.out.println();
		 */

		System.out.println("checked ontclick on the c  ");

		ele = driver.findElement(By.xpath("(//p[contains(text(),'Clients')])[1]"));
		wait.until(ExpectedConditions.visibilityOfAllElements(ele));
		ele.click();

		System.out.println("swithc to the frame  the box  ");

		WebElement iframeElement = driver.findElement(By.tagName("iframe"));
		wait.until(ExpectedConditions.visibilityOf(iframeElement));
		driver.switchTo().frame(iframeElement);

		System.out.println("click on each client ");

		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		int count = 0;
		String curruntWin = driver.getWindowHandle();

		List<WebElement> elementsToClick = driver.findElements(By.xpath("//div[@class='looker-cell']//a"));
		for (int i = 0; i < elementsToClick.size(); i++)

		{
			WebElement ell = elementsToClick.get(i);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			
			String urlsss = ell.getAttribute("href");
			
			String url =driver.getCurrentUrl();
			
			if (url != null && !url.isEmpty()) {
                driver.switchTo().defaultContent(); // Switch back to the main content before opening a new tab
                openInNewTab(driver, url);
                // Switch back to the iframe for the next iteration
               // driver.switchTo().frame("iframe");
            }
		//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
		//	ell.click();
		//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			
			
			
		//	driver.switchTo().newWindow(WindowType.TAB);
			//driver.get(url);
			//driver.navigate().to(url);
			
			

		}

		/*
		 * 
		 * List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
		 * for (WebElement iframe : iframeElements) {
		 * System.out.println(iframe.getTagName()); } try { // Find and click elements
		 * within iframes List<WebElement> elementsToClick =
		 * driver.findElements(By.xpath("//div[@class='looker-cell']//a")); for
		 * (WebElement element : elementsToClick) {
		 * wait.until(ExpectedConditions.elementToBeClickable(element));
		 * element.click();
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //
		 * Implicit wait String currentUrl1 = driver.getCurrentUrl(); // Get the current
		 * URL System.out.println("get cuttrunt on the URL: " + currentUrl1);
		 * driver.navigate().to(currentUrl1); // Handle new windows Set<String>
		 * windowHandles = driver.getWindowHandles(); if (windowHandles.size() > 1) {
		 * for (String handle : windowHandles) { if
		 * (!handle.equals(driver.getWindowHandle())) {
		 * driver.switchTo().window(handle); break; } } }
		 * 
		 * // Handle iframes if (!driver.getWindowHandles().contains(iframeElement)) {
		 * driver.switchTo().parentFrame(); } } } finally { // Close the WebDriver
		 * 
		 * }
		 * 
		 */

	}
	
	 private static void openInNewTab(WebDriver driver, String url) {
	        String script = "window.open(arguments[0], '_blank');";
	        ((JavascriptExecutor) driver).executeScript(script, url);
	    }
	
	/*
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); //
		 * Initialize WebDriverWait
		 * 
		 * try { // Navigate to the webpage // Click on a notification in the main
		 * window clickOnNotification(driver, wait);
		 * 
		 * // Switch to the single iframe WebElement iframeElements =
		 * driver.findElement(By.tagName("iframe"));
		 * driver.switchTo().frame(iframeElements);
		 * 
		 * // Click on all elements inside the iframe clickAllElements(driver, wait); }
		 * finally
		 * 
		 * { // Close the WebDriver driver.quit(); }
		 */

	// Method to click on a notification in the main window
	private static void clickOnNotification(WebDriver driver, WebDriverWait wait) {
		WebElement cleine = driver.findElement(By.xpath("(//p[contains(text(),'Clients')])[1]"));
		wait.until(ExpectedConditions.elementToBeClickable(cleine));
		cleine.click();
	}

	// Method to click on all elements in the current window
	private static void clickAllElements(WebDriver driver, WebDriverWait wait) {
		List<WebElement> elementsToClick = driver.findElements(By.xpath("//div[@class='looker-cell']//a"));
		for (WebElement element : elementsToClick) {
			wait.until(ExpectedConditions.elementToBeClickable(element));

			element.click();

			// driver.navigate().back(); // Navigate back to the previous page
			// Perform additional actions after clicking each element if needed
		}
	}

	/*
	 * for (int i = 0; i < listofclients.size(); i++)
	 * 
	 * {
	 * 
	 * WebElement we = listofclients.get(i);
	 * 
	 * if (we.getText() == listofclients.get(i).getText())
	 * 
	 * {
	 * 
	 * we.click(); driver.navigate().back();
	 * 
	 * }
	 * 
	 * }
	 */
	// //div[@class='looker-cell' ]/child::span/child::span/a

	/*
	 * 
	 * Set<String> childWindows =driver.getWindowHandles();
	 * 
	 * 
	 * 
	 * Iterator itr = childWindows.iterator();
	 * 
	 * while (itr.hasNext())
	 * 
	 * { // Object ob = itr.next(); // System.out.println(itr.next());
	 * 
	 * 
	 * } driver.get(""); String s3 =driver.getTitle(); String s2
	 * =driver.getCurrentUrl(); String s1 = driver.getPageSource(); WebElement wb =
	 * driver.findElement(null); List<WebElement> lisi = driver.findElements(null);
	 * Navigation nv = driver.navigate(); Options op = driver.manage();
	 * TargetLocator tr = driver.switchTo();
	 * 
	 * 
	 * 
	 * 
	 * /* for (WebElement cl : clientId)
	 * 
	 * { String cid = cl.getText(); String[] clientarr = cid.split(" ");
	 * 
	 * for (String l : clientarr)
	 * 
	 * {
	 * 
	 * if (l.equalsIgnoreCase(
	 * "23d8d73f8a32cd46e24ef916e15fae6c4d45d26a 474cdfd1358e2b0e386776ce6dfa48bc27484671"
	 * )) {
	 * 
	 * System.out.println(cl.getText()); }
	 * 
	 * }
	 * 
	 * }
	 */
	/// -------------

	// button[contains(text(),'Update')]

	// ---
	// //div[@data-testid='kyc-duedate']/child::div[2]/child::div[2]/child::div/following-sibling::div/child::div/child::div/child::div/child::div/child::div/child::button

	// --- //div[@class='MuiYearCalendar-root css-1flha1h']

	/*
	 * List<WebElement> allYears = driver.findElements(By.
	 * xpath("//div[@class='MuiYearCalendar-root css-1flha1h']"));
	 * wait.until(ExpectedConditions.visibilityOfAllElements(allYears));
	 * 
	 * for (WebElement el : allYears)
	 * 
	 * { String yr = el.getText(); // System.out.println(yr); String[] arr =
	 * yr.split(" ");
	 * 
	 * for (String ar : arr) {
	 * 
	 * //System.out.println(ar);
	 * 
	 * if (ar.equalsIgnoreCase("2031"))
	 * 
	 * { String tag = el.getTagName(); System.out.println(tag);
	 * 
	 * }
	 * 
	 * if (ar.equals("2031")) { el.click(); System.out.println("click on element");
	 * }
	 * 
	 * 
	 * } }
	 * 
	 */

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
