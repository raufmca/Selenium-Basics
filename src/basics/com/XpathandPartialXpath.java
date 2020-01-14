package basics.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XpathandPartialXpath {

	public static void main(String[] args) {
		
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable-notifications");
		ops.addArguments("disable-infobars");

		WebDriver dr = new ChromeDriver();
		
	/*	dr.get("https://mail.rediff.com/cgi-bin/login.cgi");
		System.out.println(dr.getTitle());
		
		// Absolute or partial xpath
		dr.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/div[1]/a/img")).click();
		System.out.println(dr.getTitle());
		
		dr.quit(); */
		
		//partial Xpath
		
		dr.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		dr.findElement(By.xpath("//*[@id='login1']")).sendKeys("PartialXpath");
		dr.quit();
		
		
	}

}
