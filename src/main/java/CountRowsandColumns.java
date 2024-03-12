import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.List;

public class CountRowsandColumns {

	public static void main(String[] args) {

		//Finding The Number of Rows and Columns of a Dynamic Table in Selenium

		
		// Start the webdriver
		WebDriver driver = new FirefoxDriver();
		// Navigate to the webpage
		driver.get("http://example.com");
		// locate the table element
		WebElement table = driver.findElement(By.xpath("//table[@id=’myTable’]"));
		// find the number of rows in the table
		List<WebElement> rows = table.findElements(By.xpath(".//tr"));
		int numRows = rows.size();
		System.out.println("Number of rows: " + numRows);
		// find the number of columns in the table
		// assuming the first row has the most number of columns
		WebElement firstRow = rows.get(0);
		
		List<WebElement> cells = firstRow.findElements(By.xpath(".//td"));
		int numColumns = cells.size();
		System.out.println("Number of columns: " + numColumns);
		// Close the webdriver
		driver.quit();
	}

}
