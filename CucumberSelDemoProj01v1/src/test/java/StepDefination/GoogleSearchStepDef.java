package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import baseClass.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchStepDef extends BaseClass {
	
	
	@Given("Browser is launched")
	public void browser_is_launched() {

		setUp();
	}

	@And("User is on google search page")
	public void user_is_on_google_search_page() throws Exception {

		driver.navigate().to("https://google.com");
		Thread.sleep(2);
	}

	@When("User enters a text in search box")
	public void user_enters_a_text_in_search_box() throws Exception {

		driver.findElement(By.name("q")).sendKeys("Automation Step By Step");
		Thread.sleep(5);
	}

	@When("hits enter")
	public void hits_enter() {

		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("user is navigated to search result")
	public void user_is_navigated_to_search_result() {

	}

}
