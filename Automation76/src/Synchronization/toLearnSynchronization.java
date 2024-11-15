package Synchronization;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class toLearnSynchronization {

	public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.shoppersstack.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(By.xpath("//button[text()='Login']")).click();
			List<WebElement> all = driver.findElements(By.tagName("span"));
			System.out.println(all.size());
			

	}

}
