package testRunner;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MultipleData {
	WebDriver driver;
	String url="http://orangehrm.qedgetech.com/";
	@When("^I open OrangeHRMS URL on \"([^\"]*)\"$")
	public void i_open_OrangeHRMS_URL_on(String arg1) throws Throwable {
	    
	}

	@When("^I enter \"([^\"]*)\" in usernameField$")
	public void i_enter_in_usernameField(String arg1) throws Throwable {
	   
	}

	@When("^I enter \"([^\"]*)\" in passwordField$")
	public void i_enter_in_passwordField(String arg1) throws Throwable {
	    
	}

	@When("^clicking Login Button$")
	public void clicking_Login_Button() throws Throwable {
	    
	}

	@Then("^I Should verify dashboard in url$")
	public void i_Should_verify_dashboard_in_url() throws Throwable {
	    
	}

	@When("^Closingbrowser$")
	public void closingbrowser() throws Throwable {
	    
	}

}
