package basics.com;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	static WebDriver dr;
	
	public static void main(String[] args) {
		
		dr = new ChromeDriver();
		
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		dr.navigate().to("https://tutorialehtml.com/en/html-tutorial-radio-buttons/");
		
		List <WebElement> allRadio = dr.findElements(By.name("citizenship"));

		System.out.println(" total number of buttons " + allRadio.size());

		allRadio.get(1);
		
		allRadio.get(1).click();
		
		System.out.println(allRadio.get(1).getAttribute("selected"));
		
		for ( WebElement e:allRadio) {
			System.out.println(e.getAttribute("selected"));
		}
		
		dr.quit();
	}

}
