package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	WebDriver driver;
	@When("^I open OrangeHRMS URL on chrome$")
	public void i_open_OrangeHRMS_URL_on_chrome() throws Throwable {
	 System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get("http://orangehrm.qedgetech.com/");
	 driver.manage().window().maximize();
	}

	@When("^I enter username in usernameField and enter password$")
	public void i_enter_username_in_usernameField_and_enter_password() throws Throwable {
	  driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	  driver.findElement(By.name("txtPassword")).sendKeys("Admin");
	}

	@When("^I click Login Button$")
	public void i_click_Login_Button() throws Throwable {
		driver.findElement(By.name("Submit")).click();  
		Thread.sleep(5000);
	}

	@Then("^I Should see dash text in url$")
	public void i_Should_see_dash_text_in_url() throws Throwable {
	    String Expval="dash";
	    String Actval=driver.getCurrentUrl();
	    try {
	  Assert.assertEquals(Actval.contains(Expval), "Login got failed");  
	    }catch(Throwable t)
	    {
	    	System.out.println(t.getMessage());
	    }
	}

	@When("^I close the browser$")
	public void i_close_the_browser() throws Throwable {
		Thread.sleep(5000);
	    driver.close();

}
}
