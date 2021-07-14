package stepDefinition;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	
	@Given("^I open the browser$")
	public void i_open_the_browser() {
		System.out.println("I open the browser"); // wais is working on this method
		System.out.println("I enter valid password");
		System.out.println("I enter valid password");
		System.out.println("I enter valid password");
		System.out.println("I enter valid password");
	}

	@Given("^I visit the application$") // ken is working on this
	public void i_visit_the_application() {
		System.out.println("I visit the application");
		System.out.println("I enter valid password");
		System.out.println("I enter valid password");
		System.out.println("I enter valid password");
	}

	@Given("^I enter valid username$") // Mo is working
	public void i_enter_valid_username() {
		System.out.println("I enter valid username");
	}

	@Given("^I enter valid password$") // Abdullah
	public void i_enter_valid_password() {
		System.out.println("I enter valid password");
		System.out.println("I enter valid password");
		System.out.println("I enter valid password");
		System.out.println("I enter valid password");
		System.out.println("I enter valid password");
		System.out.println("I enter valid password");
		System.out.println("I enter valid password");
		System.out.println("I enter valid password");
		System.out.println("I enter valid password");
		System.out.println("I enter valid password");
	}

	@When("^I click the login button$")
	public void i_click_the_login_button() {
		System.out.println("I click the login button");
	}

	@Then("^I should see the dashboard$")
	public void i_should_see_the_dashboard() {
		System.out.println("I should see the dashboard");
	}

	@Given("^I enter in-valid username$")
	public void i_enter_in_valid_username() {
		System.out.println("I enter in-valid username");

	}

	@Given("^I enter in-valid password$")
	public void i_enter_in_valid_password() {
		Assert.assertTrue(true);
	}

}
