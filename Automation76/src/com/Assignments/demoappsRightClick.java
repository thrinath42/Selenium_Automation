package com.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demoappsRightClick {

	public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.get("https://demoapps.qspiders.com/");
			driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
			driver.findElement(By.linkText("Button")).click();
			driver.findElement(By.linkText("Right Click")).click();
			Actions act=new Actions(driver);
			act.contextClick(driver.findElement(By.cssSelector("button[id='btn30']"))).perform();
			driver.findElement(By.xpath("//div[text()='Yes']")).click();
			WebElement msg = driver.findElement(By.xpath("//span[contains(text(),'You selected')]"));
			System.out.println("message= "+msg.getText());
			System.out.println("color of the message= "+ msg.getCssValue("color"));
			

	}

}
