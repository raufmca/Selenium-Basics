package basics.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragging {

	static WebDriver dr;
	public static void main(String[] args) {
		
		dr = new ChromeDriver();
		
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dr.manage().window().maximize();
		
		dr.navigate().to("https://jqueryui.com/draggable/");

		int s = dr.findElements(By.tagName("iframe")).size();
		
		System.out.println(" Number of iframes on page = " + s);
		
		dr.switchTo().frame(0);
		
		WebElement e = dr.findElement(By.id("draggable"));
		
		Actions act = new Actions(dr);
		act.dragAndDropBy(e, 100, 150).build().perform();
		
		dr.quit();
		
		
		
	}

}
