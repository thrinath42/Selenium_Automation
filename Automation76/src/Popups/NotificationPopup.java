package Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {

	public static void main(String[] args) {
			ChromeOptions option=new ChromeOptions();
	//		option.addArguments("--disable-notifications"); //1st way of disabling popups
			option.addArguments("--incognito");				//we can avoid popups by opening the page in incognito mode.
			option.addArguments("--start-maximized");		//to maximize browser without maximize method
			
			WebDriver driver=new ChromeDriver(option);
	//		driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			
			driver.get("https://www.myntra.com/");
			driver.findElement(By.partialLinkText("MEN")).click();

	}

}
