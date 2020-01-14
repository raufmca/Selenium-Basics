package basics.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		dr.navigate().to("https://carieranoua.ro/apply-now-external/?listing_id=1970850");
		
		dr.findElement(By.xpath("//*[@name='JOBG837']")).click();
		
		dr.switchTo().activeElement().sendKeys("C:\\Testing\\New_CV\\Abdulrouf_CV.pdf");
		
		
		//Upbtn.click();
		
		//Upbtn.sendKeys("C:\\Testing\\New_CV\\Abdulrouf_CV.pdf");
		
		
		
		
	}

}
