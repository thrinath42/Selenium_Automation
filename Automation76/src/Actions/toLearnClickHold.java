package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class toLearnClickHold {

	public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
			driver.findElement(By.id("password")).sendKeys("hagsdh@123");
			WebElement eye = driver.findElement(By.xpath("//div[@class='disableddiv showPassword shownhide']"));
			
			Actions act=new Actions(driver);
			act.clickAndHold(eye).perform();
			Thread.sleep(2000);
			act.release().perform();

	}

}
