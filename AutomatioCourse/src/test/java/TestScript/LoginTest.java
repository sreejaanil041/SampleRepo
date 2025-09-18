package TestScript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utilities.ExcelUtility;
import automation.core.TestNGBase;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends TestNGBase{
	public HomePage homepage;
	@Test
	public void verifyUserLoginWithValidCredential() {
		
		
		String username ="";
		try {
			username = ExcelUtility.getStringData(1,0,"LoginPage");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String password="";
		try {
			password = ExcelUtility.getStringData(1,1,"LoginPage");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password);
		homepage=loginpage.clickOnLoginButton();
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
