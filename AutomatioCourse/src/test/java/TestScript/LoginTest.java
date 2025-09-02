package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utilities.ExcelUtility;
import automation.core.TestNGBase;
import pages.LoginPage;

public class LoginTest extends TestNGBase{

	@Test
	public void verifyUserLoginWithValidCredential() {
		
		String username = ExcelUtility.getStringData(1,0,"LoginPage");
		String password = ExcelUtility.getStringData(1,1,"password");
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnLoginButton();
//		driver.navigate().to("https://www.saucedemo.com/v1/");
//	WebElement	usernameField = driver.findElement(By.id("user-name"));
//	System.out.println(usernameField);
//	usernameField.sendKeys("standard_user");
//	
//	WebElement	passwordField = driver.findElement(By.id("password"));
//	System.out.println(passwordField);
//	passwordField.sendKeys("secret_sauce");
//	
//	WebElement	loginButton = driver.findElement(By.id("login-button"));
//	System.out.println(loginButton);
//	loginButton.click();
	
	} 
}
