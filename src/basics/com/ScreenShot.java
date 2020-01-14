package basics.com;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScreenShot {
	static WebDriver dr;

	public static void main(String[] args) {

		
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable-notifications");
		ops.addArguments("--disable-infobars");
		
		 dr = new ChromeDriver(ops);
		
		dr.manage().window().maximize();
		dr.navigate().to("https://tutorialehtml.com/en/html-tutorial-drop-down-lists-menu/");
		
		takeScreenShot();

	}
	
	public static void takeScreenShot() {
		
		File srcFile = ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		
		try
		{
			FileUtils.copyFile(srcFile, new File(System.getProperty("user.dir") + "//temp.jpg"));
		} catch (IOException e) {

			e.printStackTrace();
		}
		
	}

}
