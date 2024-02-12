import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentFlipkart {

	@Test
	public void TestFlipkartSearch() {

		Reporter.log("TC to test Flipkart Search functioanlity started", true);
		String s_search_string = "Tv";
		String url = "https://www.flipkart.com";
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\Devina\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get(url);
		driver.manage().window().maximize();
		Reporter.log("Chrome Invoked and navigated to URL: " + url + "<br>", true);

		// Checking page is navigated with the expected title
		String actual = driver.getTitle();
		String expected = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		Assert.assertEquals(actual, expected);
		Reporter.log("Page Navigated." + "<br>", true);

		// Clicking on Cross button

		/*
		 * WebElement sign_in_cross =
		 * driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		 * sign_in_cross.click(); Reporter.log("Sign In Window Closed." + "<br>", true);
		 * 
		 */

		// Check Search Box is Displayed
		WebElement searchbx = driver.findElement(By.xpath("//input[@name ='q' and @type='text']"));
		Assert.assertEquals(searchbx.isDisplayed(), true);
		Reporter.log("Search Box is displayed." + "<br>", true);

		// Enter TV in Search text box
		searchbx.sendKeys(s_search_string);

		// Clicked on Search button
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		try {
			driver.findElement(By.xpath("//button[@title=\"Search for Products, Brands and More\"]//*[name()=\"svg\"]"))
					.click();

		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
		}

		// Check if search Results is displayed-VALIDATION 1

		try {

			WebElement txtbx_search_result_text = driver
					.findElement(By.xpath("//span[contains(text(),'Page 1 of 44')]"));

			Assert.assertEquals(txtbx_search_result_text.isDisplayed(), true);

		} catch (NoSuchElementException e) {

			e.getMessage();
			// TODO: handle exception
		} catch (Exception e) {

		}

		// WebElement txtbx_search_result_text =
		// driver.findElement(By.xpath("//span[contains(text(),'Page 1 of 44')]"));
		// Assert.assertEquals(txtbx_search_result_text.isDisplayed(), true);

		// Check if search Results is displayed-VALIDATION 2
		String exp_search_title = s_search_string;
		String actual_search_title = driver.getTitle();
		System.out.println("----------------");
		System.out.println(actual_search_title);

		System.out.println();

		if (actual_search_title.toLowerCase().contains(exp_search_title.toLowerCase())) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		Reporter.log("Search Box set with value :" + s_search_string + " and search results displayed" + "<br>", true);
		System.out.println();
		System.out.println("----------------");
		System.out.println();

		// Fetch All the Products Text
		List<WebElement> list_of_products = driver.findElements(By.xpath("//div[@class='_4rR01T']"));

		WebElement s = null;
		Iterator<WebElement> itr = list_of_products.iterator();

		while (itr.hasNext()) {

			s = itr.next();

		}
		s.click();

		// Creating a FluentWait instance with a timeout of 10 seconds, polling every 10
		// seconds,
		// and ignoring NoSuchElementException during the wait
		Wait<WebDriver> wait1 = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(10)).ignoring(NoSuchElementException.class);

		// Using FluentWait to wait until the condition is met (element with id "foo" is
		// present)
		WebElement foo = wait1.until
				
			(
				
				new Function<WebDriver, WebElement>() 
			
				{
					
			public WebElement apply(WebDriver driver) 
			
			
			{
				return driver.findElement(By.xpath("//button[text()='GO TO CART']"));
			}
				}		
			);
		
		foo.click();

		/*
		 * 
		 * WebElement ele =
		 * driver.findElement(By.xpath("//button[text()='GO TO CART']"));
		 * 
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(0));
		 * 
		 * ele = wait.until(ExpectedConditions.visibilityOf(ele)); ele.click();
		 * 
		 */

		// driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
		/*
		 * 
		 * 
		 * List<WebElement> list_of_products_price =
		 * driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		 * 
		 * // Use of HashMaop to store Products and Their prices(after conversion to //
		 * Integer) String product_name; String product_price; int int_product_price;
		 * 
		 * HashMap<Integer, String> map_final_products = new HashMap<Integer, String>();
		 * 
		 * for (int i = 0; i < list_of_products.size(); i++)
		 * 
		 * { product_name = list_of_products.get(i).getText();// Iterate and fetch
		 * product name
		 * 
		 * product_price = list_of_products_price.get(i).getText();// Iterate and fetch
		 * product price
		 * 
		 * product_price = product_price.replaceAll("[^0-9]", "");// Replace anything
		 * will space other than numbers
		 * 
		 * int_product_price = Integer.parseInt(product_price);// Convert to Integer
		 * 
		 * map_final_products.put(int_product_price, product_name);// Add product and
		 * price in HashMap }
		 * 
		 * System.out.println(map_final_products);
		 * 
		 * System.out.println(
		 * "-------------------------------------------------------------------");
		 * 
		 * // Reporter.log("Product Name and price fetched from UI and saved in HashMap
		 * // as:" + map_final_products.toString() + "<br>", true);
		 * 
		 * // System.out.println(); // System.out.println(); // Find the Highest and
		 * Lowest prices // One way is to fetch all values of the hashMap and then save
		 * it in the // ArrayList // Then using Collections class in java, sort it. this
		 * we can easily get highest // and lowest
		 * 
		 * // Get all the keys from Hash Map Set<Integer> allkeys =
		 * map_final_products.keySet(); ArrayList<Integer>
		 * array_list_values_product_prices = new ArrayList<Integer>(allkeys);
		 * 
		 * // Sort the Prices in Array List using Collections class // this will sort in
		 * ascending order lowest at the top and highest at the bottom
		 * 
		 * 
		 * //Collections.sort(array_list_values_product_prices);
		 * 
		 * // Highest Product is int high_price =
		 * array_list_values_product_prices.get(array_list_values_product_prices.size()
		 * - 1);
		 * 
		 * // Low price is int low_price = array_list_values_product_prices.get(0);
		 * 
		 * 
		 * 
		 * Reporter.log("High Product Price is: " + high_price + " Product name is: " +
		 * map_final_products.get(high_price), true);
		 * 
		 * System.out.println("----------------"); Reporter.log("Low Product Price is: "
		 * + low_price + " Product name is: " + map_final_products.get(low_price),
		 * true); System.out.println("----------------"); System.out.println(high_price
		 * + " :" + map_final_products.get(high_price));
		 * System.out.println("----------------"); System.out.println(low_price + " :" +
		 * map_final_products.get(low_price));
		 * 
		 * // Get List of All values from Hash Map. Right now we do not need it so //
		 * commenting // Collection<String> allValues = map_final_products.values(); //
		 * ArrayList<String> array_list_values_product_names = new //
		 * ArrayList<String>(allValues);
		 * 
		 * 
		 * 
		 */

	}

}