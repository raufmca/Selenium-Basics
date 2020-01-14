package basics.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Dynamics {

	public static void main(String[] args) {
		
		ChromeOptions ops = new ChromeOptions();
		
		ops.addArguments("--disable-notification");
		ops.addArguments("disable-infobars");
		
		WebDriver dr = new ChromeDriver(ops);
		
		dr.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		System.out.println(dr.getTitle());
		
		WebElement username = dr.findElement(By.id("login1"));
		username.sendKeys("CheckMYKeys");
		
		WebElement pwd = dr.findElement(By.id("password"));
		pwd.sendKeys("Password");
		
		WebElement btnGo = dr.findElement(By.name("proceed"));
		btnGo.click();
		
		System.out.println(dr.getTitle());
		
		// Xpath 
		
		
		
		dr.quit();

	}

}
