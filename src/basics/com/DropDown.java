package basics.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		
	ChromeOptions ops = new ChromeOptions();
	ops.addArguments("--disable-notifications");
	ops.addArguments("--disable-infobars");
	
	WebDriver dr = new ChromeDriver(ops);
	
	dr.manage().window().maximize();
	dr.navigate().to("https://tutorialehtml.com/en/html-tutorial-drop-down-lists-menu/");
	
	//dr.findElement(By.xpath("//*[@id='content']/ul/li[11]/a")).click();
	
	
	WebElement dropDown = dr.findElement(By.xpath("//select[@name='my_html_select_box']"));
	
	Select s = new Select(dropDown);
	
	//System.out.println("Select the item using index ---> ");
	s.selectByIndex(1);
	
	
	//s.selectByValue("Option 1");
	
	List <WebElement> op = s.getOptions();
	System.out.println(" Numbe of options available ->> " + op.size());
	
	for ( WebElement e:op ) {
		System.out.println(e.getText());
	}
	
	

	dr.quit();
	

	}

}
