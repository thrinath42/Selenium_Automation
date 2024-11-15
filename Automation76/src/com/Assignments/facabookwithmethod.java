package com.Assignments;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class facabookwithmethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		toVerify(driver, "https://demowebshop.tricentis.com/");
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Facebook")).click();
		switchTo(driver, "facebook");
		Thread.sleep(2000);
		toVerify(driver, "https://www.facebook.com/nopCommerce");
		driver.findElement(By.xpath("//span[text()='Create new account']")).click();
		Thread.sleep(3000);
		switchTo(driver, "FnopCommerce");
		Thread.sleep(3000);
		toVerify(driver, "https://www.facebook.com/reg/?next=%2FnopCommerce");
		driver.findElement(By.xpath("//input[contains(@name,'firstname')]")).sendKeys("missyouRaj");
	}
	public static void switchTo(WebDriver driver, String Url) {
		Set<String> ids = driver.getWindowHandles();
		for (String id : ids) {

			driver.switchTo().window(id);
			String curUrl = driver.getCurrentUrl();

			if (curUrl.contains(Url))
				break;
		}
	}
	public static void toVerify(WebDriver driver, String url) {
		if (driver.getCurrentUrl().equals(url))

			System.out.println( driver.getTitle()+" Page dispalyed");
		else
			System.out.println("Loading failed");
	}
}
