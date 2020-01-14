package basics.com;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTabHandle {

	static WebDriver dr;
	public static void main(String[] args) {
		
		dr = new ChromeDriver();
		
		//dr.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dr.manage().window().maximize();
		
		dr.navigate().to("https://www.jobserve.com/in/en/Job-Search/");
		dr.findElement(By.xpath("//*[@id='SPTPosTitleLink']")).click();
		
		System.out.println(dr.getTitle());
		
		System.out.println(" Here 1 ");
		Set<String> winID = dr.getWindowHandles();
		
		System.out.println(" Number of windows " + winID.size());
		
		Iterator<String> it = winID.iterator();
		
		String MainTab = it.next();
		
		System.out.println(MainTab);
		
		String nxtTab =  it.next();
				
		System.out.println(nxtTab);
		
		dr.switchTo().window(nxtTab);
		
	//	dr.close();
	
		System.out.println(dr.getTitle());
		
//		String tt = dr.findElement(By.xpath("//*[@id='td_jobpositionnolink']")).getText()
	
		System.out.println(dr.findElement(By.xpath("//*[@id='td_jobpositionnolink']")).getText());
		  
		dr.findElement(By.xpath("//*[@id='td_applynewwin_btn']")).click();
		
		Set<String> winId = dr.getWindowHandles();
		
		Iterator<String> newWin = winId.iterator();
		
		dr.switchTo().window(newWin.next());
		
		
		System.out.println(dr.getTitle().equals("Job Application"));
		
		System.out.println(dr.getTitle());
		
		dr.quit();
		
		
		

	}

}
