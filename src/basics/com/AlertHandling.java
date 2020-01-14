package basics.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	static WebDriver dr;
	
	public static void main(String[] args) {
	
		dr = new ChromeDriver();
		
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		dr.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
		
		dr.findElement(By.id("login1")).sendKeys("Enteringvalue");
		dr.findElement(By.name("proceed")).click();
		
		Alert al = dr.switchTo().alert();
		
		System.out.println(al.getText());
		
		al.accept();
		
		dr.switchTo().defaultContent();
		
		dr.findElement(By.id("password")).sendKeys("Password");
		
		dr.quit();
		
		
	}

}
