package test.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptExecuteSample extends Base{
	
	public void verifyExecute() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", showMessageButton);
		js.executeScript("window.scrollBy(0,350)", "");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaScriptExecuteSample jses = new JavaScriptExecuteSample();
		jses.initializeBrowser();
		jses.verifyExecute();
	}

}
