package stepDefinitions;

import org.openqa.selenium.WebDriver;

import PageObjectModal.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {

	private WebDriver driver;

	public StepDef() {
		this.driver = Hooks.getDriver();

	}

	
}