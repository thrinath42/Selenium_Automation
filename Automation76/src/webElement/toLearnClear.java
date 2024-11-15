package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class toLearnClear {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		WebElement usernamet = driver.findElement(By.id("username"));
		Thread.sleep(2000);
		usernamet.clear();
		Thread.sleep(2000);
		usernamet.sendKeys("Testing");
		WebElement pwd = driver.findElement(By.id("password"));
		Thread.sleep(2000);
		pwd.clear();
		Thread.sleep(2000);
		pwd.sendKeys("John@24");
	}

}
