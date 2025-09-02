package test.automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingAlerts extends Base{

	public void verifyingSimpleALerts() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement SimpleAlert = driver.findElement(By.id("alertButton"));
		SimpleAlert.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	public void verifyConfirmAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement ConfirmAlert = driver.findElement(By.id("confirmButton"));
		ConfirmAlert.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
	}
	
	public void verifyPromptAlert() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement promptAlert = driver.findElement(By.id("promtButton"));
		promptAlert.click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Sreeja");
		alert.accept();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HandlingAlerts al = new HandlingAlerts();
		al.initializeBrowser();
		al.verifyingSimpleALerts();
		al.verifyConfirmAlert();
		al.verifyPromptAlert();
	}

}
