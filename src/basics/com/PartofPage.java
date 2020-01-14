package basics.com;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class PartofPage {

	static WebDriver dr;
	public static void main(String[] args) {
		
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable-infobars");
		
		dr = new ChromeDriver(ops);
		
		dr.manage().window().maximize();
		
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		dr.navigate().to("https://edition.cnn.com/");
		
		String part1 = "//*[@id='intl_homepage1-zone-1']/div[2]/div/div[3]/ul/li[";
		String part2 = "]/article/div/div/h3/a/span[1]";
		
		/*
		for ( int i = 2; i <= 9; i++) {
			dr.findElement(By.xpath(part1+i+part2)).click();
			System.out.println(i + ")" + dr.getTitle());
			System.out.println("-------------------");
			dr.navigate().back();
		} */

		int i = 2;
		
		while (isElementPresent(part1+i+part2, "xpath")) {
			
			String txt = dr.findElement(By.xpath(part1+i+part2)).getText();
			System.out.println(" Text on the link is ---> "+ txt);
			
			String url = dr.findElement(By.xpath(part1+i+part2)).getAttribute("href");
			
			
		
			
			dr.findElement(By.xpath(part1+i+part2)).click();
			System.out.println(dr.getTitle());
			
			dr.navigate().back();
			i++;
		}
		
		
		dr.quit();
	}

	
	public static boolean isElementPresent(String locator, String locatorType) {
		
		List <WebElement> allElement;
		
		if ( locatorType.equals("xpath"))
			allElement = dr.findElements(By.xpath(locator));
		else 
			allElement = dr.findElements(By.cssSelector(locator));
		
		if ( allElement.size() == 0)
			return false;
		else
			return true;
	}
}
