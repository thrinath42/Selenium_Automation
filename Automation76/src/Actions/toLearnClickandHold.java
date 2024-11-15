package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class toLearnClickandHold {

	public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
			driver.findElement(By.id("password")).sendKeys("jhgasdyug@123");
			Actions act=new Actions(driver);
			act.moveByOffset(1302, 318).clickAndHold().perform();

	}

}
