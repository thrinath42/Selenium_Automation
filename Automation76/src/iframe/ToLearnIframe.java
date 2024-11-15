package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToLearnIframe {

	public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
			
			driver.get("https://www.dream11.com/");
		//	driver.switchTo().frame(0);//by using index of iframe
		//	driver.switchTo().frame("send-sms-iframe");		// by using name or id of iframe
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='send-sms-iframe']")));//by using xpath of iframe
			
			driver.findElement(By.id("regEmail")).sendKeys("12345678");
			driver.findElement(By.id("regUser")).click();
			
		//	driver.switchTo().defaultContent();
			driver.switchTo().parentFrame();
			driver.findElement(By.id("hamburger")).click();

	}

	

}
