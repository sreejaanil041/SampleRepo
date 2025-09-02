package test.automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions extends Base {

	public void handlingRightClick() {
		WebElement home = driver.findElement(By.xpath("//a [text()='Home']")) ;
		Actions action = new Actions(driver);
		action.contextClick(home).build().perform();
	}
	public void mouseHover() {
		WebElement others = driver.findElement(By.id("others"));
		Actions action = new Actions(driver);
		action.moveToElement(others).build().perform();				
	}
	
	public void verifyDragAndDrop() {
		driver.navigate().to("https://demoqa.com/droppable");
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		Actions action = new Actions(driver);
		action.dragAndDrop(drag, drop).build().perform();
	}
	
	public void verifyKeyBoardActions() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);	
				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingActions actions = new HandlingActions();
		actions.initializeBrowser();
		actions.handlingRightClick();
		actions.mouseHover();
		actions.verifyDragAndDrop();
		try {
			actions.verifyKeyBoardActions();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
