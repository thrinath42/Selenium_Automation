package shadowElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowElement {

	public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://demoapps.qspiders.com/ui");
			
			
			driver.findElement(By.xpath("//section[text()='Shadow Root Elements']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//section[text()='Shadow Root']")).click();
			Thread.sleep(2000);
			//identifying shadow host for username
			 SearchContext shadowHost = driver.findElement(By.xpath("//form/div[1]")).getShadowRoot();	//getshadowroot() gives shadow host
			 shadowHost.findElement(By.cssSelector("input[type='text']")).sendKeys("thrinath");
			//identifying shadow host for login
			 SearchContext shadowHostP = driver.findElement(By.xpath("//form/div[2]")).getShadowRoot();
			 shadowHostP.findElement(By.cssSelector("input[type='text']")).sendKeys("123456");
			 
			 driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
