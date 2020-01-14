package basics.com;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown2 {

	static WebDriver dr ;
	public static void main(String[] args) {
		
		dr = new ChromeDriver();
		
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		dr.navigate().to("https://www.javaspringhibernate.com/contact-us");

		WebElement dropDown = dr.findElement(By.xpath("//select[@name='country_id']"));
		
		Select s = new Select(dropDown);
		
		s.selectByValue("106");
		
		List <WebElement> ops = s.getOptions();
		
		for ( WebElement e:ops) {
			System.out.println(e.getText());
		}
		
		dr.quit();
	}
	

}
