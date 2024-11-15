package POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stale {

	public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.get("https://demoapp.skillrary.com/");
			
	/*		WebElement searchTf = driver.findElement(By.id("navbar-search-input"));
			searchTf.sendKeys("Selenium",Keys.ENTER);
			Thread.sleep(3000);
			searchTf.sendKeys("testng");  */
			
			SkillRallyPage sp=new SkillRallyPage(driver);
			sp.getSearchTextField().sendKeys("Selenium",Keys.ENTER);
			Thread.sleep(3000);
			sp.getSearchTextField().sendKeys("Testng");
			
			

	}

}
