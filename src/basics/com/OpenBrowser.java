package basics.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenBrowser {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Testing\\Softwares\\Selenium\\drivers\\chromedriver.exe");
	
		ChromeOptions op = new ChromeOptions();
		
		op.addArguments("--disable-notifications");
		//op.addArguments("disable-infobars");
		op.addArguments("--start-maximized");
		op.addArguments("disable-infobars");
		
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "C:\\Java\\Selenium\\SeleniumBasics\\Chrome.logs");
		
		WebDriver dr = new ChromeDriver(op);
		
		dr.get("https://toolsqa.com");
		
		dr.quit();

	}

}
