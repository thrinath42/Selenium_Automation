package SwitchTo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/products_page/15");
		Thread.sleep(20000);
		driver.findElement(By.id("compare")).click();
		Thread.sleep(10000);

		switchToWindow(driver, "flipkart");
		Point fPos = driver.manage().window().getPosition();
		switchToWindow(driver, "ebay");
		Point ePos = driver.manage().window().getPosition();
		driver.manage().window().setPosition(fPos);
		switchToWindow(driver, "flipkart");
		driver.manage().window().setPosition(ePos);
	}

	private static void switchToWindow(WebDriver driver, String url) {
		// TODO Auto-generated method stub
		Set<String> allWindowIds = driver.getWindowHandles();
		for (String id : allWindowIds) {
			System.out.println(id);
			driver.switchTo().window(id);
			String acturl = driver.getCurrentUrl();
			if (acturl.contains(url)) {
				break;
			}
		}

	}

}
