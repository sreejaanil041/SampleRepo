package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(id = "user-name") private WebElement usernameField;
	@FindBy(id = "password") private WebElement passwordField;
	@FindBy(id = "login-button") private WebElement loginButton;
	
	public LoginPage enterUsernameOnUsernameField(String UserName) {
		usernameField.sendKeys(UserName);
		return this;
	}
	
	public LoginPage enterPasswordOnPasswordField(String password) {
		passwordField.sendKeys(password);
		return this;
	}
	
	public HomePage clickOnLoginButton() {
		loginButton.click();
		return new HomePage(driver);
	}
 
}
