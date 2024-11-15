package Popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleChildWindowPopup {

	public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.get("https://www.shoppersstack.com/products_page/23");
			driver.findElement(By.id("compare")).click();
			Set<String> allids = driver.getWindowHandles();     			//capture all child window ids
			for(String id: allids)
			{
				driver.switchTo().window(id);								//switch to any window
				String url=driver.getCurrentUrl();							//capture url
				if(url.contains("flipkart"))								//compare url
					break;
			}
			
			driver.manage().window().maximize();
			Thread.sleep(5000);
			driver.close();
	}

}
