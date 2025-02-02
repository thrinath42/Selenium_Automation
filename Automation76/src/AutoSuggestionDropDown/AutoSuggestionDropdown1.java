package AutoSuggestionDropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionDropdown1 {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
		 driver.get("https://demowebshop.tricentis.com/");
		 driver.findElement(By.id("small-searchterms")).sendKeys("compu");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[contains(text(),'Build your own computer')]")).click();

	}

}
