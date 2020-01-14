package basics.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XpathFromChrome {

	public static void main(String[] args) {
		
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--distable-notifications");
		ops.addArguments("--disable-infobar");
		
		WebDriver dr = new ChromeDriver();
		
		dr.get("https://edition.cnn.com/?refresh=1");
		System.out.println(dr.getTitle());
		
		dr.findElement(By.xpath("//*[@id='header-nav-container']/div/div[1]/div/div[2]/nav/ul/li[4]/a")).click();
		System.out.println(dr.getTitle());
		
		dr.quit();
	}

}
