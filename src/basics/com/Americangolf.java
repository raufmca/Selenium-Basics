package basics.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Americangolf {

	public static void main(String[] args) {
		
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable-notifications");
		ops.addArguments("--disable-infobars");
		ops.addArguments("--start-maximized");

		
		WebDriver dr = new ChromeDriver();
		
		dr.get("https://www.americangolf.co.uk/");
		System.out.println(dr.getTitle());
		
		dr.findElement(By.xpath("//*[@id=\"header-navigation\"]/div[2]/div[4]/div/div[2]/a/i")).click();
		
		System.out.println(dr.findElement(By.xpath("//*[@id='cart']/h1")).getText());
			
		
		dr.quit();
	}

}
