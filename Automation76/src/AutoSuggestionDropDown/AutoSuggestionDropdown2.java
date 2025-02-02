package AutoSuggestionDropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AutoSuggestionDropdown2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
		 driver.get("https://www.flipkart.com/");
		 driver.findElement(By.name("q")).sendKeys("iphone");
		 Thread.sleep(4000);
		 driver.findElement(By.xpath("(//span[contains(text(),'iphone')])[2]")).click();
	}
}
