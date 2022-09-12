package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	public WebDriver driver;
	
	@FindBy(xpath="//*[text()='Username']//parent::div//parent::div//input")
	WebElement userName;

	@FindBy(xpath="//*[text()='Password']//parent::div//parent::div//input")
	WebElement passWord;

	@FindBy(xpath="//*[text()=' Login ']")
	WebElement btnLogin;

	@FindBy(xpath="//h5[text()='Login']")
	WebElement txtLoginPage;

public Loginpage (WebDriver rdriver) {
	this.driver=rdriver;
	PageFactory.initElements(driver, this);
}



public void setusername(String uname){
	userName.sendKeys(uname);
}
public void setpassword(String pass) {
	passWord.sendKeys(pass);
}
public void login() {
	btnLogin.click();
	}
public String getLoginpageTitle() {
	return driver.getTitle();
}



}

