package test.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base{
	
	public void handlingElements() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement msgBox = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		msgBox.sendKeys("Sreeja");
		WebElement btn = driver.findElement(By.xpath("//button[@id='button-one']"));
		btn.click();
		WebElement msg = driver.findElement(By.xpath("//div[@id = 'message-one']"));
		System.out.println(msg.getText());
		msg.clear();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebElementCommands webElement = new WebElementCommands();
		webElement.initializeBrowser();
		webElement.handlingElements();
	}

}
