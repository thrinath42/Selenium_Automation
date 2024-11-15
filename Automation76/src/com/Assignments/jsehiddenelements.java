package com.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class jsehiddenelements {

	public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
			
			driver.get("https://demoapp.skillrary.com/index.php");
			Thread.sleep(3000);
			WebElement subscribe = driver.findElement(By.xpath("//input[@class='form-control']"));
			
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("arguments[0].value='luke@gmail.com'", subscribe);
	}

}
