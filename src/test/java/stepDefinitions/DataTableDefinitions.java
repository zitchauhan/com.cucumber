/*
 * package stepDefinitions;
 * 
 * import io.cucumber.datatable.DataTable;
 * 
 * import io.cucumber.java.After;
 * 
 * import io.cucumber.java.Before;
 * 
 * import io.cucumber.java.en.Given;
 * 
 * import io.cucumber.java.en.Then;
 * 
 * import io.cucumber.java.en.When; import
 * io.github.bonigarcia.wdm.WebDriverManager;
 * 
 * import org.junit.Assert;
 * 
 * import org.openqa.selenium.By;
 * 
 * import org.openqa.selenium.WebDriver;
 * 
 * import org.openqa.selenium.chrome.ChromeDriver;
 * 
 * import java.time.Duration; import java.util.List;
 * 
 * import java.util.Map;
 * 
 * import java.util.concurrent.TimeUnit;
 * 
 * import static org.hamcrest.CoreMatchers.containsString;
 * 
 * import static org.hamcrest.MatcherAssert.assertThat;
 * 
 * public class DataTableDefinitions {
 * 
 * WebDriver driver;
 * 
 * @Before
 * 
 * public void setup() {
 * 
 * //System.setProperty("webdriver.chrome.driver",
 * "src/test/resources/Drives/chromedriver.exe");
 * 
 * WebDriverManager.chromedriver().setup();
 * 
 * driver = new ChromeDriver();
 * 
 * driver.manage().window().maximize();
 * 
 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 * 
 * }
 * 
 * @Given("dUser is on the Login page")
 * 
 * public void duserOnHomePage() {
 * 
 * driver.get("https://lms-frontend-phase2.herokuapp.com/login ");
 * 
 * }
 * 
 * @When("dUser enters valid credentials")
 * 
 * public void dentersValidCredential(DataTable dataTable) throws
 * InterruptedException {
 * 
 * System.out.println("Credentials Entered");
 * 
 * List<String> LoginForm = dataTable.asList();
 * 
 * String userName = LoginForm.get(0);
 * 
 * String passWord = LoginForm.get(1);
 * 
 * driver.findElement(By.name("Username")).sendKeys(userName);
 * 
 * driver.findElement(By.name("Password")).sendKeys(passWord);
 * 
 * driver.findElement(By.id("LoginBtn")).submit();
 * 
 * }
 * 
 * @Then("dUser should see the LMS Home page ")
 * 
 * public void dsuccessfulLogin() throws InterruptedException {
 * 
 * String Homepage = driver.findElement(By.id("welcome")).getText();
 * 
 * System.out.println("Homepage :" + "");
 * 
 * assertThat(Homepage, containsString("Welcome"));
 * 
 * }
 * 
 * 
 * 
 * }
 */