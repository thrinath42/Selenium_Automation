package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class toLearnBooleanMethods {

	public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.instagram.com/");
			//isEnabled
			WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
			System.out.println("Display Status= "+login.isDisplayed());
			System.out.println("Enable status= "+login.isEnabled());
			//is displayed for hidden elements
			driver.get("https://www.facebook.com/");
			driver.findElement(By.linkText("Create new account")).click();
			try {
				WebElement genderTF = driver.findElement(By.id("Custom"));
				System.out.println(genderTF.isDisplayed());
			}catch(Exception e) {
				System.out.println("Element is not displayed");
			}
			

	}

}
