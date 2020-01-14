package basics.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributesWebElement {

	public static void main(String[] args) {
		
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		dr.findElement(By.cssSelector("#login1")).sendKeys("TestString");
		
		System.out.println(" The text is " + dr.findElement(By.cssSelector("#login1")).getText());
		
		System.out.println(" The text is " + dr.findElement(By.cssSelector("#login1")).getAttribute("value"));
		
		//dr.findElement(By.cssSelector("#remember")).
		
		System.out.println(" The value of check box is =>" + dr.findElement(By.cssSelector("#remember")).getAttribute("checked"));
		
		dr.quit();
		
		
	}

}
