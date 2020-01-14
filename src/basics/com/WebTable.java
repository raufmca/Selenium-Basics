package basics.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		dr.navigate().to("https://tutorialehtml.com/en/html-tutorial-tables/");

		//System.out.println(dr.navigate().toString());
		
		String str = dr.findElement(By.xpath("//div[@class='well code_preview']/table/tbody/tr/td[1]")).getText();
		
		System.out.println(str);
		dr.quit();
	}

}
