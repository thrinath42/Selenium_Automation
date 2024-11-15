package com.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class skillrallyMouseHover {

	public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.get("https://demoapp.skillrary.com/product.php?product=selenium");
			Actions act=new Actions(driver);
			act.moveToElement(driver.findElement(By.cssSelector("i[class='fa fa-plus']"))).doubleClick().perform();
			

	}

}
