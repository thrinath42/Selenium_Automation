package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webElementAssign1 {

	public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.vtiger.com/vtigercrm/");
			if(driver.getCurrentUrl().equals("https://demo.vtiger.com/vtigercrm/"))
				System.out.println("Welcome Page displayed");
			else
				System.out.println("Welcome Page not displayed");
			WebElement un = driver.findElement(By.id("username"));
			WebElement pwd = driver.findElement(By.id("password"));
			un.clear();
			Thread.sleep(2000);
			un.sendKeys("Testing",Keys.ENTER);
			pwd.clear();
			Thread.sleep(2000);
			pwd.sendKeys("Test@123",Keys.ENTER);
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[@type='submit'])[1]")).submit();

	}

}
