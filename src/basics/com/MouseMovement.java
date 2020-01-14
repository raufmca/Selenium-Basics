package basics.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {

	static WebDriver dr;
	public static void main(String[] args) {
		
		dr = new ChromeDriver();
		
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		dr.manage().window().maximize();
		
		dr.navigate().to("https://www.americangolf.co.uk/");
		WebElement gclub = dr.findElement(By.xpath("//*[@id='header-navigation']/div[1]/ul/li[3]/a"));

		Actions act = new Actions(dr);
		act.moveToElement(gclub).build().perform();
		
		dr.findElement(By.xpath("//*[@id='CLUBS_1']/ul/li[3]/ul/li/a/span")).click();
		
		dr.quit();
	}

}
