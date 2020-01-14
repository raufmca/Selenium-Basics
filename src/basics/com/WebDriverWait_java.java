package basics.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWait_java {

	static WebDriver dr;
	public static void main(String[] args) {
		
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable-infobars");
		ops.addArguments("--disable-notificaitons");
		
		dr = new ChromeDriver(ops);
		
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		dr.manage().window().maximize();
		
		dr.navigate().to("https://portfolio.rediff.com/portfolio-login");
		
		dr.findElement(By.xpath("//*[@id='useremail']")).sendKeys("asishthakur1983");
		dr.findElement(By.xpath("//*[@id='emailsubmit']")).click();
		
		WebDriverWait wait = new WebDriverWait(dr, 10);
//wait.until(ExpectedCondition.class.))
		
		
		
		
		
		

	}

}
