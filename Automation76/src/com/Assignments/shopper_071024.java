package com.Assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class shopper_071024 {

	public static void main(String[] args) throws InterruptedException, IOException {
		String time = LocalDateTime.now().toString().replace(":", "-");
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
				if(url.equals("https://www.amazon.in/"))								//compare url
					break;
			}
			Thread.sleep(5000);
			Actions act=new Actions(driver);
			act.scrollByAmount(300, 500).perform();
			
			TakesScreenshot ts=(TakesScreenshot) driver;
			File temp = ts.getScreenshotAs(OutputType.FILE);
			File dest=new File("./Screenshots/"+time+".png");
			FileHandler.copy(temp, dest);
	
	
	}
}