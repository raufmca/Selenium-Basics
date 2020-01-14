package basics.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDrop {

	static WebDriver dr;
	public static void main(String[] args) {
		
		dr = new ChromeDriver();
		
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		dr.navigate().to("https://jqueryui.com/droppable/");
		
		int s = dr.findElements(By.tagName("iframe")).size();
		
		System.out.println("Number of frames on page = " + s);
		
		dr.switchTo().frame(0);
		
		WebElement src = dr.findElement(By.id("draggable"));
		WebElement dst = dr.findElement(By.id("droppable"));
		
		Actions act = new Actions(dr);
		
		act.dragAndDrop(src, dst).build().perform();
		
		
		dr.quit();
		

	}

}
