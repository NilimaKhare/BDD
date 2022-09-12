package stepdefination;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Loginpage;

public class loginpagestep {
	
	private static String title;
public WebDriver driver;
public Loginpage lp;

	@Given("user should open browser")
	public void user_should_open_browser() {
		 WebDriverManager.chromedriver().setup();;
		driver = new ChromeDriver();
		
		lp= new Loginpage(driver);
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@Given("user is on login page url {string}")
	public void user_is_on_login_page_url(String string) {
		driver.get(string);
	    driver.getCurrentUrl();
	   
	}
 
	@When("user enters username {string}")
	public void user_enters_username(String username) {
		lp.setusername(username);
	   	}

	@When("user enters password {string}")
	public void user_enters_password(String password) {
	    lp.setpassword(password);
	}

	@When("user clicks on Login button")
	public void user_clicks_on_login_button() {
	  lp.login(); 
	}

	@Then("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
		title = lp.getLoginpageTitle ();
		System.out.println("Page title is: " + title);
	}
	
	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitleName) {
		Assert.assertTrue(title.contains(expectedTitleName));
	}
}

