package Locators;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToBreak {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/products_page/23");
		Thread.sleep(15000);
		String parent = driver.getCurrentUrl();
		System.out.println(parent);
		driver.findElement(By.id("compare")).click();
		Set<String> allIds = driver.getWindowHandles();
		for (String id : allIds) {
			driver.switchTo().window(id);
			Thread.sleep(2000);
			String url = driver.getCurrentUrl();
			System.out.println(url);

			if (url.contains("flipkart")) {

				break;
			}

		}
		driver.manage().window().maximize();
		// driver.findElement(By.xpath("//input[contains(@placeholder,'Search for products')]")).sendKeys("mobiles");
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("mobiles");
		Thread.sleep(3000);
		driver.close();
		Thread.sleep(2000);

		driver.switchTo().window(parent);
		driver.findElement(By.cssSelector("button[id='loginBtn']"));

	}

}
