package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoVtigerColorCapture {

	public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.vtiger.com/vtigercrm/");
			WebElement un = driver.findElement(By.id("username"));
			un.clear();
			un.sendKeys("Testing");
			WebElement pwd = driver.findElement(By.id("password"));
			pwd.clear();
			pwd.sendKeys("ASJDHAH");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Sign in']")).submit();
			 WebElement warn = driver.findElement(By.xpath("//span[text()='Invalid credentials']"));
			System.out.println(warn.getText());
			System.out.println(warn.getCssValue("color"));
			if(warn.getCssValue("color").contains("255"))
				System.out.println("as per requirement");
			else
				System.out.println("not as per requirement");
			

	}

}
