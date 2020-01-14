package basics.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class MultipleBulkElements {

	public static void main(String[] args) {
		
		WebDriver dr = new ChromeDriver();
		
		dr.manage().window().maximize();
		
		dr.get("https://edition.cnn.com/");
		
		List<WebElement> links = dr.findElements(By.tagName("a"));
		
		List<WebElement> link = dr.findElements(By.xpath("//a"));
		
		System.out.println(" Number of links ===> " + links.size());
		
		System.out.println(" Number of links using X path ==> " + link.size());
		
		/*
		for ( int i = 0; i < links.size(); i++) {
			WebElement ll = links.get(i);
			System.out.println(ll.getText() + " --> " + ll.isDisplayed());
		} */
		
		for (WebElement e: link) {
			System.out.println(e.getText() + " --> " + e.isDisplayed());
		}
		
		
		dr.quit();
		

	}

}
