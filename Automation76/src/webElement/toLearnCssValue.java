package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class toLearnCssValue {

	public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/login");
			//css details for error message from here
			driver.findElement(By.xpath("//input[@value='Log in']")).click();
			WebElement errMsg = driver.findElement(By.xpath("//div[contains(@class,'validation')]"));
			String color = errMsg.getCssValue("color");
			String fonts = errMsg.getCssValue("font-size");
			String fontf = errMsg.getCssValue("font-family");
			
			System.out.println(color);
			System.out.println(fonts);
			System.out.println(fontf);
			
			//css details for register button from here
			 String colour = driver.findElement(By.xpath("//a[text()='Register']")).getCssValue("color");
			 String size = driver.findElement(By.xpath("//a[text()='Register']")).getCssValue("font-size");
			 String family = driver.findElement(By.xpath("//a[text()='Register']")).getCssValue("font-family");
			 
			 System.out.println(colour);
				System.out.println(size);
				System.out.println(family);
			
			
			

	}

}
