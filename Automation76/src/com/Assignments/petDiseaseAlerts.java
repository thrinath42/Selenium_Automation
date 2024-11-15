package com.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class petDiseaseAlerts {

	public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
			
			driver.get("https://petdiseasealerts.org/forecast-map/#/");			
			WebElement map = driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]"));
			driver.switchTo().frame(map);
			driver.findElement(By.id("montana")).click();			
			driver.switchTo().defaultContent();
			driver.findElement(By.xpath("//a[(text()='Sign up')]")).click();	 
			driver.findElement(By.xpath("//input[@id='user']")).sendKeys("luke240294@gmail.com");
			driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("John@2024");
			driver.findElement(By.xpath("//input[@id='cpass']")).sendKeys("John@2024");
			driver.findElement(By.id("firstName")).sendKeys("luke");
			driver.findElement(By.id("lastName")).sendKeys("Skywalker");
			driver.findElement(By.id("phone")).sendKeys("9874561230");
			WebElement type = driver.findElement(By.xpath("//select[@id='user-type']"));
			Select user=new Select(type);
			user.selectByIndex(3);
			driver.findElement(By.xpath("//label[contains(text(),'I have read')]")).click();
			driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
			String msg = driver.findElement(By.xpath("//b[text()='Thank you for registering!']")).getText();
			System.out.println(msg);

	}

}
