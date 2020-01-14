package basics.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Wait {

	public static void main(String[] args) {
		
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable-notifications");
		ops.addArguments("-disable-infobar");
		
		WebDriver dr = new ChromeDriver();
		
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		dr.manage().window().maximize();
		
		dr.get("https://github.com/raufmca/TestJavaProjects");
		
		dr.findElement(By.xpath("//*[@id=\"js-repo-pjax-container\"]/div[1]/div/div/a")).click();
		
		System.out.println(dr.getTitle());
		
		
		
		dr.quit();

	}

}
