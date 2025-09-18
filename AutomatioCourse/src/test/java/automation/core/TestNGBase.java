package automation.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGBase {
public WebDriver driver;

	@BeforeMethod
	@Parameters("browsers")
	public void initializeBrowser(String browser) throws Exception {
		if(browser.equalsIgnoreCase("chrome")) {
			driver= new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			 WebDriverManager.edgedriver()
			 .clearResolutionCache()
			    .forceDownload()
			    .setup();
			driver=new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			driver= new FirefoxDriver();
			
		}
		else {
			throw new Exception("invalid browser");
		}
	driver= new ChromeDriver();
	driver.get("https://selenium.qabible.in/");
	driver.manage().window().maximize();
	}
	
@AfterMethod	
public void closeandquit() {
	//driver.close();
	//driver.quit();
}
}
