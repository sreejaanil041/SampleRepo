package test.automation;

public class BrowserCommands extends Base {
	
	public void handlingBrowserCommands() {
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String handleId = driver.getWindowHandle();
		System.out.println(handleId);
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
	}

	public void navigationCommands() {
		driver.navigate().to("http://www.amazon.in");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserCommands browsercommands = new BrowserCommands();
		browsercommands.initializeBrowser();
		browsercommands.handlingBrowserCommands();
		browsercommands.navigationCommands();
		
	}

}
