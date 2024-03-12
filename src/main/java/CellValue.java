import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.List;

public class CellValue {

    public static void main(String[] args) {
        // Start the WebDriver
        WebDriver driver = new FirefoxDriver();

        // Navigate to the webpage
        driver.get("http://example.com");

        // Locate the table element
        WebElement table = driver.findElement(By.xpath("//table[@id='myTable']"));

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

        // Close the WebDriver
        driver.quit();
    }
}
