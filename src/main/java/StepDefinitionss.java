/*

Feature: Calculator
  Scenario: Addition
    Given I have entered 50 into the calculator
    And I have entered 70 into the calculator
    When I press add
    Then the result should be 120 on the screen

*/

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionss {
    private int result;
    private Calculator calculator = new Calculator();

    @Given("I have entered {int} into the calculator")
    public void i_have_entered_into_the_calculator(int number) {
        calculator.enter(number);
    }

    @When("I press add")
    public void i_press_add() {
        result = calculator.add();
    }

    @Then("the result should be {int} on the screen")
    public void the_result_should_be_on_the_screen(int expectedResult) {
        assertEquals(expectedResult, result);
    }
}
