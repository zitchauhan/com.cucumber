package stepDefinitions;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageObjectModal.Hooks;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

	private WebDriver driver;

	public StepDefinitions() {
		this.driver = Hooks.getDriver();

	}

	//// -------------------------------

	@Given("User is on Home Page")
	public void user_is_on_home_page() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://id.testsigma.com/");

	}

	@When("User Navigate to LogIn Page")
	public void user_navigate_to_log_in_page() {
		driver.findElement(By.xpath("//h1[@class='text-center mt-10 mb-4 text-3xl text-secondary-600 font-semibold']"))
				.click();
		String str = driver.getPageSource();
		// System.out.println(str);
	}

	public void yourTestMethod(DataTable dataTable) {
		// Retrieve data from the DataTable
		List<List<String>> data = dataTable.asLists();

		// Iterate over the list of lists
		for (List<String> row : data) {
			// Iterate over each element in the row
			for (String value : row) {
				System.out.print(value + "\t");
			}
			System.out.println(); // Move to the next line for the next row
		}
	}

	@When("User enters Credentials to LogIn")
	public void user_enters_credentials_to_log_in(DataTable dataTable) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.

		List<List<String>> data = dataTable.rows();
		driver.findElement(By.id("log")).sendKeys(data.get(0).get(0));
		driver.findElement(By.id("pwd")).sendKeys(data.get(0).get(1));
		driver.findElement(By.id("login")).click();

		// data.iterator();

	}
	@When("User enters Credentials to LLogIn")
	public void user_enters_credentials_to_log_in11(DataTable dataTable) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.

		Map<String, String> map = dataTable.asMap();
		driver.findElement(By.id("log")).sendKeys(map.get(0));
		driver.findElement(By.id("pwd")).sendKeys(map.get(1));
		driver.findElement(By.id("login")).click();

		// data.iterator();

	}
	
	

	@Then("Message displayed Login Successfully")
	public void message_displayed_login_successfully() {
		// Write code here that turns the phrase above into concrete actions

	}

	@When("User LogOut from the Application")
	public void user_log_out_from_the_application() {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("Message displayed LogOut Successfully")
	public void message_displayed_log_out_successfully() {
		// Write code here that turns the phrase above into concrete actions

	}

	// ----------------------------

	private int number1;
	private int number2;
	private int result;

	@Given("user has two numbers {int} and {int}")
	public void userHasTwoNumbers(int num1, int num2) {
		this.number1 = num1;
		this.number2 = num2;
	}

	@When("the user adds the two numbers")
	public void theUserAddsTheTwoNumbers() {
		this.result = number1 + number2;
	}

	@Then("the user should get the result")
	public void theUserShouldGetTheResult() {
		System.out.println("Result: " + result);
	}

	//// ---------------------------

	@Given("I want to write a step with name2")
	public void i_want_to_write_a_step_with_name2() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("1");
	}

	@When("I check for the {int} in step")
	public void i_check_for_the_in_step(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("2");
	}

	@Then("I verify the Fail in step")
	public void i_verify_the_fail_in_step() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("3");
	}

	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("4");
	}

	@Given("some other precondition")
	public void some_other_precondition() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("5");
	}

	@When("I complete action")
	public void i_complete_action() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("6");
	}

	@When("some other action")
	public void some_other_action() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("7");
	}

	@When("yet another action")
	public void yet_another_action() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("8");
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("9");
	}

	@Then("check more outcomes")
	public void check_more_outcomes() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("10");
	}

	@Given("I want to write a step with name1")
	public void i_want_to_write_a_step_with_name1() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("11");
	}

	@Then("I verify the success in step")
	public void i_verify_the_success_in_step() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("12");
	}
}