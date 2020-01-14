package basics.com;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {

	public static void main(String[] args) {
		
		WebDriver dr = new ChromeDriver();
		
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		dr.navigate().to("https://tutorialehtml.com/en/html-tutorial-using-checkbox-tag/");
		
		List<WebElement> chk = dr.findElements(By.xpath("//input[@type='checkbox']"));
		
		System.out.println("Size " + chk.size());
		
		chk.get(1).click();
		
		for(WebElement e: chk) {
		System.out.println(e.getAttribute("checked"));
		if (e.getAttribute("checked") != null) {
			System.out.println(e.getAttribute("value"));
		}
		}
		dr.quit();

	}

}
