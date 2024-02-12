package Array_Java;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Map;
import java.util.Set;

import javax.swing.text.Document;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HelloWorld {

	static WebDriver driver;

	@Test
	public static void main() {
		String str = "Hello, World";
		char[] arr = str.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char ch : arr) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else if (ch != ' ') {
				map.put(ch, 1);
			}
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + "  Number of Times :" + entry.getValue());
			}

		}

		// System.out.println("Hello, World!");
		/// Hello, World!

	}

	@Test

	public static void numberOfTimes() {
		List list = new ArrayList();

		list.add(10);
		list.add('a');
		list.add("aa");
		list.add(3, 0);

		Iterator itr = list.iterator();
		while (itr.hasNext()) {

			System.out.println(itr.next());
		}

		ListIterator itr1 = list.listIterator();

		while (itr.hasNext()) {

		}
	}

	@Test
	public void restAssuted() {
	}

	public static void main(String[] args) throws AWTException, IOException {

		WebDriverManager.chromedriver().setup();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		wait.until(ExpectedConditions.elementToBeSelected(By.xpath("")));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("")));

		Actions ac = new Actions(driver);
		ac.build();
		ac.click();
		ac.clickAndHold();
		ac.doubleClick();
		ac.dragAndDrop(null, null).build().perform();
		ac.getActiveWheel();
		ac.scrollByAmount(0, 0);
		ac.sendKeys(args);

		ac.keyUp(null);

		Robot robot = new Robot();
		robot.keyPress(0);

		Action accc = null;
		accc.perform();

		// file upload using selenium

		driver.findElement(By.id("file-upload")).sendKeys("path/to/your/file.txt");
		String s = System.getProperty("user.dir") + "'path/to/your/file.txt";
		driver.findElement(By.id("file-submit")).submit();

		// working with fils
		FileInputStream inputStream = new FileInputStream("SampleFile.txt");
		InputStreamReader reader = new InputStreamReader(inputStream, "UTF-16");
		int character;
		while ((character = reader.read()) != -1) {
			System.out.print((char) character);
		}
		reader.close();

		// using file reader

	}

	@Test
	void Using_FileReader() throws FileNotFoundException {
		FileReader reader1 = new FileReader("SampleFile.txt");
		int character1 = 0;
		try {
			while ((character1 = reader1.read()) != -1) {
				System.out.print((char) character1);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			reader1.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test
	void Read_data_from_a_CSV_file1() throws IOException {

		File file = new File("E:\\TestData\\TestData.xls");
		FileInputStream inputStream = new FileInputStream(file);
		HSSFWorkbook wb = new HSSFWorkbook(inputStream);
		HSSFSheet sheet = wb.getSheet("SAMPLE_DATA");
		HSSFRow row2 = sheet.getRow(1);
		HSSFCell cell = row2.getCell(5);
		String address = cell.getStringCellValue();

	}

	@Test
	void Selenium_Navigatorse() throws IOException {

		driver.get("");
		driver.navigate();
		driver.navigate().refresh();
		driver.navigate().forward();
		driver.navigate().back();
	}

	@Test
	void Working_with_Windows() {

		// Get the current window handle:

		String mainWindowHandle = driver.getWindowHandle();

		// Get all window handles:

		Set<String> allwindows = driver.getWindowHandles();

		// Switch to a specific window:
		String Specificwindow = driver.getWindowHandle();
		driver.switchTo().window(Specificwindow);

		// Switch to newly created window:

		driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);

		// close current windows

		driver.close();

		// Set window position:

		driver.manage().window().setPosition(new Point(0, 0));

		// maximize windows
		driver.manage().window().maximize();

		// minimize the winodws

		driver.manage().window().minimize();

		// full screen
		driver.manage().window().fullscreen();

	}

	@Test
	void TakeScreenShot() throws IOException {
		File destinatio = new File("./image.png");

		File scrfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(scrfile, destinatio);
	}

	
	@Test
	void frams() {
		
		
		//Working with Frames
		
		//1 .Switch to a frame by name or ID:
		
		driver.switchTo().frame("buttonfram");
		
		//2. Switch to a frame by index:
		
		driver.switchTo().frame(1);
		
		//3 . Switch to a frame using a WebElement:
		
		WebElement iframe = driver.findElement(By.cssSelector("#modal>iframe"));
		
		driver.switchTo().frame(iframe);

		
		//4 Switch back to the main content: 
		   driver.switchTo().defaultContent();
	}
	
	
	@Test
	void Working_with_Alerts() {
		
	//	Switch to an alert: interface 
		
		Alert alert = driver.switchTo().alert();

		// enter text into alert
		
		alert.sendKeys("Seleniim");
		
		// retrive the alert text 
		String alerttext = alert.getText();
	}
	
	@Test
	void seleniumOperation() {
		
		//Selenium launch browser
		
		driver.get("Https://www.google.com");
		
		//click on buttom ;
		WebElement button = driver.findElement(By.xpath(" "));
		button.click();
		
		// accepet an alert 
		
		driver.switchTo().alert().accept();
		
		// dismiss alert 
		driver.switchTo().alert().dismiss();
	
		
		// print the pagetitle;
		
		String title  = driver.getTitle();

		System.out.println(title);
		
		
		
		/// implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// explicity wait 
		
		WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(button));
		
		// sleep
		
		try {
			
			
			Thread.sleep(3000);
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Clear the input field text:
		
		
		
		WebElement searchbox = driver.findElement(By.xpath(""));
		
		searchbox.sendKeys("a");
		searchbox.clear();
		
		
		
		// Disable a field (set the ‘disabled’ attribute):

		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		String todisable = "document.getElementsByName('fname')[0].setAttribute('disabled', '')";
		js.executeAsyncScript(todisable);
///Enable field 		
		
		
		JavascriptExecutor javascript = ((JavascriptExecutor) driver);
		String toEnable = "document.getElementsByName('fname')[0].setAttribute(enabled, '');";
		javascript.executeScript(toEnable);
	}

	
	
	
}