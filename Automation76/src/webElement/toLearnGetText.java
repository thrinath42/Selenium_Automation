package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class toLearnGetText {

	public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");
			driver.findElement(By.partialLinkText("Log in")).click();
			driver.findElement(By.xpath("//input[@value='Log in']")).click();
			String errorMsg = driver.findElement(By.xpath("//div[contains(@class,'validation-summary-errors')]")).getText();
			System.out.println(errorMsg);
			if(errorMsg.contains("Login was unsuccessful"))
				System.out.println("correct message");
			else
				System.out.println("Wrong message");

	}

}
