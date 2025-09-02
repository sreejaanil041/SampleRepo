package test.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown extends Base{
	
	public void handlingDropdown() {
		driver.navigate().to("https://www.WebdriverUniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dropdown = driver.findElement(By.id("dropdown-menu-1"));
		Select select = new Select(dropdown);
		select.selectByIndex(2);
	
		
	}
	
	public static void main(String[] args) {
		HandlingDropdown drop = new HandlingDropdown();
		drop.initializeBrowser();
		drop.handlingDropdown();
	}

}
