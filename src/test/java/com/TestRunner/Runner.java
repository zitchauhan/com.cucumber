package com.TestRunner;

import org.testng.annotations.Test;
import io.cucumber.core.cli.Main;
import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/resources/features", // Path to your feature files
		glue = "stepDefinitions" // Path to your step definitions
)
@Test
public class Runner extends AbstractTestNGCucumberTests {
	// This class acts as a TestNG runner for Cucumber tests
}

/*
 * @CucumberOptions(
 * 
 * 
 * Examples: - @CucumberOptions(glue = "com.example.application")
 * - @ConfigurationParameter(key = GLUE_PROPERTY_NAME, value =
 * "com.example.application") - src/test/resources/junit-platform.properties
 * cucumber.glue=com.example.application -
 * src/test/resources/cucumber.properties cucumber.glue=com.example.application
 * 
 * 
 * features = "src/test/resources/features", glue =
 * "C:\\Users\\zitch\\eclipse-workspace_2023\\com.cucumber\\src\\test\\java\\stepDefinitions"
 * ) public class Runner extends AbstractTestNGCucumberTests { // Your TestNG
 * runner configuration }
 */

/*
 * @CucumberOptions (
 * 
 * tags = "", features = { "src/test/resources/featureFiles" }, glue =
 * {"src/test/java/com/stepDefinitions" },
 * 
 * plugin = {"pretty" ,"html:target/cucumber-reports/cucumber-html-reports"})
 * 
 * 
 * @CucumberOptions(
 * 
 * features="src/test/resources/featureFile/",
 * glue="src/test/java/com/stepDefinitions", tags= "@smokeTest",
 * monochrome=true,
 * 
 * // plugin = //
 * "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/cucumber-html-reports/Report/report1.html",
 * // format="pretty","html:target/cucumber-reports/cucumber-html-reports", //
 * "json:target/cucumber-reports/cucumber-html-reports/common.json"}
 * 
 * // strict = true, // dryRun = true // tags = "@smokeTest", // features =
 * "src\\test\\resources\\featureFiles", // glue =
 * {"src\\test\\java\\com\\stepDefinitions"} // plugin = {"pretty"}
 * 
 * // )
 * 
 * public class Runner extends AbstractTestNGCucumberTests {
 * 
 * 
 * @BeforeClass(alwaysRun = true) public void setUpClass() {
 * testNGCucumberRunner = new TestNGCucumberRunner(this.getClass()); }
 * 
 * @Test(dataProvider = "features") public void feature(CucumberFeatureWrapper
 * cucumberFeature) {
 * testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature()); }
 * 
 * @DataProvider public Object[][] features() { return
 * testNGCucumberRunner.provideFeatures(); }
 * 
 * @AfterClass(alwaysRun = true) public void tearDownClass() {
 * testNGCucumberRunner.finish(); }
 * 
 * }
 */