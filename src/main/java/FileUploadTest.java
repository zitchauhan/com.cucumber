
	

	import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;


import io.github.bonigarcia.wdm.WebDriverManager;

	public class FileUploadTest  {

	  @Test
	  public void fileUploadTest() {
		  WebDriverManager.chromedriver().setup();
		  WebDriver driver = new ChromeDriver();
	    driver.get("https://the-internet.herokuapp.com/upload");
	    File uploadFile = new File("src/test/resources/selenium-snapshot.png");

	    WebElement fileInput = driver.findElement(By.cssSelector("input[type=file]"));
	    fileInput.sendKeys(uploadFile.getAbsolutePath());
	    driver.findElement(By.id("file-submit")).click();
	    


	    WebElement fileName = driver.findElement(By.id("uploaded-files"));
	  //  Assertion.class("selenium-snapshot.png", fileName.getText());
	  }
	}
	

